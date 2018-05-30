/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Persona;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class XMLpersonaManager {

    //attributes
    private Document document;
    public Element root;
    private String path;

    public XMLpersonaManager(String path) throws JDOMException, IOException {
        this.path = path;

        File filePersona = new File(path);
        if (filePersona.exists()) {
            //1. El archivo ya existe, entonces lo cargo en memoria

            //toma la estructura de datos y las carga en memoria
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setIgnoringElementContentWhitespace(true);

            //cargar en memoria
            this.document = saxBuilder.build(this.path);
            this.root = this.document.getRootElement();

        } else {
            //2. El archivo no existe, lo creo y lo guardo

            //creo el elemento raiz
            this.root = new Element("Persons");

            //creamos el documento
            this.document = new Document(this.root);

            //guardar el archivo en disco duro
            storeXML();
        }
    }//constructor

    /**
     * Stores the file on XML format
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void storeXML() throws FileNotFoundException, IOException {
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.output(this.document, new PrintWriter(this.path));
    }//storeXML

    /**
     * Inserts a person to the file
     *
     * @param person
     */
    public void insertPersona(Persona person) throws IOException {
        //Se crea el elemento con respecto a la persona
        Element personaElement = new Element("Person");
        //Se crea el id de la persona como un atributo
        personaElement.setAttribute("Identification", person.getId());

        //nombre
        Element pNameElement = new Element("Name");
        pNameElement.addContent(person.getName());

        //Apellido
        Element pLNameElement = new Element("LastName");
        pLNameElement.addContent(person.getLastName());

        //country
        Element countryElement = new Element("Country");
        countryElement.addContent(person.getCountry());

        //birthdate
        Element pBirthElement = new Element("BirthDate");
        pBirthElement.addContent(String.valueOf(person.getBirthDate()));

        //ParentId
        Element parentIdElement = new Element("ParentID");
        parentIdElement.addContent(person.getParentId());

        //agregar elementos a personaElement
        personaElement.addContent(pNameElement);
        personaElement.addContent(pLNameElement);
        personaElement.addContent(countryElement);
        personaElement.addContent(pBirthElement);
        personaElement.addContent(parentIdElement);

        //agregamos al root
        this.root.addContent(personaElement);

        //guardar en el disco duro
        storeXML();
    }//END insertPersona

    public Persona[] getAllPersonas() {
        //cantidad de personas en el archivo
        int personaQuant = this.root.getContentSize();
        //obtenemos una lista con todos los elementos de root
        java.util.List elementList = this.root.getChildren();
        //definir el tamaño del arreglo
        Persona[] personsArray = new Persona[personaQuant];
        //recorrer la lista para ir insertando en el arreglo
        int count = 0;
        for (Object currentObject : elementList) {
            //casting de object a element
            Element currentElement = (Element) currentObject;
            //crea la persona
            Persona currentPerson = new Persona();
            //id
            currentPerson.setId(currentElement.getAttributeValue("Identification"));
            //name
            currentPerson.setName(currentElement.getChild("Name").getValue());
            //lastName
            currentPerson.setLastName(currentElement.getChild("LastName").getValue());
            //ParentID
            currentPerson.setParentId(currentElement.getChild("ParentID").getValue());
            //Birthdate
            currentPerson.setBirthDate(Integer.parseInt(currentElement.getChild("BirthDate").getValue()));
            //country
            currentPerson.setCountry(currentElement.getChild("Country").getValue());
            //insertamos currentPerson en el array
            personsArray[count++] = currentPerson;
        }
        return personsArray;
    }//END getAllPersonas

    public ArrayList<Persona> arraytoAlist() {
        Persona[] pArray = getAllPersonas();
        ArrayList<Persona> pArrayList = new ArrayList<>(Arrays.asList(pArray));
        return pArrayList;
    }

    public void deletePersona(int num) throws IOException {
        java.util.List elementList = this.root.getChildren();
        elementList.remove(num);

        storeXML();
    }//END deletePersona

    public void deletePersonabyID(String id) throws IOException {
        int personaQuant = this.root.getContentSize();
        java.util.List elementList = this.root.getChildren();

        for (int i = 0; i < personaQuant; i++) {
            Element currentElement = (Element) elementList.get(i);
            if (currentElement.getAttributeValue("Identification").equals(id)) {
                elementList.remove(i);
            }
        }
        storeXML();
    }//END deletebyID

    public Persona search(String id, JTable table) throws IOException, JDOMException {
        Object fila[] = new Object[6];
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        int peopleQuantity = this.root.getContentSize();
        java.util.List elementList = this.root.getChildren();
        Persona currentPerson = null;

        //recorrer la lista para ir insertando en el arreglo
        for (int i = 0; i < peopleQuantity; i++) {
            Element currentElement = (Element) elementList.get(i);
            if (currentElement.getAttributeValue("Identification").equals(id)) {
                currentPerson = new Persona();
                //id
                currentPerson.setId(currentElement.getAttributeValue("Identification"));
                //name
                currentPerson.setName(currentElement.getChild("Name").getValue());
                //lastName
                currentPerson.setLastName(currentElement.getChild("LastName").getValue());
                //country
                currentPerson.setCountry(currentElement.getChild("Country").getValue());
                //ParentID
                currentPerson.setParentId(currentElement.getChild("ParentID").getValue());
                //Birthdate
                currentPerson.setBirthDate(Integer.parseInt(currentElement.getChild("BirthDate").getValue()));

                fila[0] = currentPerson.getId();
                fila[1] = currentPerson.getName();
                fila[2] = currentPerson.getLastName();
                fila[3] = currentPerson.getBirthDate();
                fila[4] = currentPerson.getCountry();
                fila[5] = currentPerson.getParentId();

                table.removeAll();
                modelo.addRow(fila);
                table.setModel(modelo);
            }
        }
        storeXML();
        return currentPerson;
    }//END of search

    public Persona modify(String id, JTextField name, JTextField lastName, JTextField country, JTextField birthDate, JTextField parentID) throws IOException {
        int personaQuant = this.root.getContentSize();
        java.util.List elementList = this.root.getChildren();
        Persona currentPerson = null;
        
        for (int i = 0; i < personaQuant; i++) {
            Element currentElement = (Element) elementList.get(i);
            if (currentElement.getAttributeValue("Identification").equals(id)) {
                currentPerson = new Persona();
                //id
                currentPerson.setId(currentElement.getAttributeValue("Identification"));
                //name
                currentPerson.setName(currentElement.getChild("Name").getValue());
                //lastName
                currentPerson.setLastName(currentElement.getChild("LastName").getValue());
                //country
                currentPerson.setCountry(currentElement.getChild("Country").getValue());
                //ParentID
                currentPerson.setParentId(currentElement.getChild("ParentID").getValue());
                //Birthdate
                currentPerson.setBirthDate(Integer.parseInt(currentElement.getChild("BirthDate").getValue()));
                
                name.setText(currentPerson.getName());
                lastName.setText(currentPerson.getLastName());
                country.setText(currentPerson.getCountry());
                birthDate.setText(currentPerson.getBirthDate()+"");
                parentID.setText(currentPerson.getParentId());
            }
        }
        storeXML();
        return currentPerson;
    }

}//END of class
