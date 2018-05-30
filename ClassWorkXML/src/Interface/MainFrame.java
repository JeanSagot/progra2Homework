package Interface;

import Data.XMLpersonaManager;
import Domain.Persona;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdom.JDOMException;

public class MainFrame extends javax.swing.JFrame {

    XMLpersonaManager newXMLPersonas;
    DefaultTableModel modelo;

    public MainFrame() throws JDOMException, IOException {
        this.newXMLPersonas = new XMLpersonaManager("./persondata/Personas.xml");
        initComponents();
        jb_saveMod.setVisible(false);
    }

    public void llenaTabla() {

    }

    //AUTO-Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Title = new javax.swing.JLabel();
        jl_idParent = new javax.swing.JLabel();
        jl_personName = new javax.swing.JLabel();
        jl_idPerson = new javax.swing.JLabel();
        jl_lastName = new javax.swing.JLabel();
        jtf_parentID = new javax.swing.JTextField();
        jtf_personId = new javax.swing.JTextField();
        jtf_lastName = new javax.swing.JTextField();
        jtf_name = new javax.swing.JTextField();
        jl_birthDate = new javax.swing.JLabel();
        jl_IDMember = new javax.swing.JLabel();
        jb_insert = new javax.swing.JButton();
        jb_update = new javax.swing.JButton();
        jtf_birthDate = new javax.swing.JTextField();
        jtf_member = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_hierarchy = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jl_searchInfo = new javax.swing.JLabel();
        jtf_deletePerson = new javax.swing.JTextField();
        jb_removebyID = new javax.swing.JButton();
        jl_country1 = new javax.swing.JLabel();
        jtf_country = new javax.swing.JTextField();
        jb_searchMember = new javax.swing.JButton();
        jl_member1 = new javax.swing.JLabel();
        jtf_searchMember = new javax.swing.JTextField();
        jb_refresh = new javax.swing.JButton();
        jb_saveMod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_Title.setText("Family Tree");
        getContentPane().add(jl_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 151, 27));

        jl_idParent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_idParent.setText("ID member parent");
        getContentPane().add(jl_idParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, -1, 33));

        jl_personName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_personName.setText("Name");
        getContentPane().add(jl_personName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 204, 105, 33));

        jl_idPerson.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_idPerson.setText("ID person");
        getContentPane().add(jl_idPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 105, 33));

        jl_lastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_lastName.setText("Lastname");
        getContentPane().add(jl_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 105, 33));
        getContentPane().add(jtf_parentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 99, 167, 33));
        getContentPane().add(jtf_personId, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 153, 167, 33));
        getContentPane().add(jtf_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 255, 167, 33));
        getContentPane().add(jtf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 204, 167, 33));

        jl_birthDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_birthDate.setText("BirthDate");
        getContentPane().add(jl_birthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 150, 105, 33));

        jl_IDMember.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_IDMember.setText("ID Member");
        getContentPane().add(jl_IDMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 105, 33));

        jb_insert.setText("Insert");
        jb_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_insertActionPerformed(evt);
            }
        });
        getContentPane().add(jb_insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 306, 70, -1));

        jb_update.setText("Update");
        jb_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_updateActionPerformed(evt);
            }
        });
        getContentPane().add(jb_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 306, -1, -1));
        getContentPane().add(jtf_birthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 167, 33));
        getContentPane().add(jtf_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 167, 33));

        jt_hierarchy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ParentID", "PersonID", "Name", "LastName", "Country", "BirthDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_hierarchy);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 1010, 340));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 10, 310));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 342, 1010, 10));

        jl_searchInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_searchInfo.setText("PersonInfo");
        getContentPane().add(jl_searchInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 105, 33));
        getContentPane().add(jtf_deletePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 180, 30));

        jb_removebyID.setText("Remove");
        jb_removebyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_removebyIDActionPerformed(evt);
            }
        });
        getContentPane().add(jb_removebyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 90, -1));

        jl_country1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_country1.setText("Country");
        getContentPane().add(jl_country1, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 96, 105, 33));
        getContentPane().add(jtf_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 167, 33));

        jb_searchMember.setText("Search");
        jb_searchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_searchMemberActionPerformed(evt);
            }
        });
        getContentPane().add(jb_searchMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, -1, -1));

        jl_member1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_member1.setText("Member");
        getContentPane().add(jl_member1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 105, 33));
        getContentPane().add(jtf_searchMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 167, 33));

        jb_refresh.setText("Refresh");
        jb_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(jb_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jb_saveMod.setText("Guardar");
        jb_saveMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_saveModActionPerformed(evt);
            }
        });
        getContentPane().add(jb_saveMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 307, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cleanSpace() {
        jtf_birthDate.setText("");
        jtf_member.setText("");
        jtf_personId.setText("");
        jtf_lastName.setText("");
        jtf_name.setText("");
        jtf_parentID.setText("");
        jtf_country.setText("");
        jtf_member.setText("");
    }

    /**
     * Inserta la persona en el xml
     *
     * @param evt
     */
    private void jb_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_insertActionPerformed
        if (!"".equals(jtf_birthDate.getText()) && !"".equals(jtf_country.getText())
                && !"".equals(jtf_lastName.getText()) && !"".equals(jtf_name.getText())
                && !"".equals(jtf_parentID.getText()) && !"".equals(jtf_personId.getText())) {
            try {
                Persona newPerson = new Persona(jtf_personId.getText(), jtf_name.getText(),
                        jtf_lastName.getText(), Integer.parseInt(jtf_birthDate.getText()), jtf_country.getText(),
                        jtf_parentID.getText());
                newXMLPersonas.insertPersona(newPerson);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Se inserto la persona con exito");
            cleanSpace();

        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los espacios porfavor");
        }
    }//GEN-LAST:event_jb_insertActionPerformed

    private void jb_removebyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_removebyIDActionPerformed
        if (!"".equals(jtf_deletePerson.getText())) {
            try {
                newXMLPersonas.deletePersonabyID(jtf_deletePerson.getText());
                JOptionPane.showMessageDialog(null, "Se ha borrado el usuario exitosamente.");
                jtf_deletePerson.setText("");
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un dato valido");
        }

    }//GEN-LAST:event_jb_removebyIDActionPerformed

    private void jb_searchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_searchMemberActionPerformed
        if (!"".equals(jtf_searchMember.getText())) {
            try {
                newXMLPersonas.search(jtf_searchMember.getText(), jt_hierarchy);
                jtf_searchMember.setText("");
            } catch (IOException | JDOMException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un dato valido");
        }
    }//GEN-LAST:event_jb_searchMemberActionPerformed

    private void jb_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_updateActionPerformed
        if (!"".equals(jtf_personId.getText())) {
            try {
                newXMLPersonas.modify(jtf_personId.getText(), jtf_name, jtf_lastName, jtf_country, jtf_birthDate, jtf_parentID);
                jtf_personId.setEnabled(false);
                jtf_parentID.setEnabled(false);
                jb_saveMod.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un dato valido");
        }
    }//GEN-LAST:event_jb_updateActionPerformed

    private void jb_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_refreshActionPerformed

    private void jb_saveModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_saveModActionPerformed
        if (!"".equals(jtf_birthDate.getText()) && !"".equals(jtf_country.getText())
                && !"".equals(jtf_lastName.getText()) && !"".equals(jtf_name.getText())
                && !"".equals(jtf_parentID.getText()) && !"".equals(jtf_personId.getText())) {
            if (!"".equals(jtf_personId.getText())) {
                try {
                    newXMLPersonas.deletePersonabyID(jtf_personId.getText());
                    Persona newPerson = new Persona(jtf_personId.getText(), jtf_name.getText(),
                            jtf_lastName.getText(), Integer.parseInt(jtf_birthDate.getText()), jtf_country.getText(),
                            jtf_parentID.getText());
                    newXMLPersonas.insertPersona(newPerson);
                    jtf_personId.setEnabled(true);
                    jtf_parentID.setEnabled(true);
                    cleanSpace();
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_jb_saveModActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (JDOMException | IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jb_insert;
    private javax.swing.JButton jb_refresh;
    private javax.swing.JButton jb_removebyID;
    private javax.swing.JButton jb_saveMod;
    private javax.swing.JButton jb_searchMember;
    private javax.swing.JButton jb_update;
    private javax.swing.JLabel jl_IDMember;
    private javax.swing.JLabel jl_Title;
    private javax.swing.JLabel jl_birthDate;
    private javax.swing.JLabel jl_country1;
    private javax.swing.JLabel jl_idParent;
    private javax.swing.JLabel jl_idPerson;
    private javax.swing.JLabel jl_lastName;
    private javax.swing.JLabel jl_member1;
    private javax.swing.JLabel jl_personName;
    private javax.swing.JLabel jl_searchInfo;
    private javax.swing.JTable jt_hierarchy;
    private javax.swing.JTextField jtf_birthDate;
    private javax.swing.JTextField jtf_country;
    private javax.swing.JTextField jtf_deletePerson;
    private javax.swing.JTextField jtf_lastName;
    private javax.swing.JTextField jtf_member;
    private javax.swing.JTextField jtf_name;
    private javax.swing.JTextField jtf_parentID;
    private javax.swing.JTextField jtf_personId;
    private javax.swing.JTextField jtf_searchMember;
    // End of variables declaration//GEN-END:variables
}
