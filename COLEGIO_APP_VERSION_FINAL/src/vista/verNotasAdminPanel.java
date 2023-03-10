/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Toshiba
 */
public class verNotasAdminPanel extends javax.swing.JPanel {
    private Principal principal;
    /**
     * Creates new form VerNotasPanel
     */
    public verNotasAdminPanel(Principal principal) {
        this.principal=principal;
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

        JLabelNotas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNotas = new javax.swing.JTextArea();
        jButtonCargarAlumno = new javax.swing.JButton();
        jButtonVolverDocente = new javax.swing.JButton();
        jTextFieldCodigoCarnet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigoAsig = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelNotas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLabelNotas.setText("Notas");
        add(JLabelNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jTextAreaNotas.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaNotas.setColumns(20);
        jTextAreaNotas.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaNotas.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaNotas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNotas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 780, 340));

        jButtonCargarAlumno.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCargarAlumno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCargarAlumno.setText("Cargar Notas");
        jButtonCargarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarAlumnoActionPerformed(evt);
            }
        });
        add(jButtonCargarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 150, 50));

        jButtonVolverDocente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolverDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolverDocente.setText("Volver");
        jButtonVolverDocente.setToolTipText("");
        jButtonVolverDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverDocenteActionPerformed(evt);
            }
        });
        add(jButtonVolverDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 150, 50));

        jTextFieldCodigoCarnet.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoCarnet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoCarnet.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Codigo del estudiante:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        jTextFieldCodigoAsig.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigoAsig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldCodigoAsig.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextFieldCodigoAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("codigo de asignatura:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCargarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarAlumnoActionPerformed
        cargarEstudiantes();
    }//GEN-LAST:event_jButtonCargarAlumnoActionPerformed

    private void jButtonVolverDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverDocenteActionPerformed
        principal.irAPanelAdmin();
        jTextFieldCodigoCarnet.setText("");
        jTextAreaNotas.setText("");
        jTextFieldCodigoAsig.setText("");
    }//GEN-LAST:event_jButtonVolverDocenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelNotas;
    private javax.swing.JButton jButtonCargarAlumno;
    private javax.swing.JButton jButtonVolverDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaNotas;
    private javax.swing.JTextField jTextFieldCodigoAsig;
    private javax.swing.JTextField jTextFieldCodigoCarnet;
    // End of variables declaration//GEN-END:variables


    private void cargarEstudiantes() {
        if (jTextFieldCodigoCarnet.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "escriba el codigo de un estudiante", "Estudiante", JOptionPane.INFORMATION_MESSAGE);
        } else if(jTextFieldCodigoAsig.getText().equals("")){
            JOptionPane.showMessageDialog(this, "escriba el codigo de una asignatura", "Estudiante", JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(validar()){
                cargarNotas();
            }
        }
    }
    
    private boolean validar(){
        try{
            Integer.parseInt(jTextFieldCodigoCarnet.getText());
            return true;
        }catch(NullPointerException | NumberFormatException e){
            JOptionPane.showMessageDialog(this, "algun dato esta escrito con el formato incorrecto", "Estudiante", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    private void cargarNotas() {
        int codigoCarnet = Integer.parseInt(jTextFieldCodigoCarnet.getText());
        String codigoAsig = jTextFieldCodigoAsig.getText();
        jTextAreaNotas.setText(principal.cargarNotasDelAlumno(codigoCarnet,codigoAsig));
    }
    
    
}
