/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital.hospital.forms;
import  hospital.hospital.forms.Acasa;
import hospital.hospital.clase.DBClass;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Lime
 */
public class Inregistrare_diagnostic extends javax.swing.JFrame {

    /**
     * Creates new form Inregistrare_diagnostic
     */
    DBClass db = new DBClass();
    public Inregistrare_diagnostic() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        salvare = new javax.swing.JButton();
        inapoi = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        d_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriere = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        diagnostic = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagnostice = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(806, 531));
        setSize(new java.awt.Dimension(800, 531));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Inregistrare Diagnostic");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Diagnostic");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 114, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ID diagnostic");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Descriere");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 114, -1));

        salvare.setBackground(new java.awt.Color(255, 153, 0));
        salvare.setText("Salvare");
        salvare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvareActionPerformed(evt);
            }
        });
        getContentPane().add(salvare, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));

        inapoi.setBackground(new java.awt.Color(255, 153, 51));
        inapoi.setText("Inapoi");
        inapoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inapoiActionPerformed(evt);
            }
        });
        getContentPane().add(inapoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, -1));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                comboMouseMoved(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        getContentPane().add(d_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 338, -1));

        descriere.setColumns(20);
        descriere.setRows(5);
        jScrollPane1.setViewportView(descriere);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 338, 70));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("ID Pacient");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 111, -1));
        getContentPane().add(diagnostic, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 338, -1));

        diagnostice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id diagnostic", "diagnostic", "descriere", "id_pacient"
            }
        ));
        jScrollPane2.setViewportView(diagnostice);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 560, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/hospital/forms/2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_comboMouseMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try
        {
            db.fillCombo(combo,"select Pid from inregistrare_pacient");
            db.fillTable(diagnostice,"select * from diagnostice");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Eroare");
        }
    }//GEN-LAST:event_formWindowActivated

    private void salvareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvareActionPerformed
        // TODO add your handling code here:
        if(d_id.getText().equals("") || descriere.getText().equals("")|| d_id.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null,"Introdu toate datele corect!");
        }
        else
        {
             Integer p_id_diag = Integer.parseInt(d_id.getText());
             String pdiagnostic = diagnostic.getText();
             String pdescriere = descriere.getText();
             String pid = (String) combo.getSelectedItem();
             try{
                 db.execute("insert into diagnostice values (?,?,?,?)",p_id_diag,pdiagnostic,pdescriere,pid);
                 JOptionPane.showMessageDialog(null,"Diagnostic adaugat cu succes pentru pacient cu id = "+pid);
                 
                setVisible(false);
                new Acasa().setVisible(true);
             }catch(HeadlessException e1)
             {
                 JOptionPane.showMessageDialog(null,"Eroare Aduagre diagnostic!");
             }
        }
        
    }//GEN-LAST:event_salvareActionPerformed

    private void inapoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inapoiActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Acasa().setVisible(true);
    }//GEN-LAST:event_inapoiActionPerformed

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
            java.util.logging.Logger.getLogger(Inregistrare_diagnostic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inregistrare_diagnostic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inregistrare_diagnostic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inregistrare_diagnostic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inregistrare_diagnostic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField d_id;
    private javax.swing.JTextArea descriere;
    private javax.swing.JTextField diagnostic;
    private javax.swing.JTable diagnostice;
    private javax.swing.JButton inapoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton salvare;
    // End of variables declaration//GEN-END:variables
}