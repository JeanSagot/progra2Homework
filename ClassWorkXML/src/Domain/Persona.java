/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Equipo
 */
public class Persona {
    //attributes
    private String id;
    private String name;
    private String lastName;
    private int birthDate;
    private String country;
    private String parentId;
    
    //constructors
    public Persona(String id, String name, String lastName, int birthDate, String country, String parentId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.country = country;
        this.parentId = parentId;
    }
    
    
    public Persona() {
    }
    
    
    //getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    
    //toString method
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthDate=" + birthDate + ", country=" + country + ", parentId=" + parentId + '}';
    }//toString
}//END of class
