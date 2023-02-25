/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Asignatura;
import modelo.Curso;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Grado;

/**
 *
 * @author oscar
 */
public class PanelAdmin extends javax.swing.JPanel {
    Principal principal;
    /**
     * Creates new form PanelAdmin
     */
    public PanelAdmin(Principal principal) {
        this.principal = principal;
        initComponents();
    }
    /**
     * metodo para ir al panel de crear estudiante
     */
    protected void irACrearEstudiante(){
       principal.irACrearEstudiante();
    }
    /**
     * metodo para ir al panel de crear docentes
     */
    protected void irACrearDocentes(){
        principal.irACrearDocente();
    }
    /**
     * metodo para ir al panel de iniciar sesion
     */
    protected void irAPanelSesion(){
        principal.irAPanelSesion();
    }
    
    protected void irACrearAsignatura(){
        principal.irACrearAsignatura();
    }
   
    protected void irACrearCurso(){
        principal.irACrearCurso();
    }
    
    protected void irACrearGrado(){
        principal.irACrearGrado();
    }
    protected void irACrearAdmin(){
        principal.irAPanelCrearAdmin();
    }
    private void irAPanelVerNotas() {
        principal.irAPanelVerNotas();
    }
    private void irActivarNotas() {
        principal.irActivarNotas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCrearDocente = new javax.swing.JButton();
        jLabelAdministrador = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonCrearGrado = new javax.swing.JButton();
        jButtonCrearAsignaturas = new javax.swing.JButton();
        jButtonHabilitarFechas = new javax.swing.JButton();
        jButtonCrearEstudiante = new javax.swing.JButton();
        jButtonCambiarNotas = new javax.swing.JButton();
        jButtonCrearAdmin = new javax.swing.JButton();
        jButtonCrearCursos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setAutoscrolls(true);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCrearDocente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCrearDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearDocente.setForeground(new java.awt.Color(255, 51, 102));
        jButtonCrearDocente.setText("Contratar Docente");
        jButtonCrearDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearDocenteActionPerformed(evt);
            }
        });
        add(jButtonCrearDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 180, 40));

        jLabelAdministrador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelAdministrador.setForeground(new java.awt.Color(51, 51, 255));
        jLabelAdministrador.setText("OPCION ADMIN");
        add(jLabelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, -90, 340, 280));

        jButtonSalir.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 51, 102));
        jButtonSalir.setText("Cerrar Sesion");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, 40));

        jButtonCrearGrado.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCrearGrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearGrado.setForeground(new java.awt.Color(255, 51, 102));
        jButtonCrearGrado.setText("Registrar Grado");
        jButtonCrearGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearGradoActionPerformed(evt);
            }
        });
        add(jButtonCrearGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 170, 44));

        jButtonCrearAsignaturas.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCrearAsignaturas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearAsignaturas.setForeground(new java.awt.Color(255, 51, 102));
        jButtonCrearAsignaturas.setText("Registrar Asignatura");
        jButtonCrearAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearAsignaturasActionPerformed(evt);
            }
        });
        add(jButtonCrearAsignaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 190, 40));

        jButtonHabilitarFechas.setBackground(new java.awt.Color(102, 102, 102));
        jButtonHabilitarFechas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonHabilitarFechas.setForeground(new java.awt.Color(255, 51, 102));
        jButtonHabilitarFechas.setText("Habilitar Fecha");
        jButtonHabilitarFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHabilitarFechasActionPerformed(evt);
            }
        });
        add(jButtonHabilitarFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, 40));

        jButtonCrearEstudiante.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCrearEstudiante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearEstudiante.setForeground(new java.awt.Color(255, 51, 102));
        jButtonCrearEstudiante.setText("Matricular Estudiante");
        jButtonCrearEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearEstudianteActionPerformed(evt);
            }
        });
        add(jButtonCrearEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 180, 40));

        jButtonCambiarNotas.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCambiarNotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCambiarNotas.setForeground(new java.awt.Color(255, 51, 102));
        jButtonCambiarNotas.setText("Ver Notas");
        jButtonCambiarNotas.setToolTipText("");
        jButtonCambiarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarNotasActionPerformed(evt);
            }
        });
        add(jButtonCambiarNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 130, 40));

        jButtonCrearAdmin.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCrearAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearAdmin.setForeground(new java.awt.Color(255, 51, 102));
        jButtonCrearAdmin.setText("Contratar Administrador");
        jButtonCrearAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearAdminActionPerformed(evt);
            }
        });
        add(jButtonCrearAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 210, 40));

        jButtonCrearCursos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCrearCursos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearCursos.setForeground(new java.awt.Color(255, 51, 102));
        jButtonCrearCursos.setText("Registrar Curso");
        jButtonCrearCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCursosActionPerformed(evt);
            }
        });
        add(jButtonCrearCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondos-blackberry-wallpapers.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
       irAPanelSesion();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonCambiarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarNotasActionPerformed
        irAPanelVerNotas();
    }//GEN-LAST:event_jButtonCambiarNotasActionPerformed

    private void jButtonCrearCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCursosActionPerformed
       irACrearCurso();
    }//GEN-LAST:event_jButtonCrearCursosActionPerformed

    private void jButtonCrearAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearAsignaturasActionPerformed
       irACrearAsignatura();
    }//GEN-LAST:event_jButtonCrearAsignaturasActionPerformed

    private void jButtonCrearGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearGradoActionPerformed
       irACrearGrado();
    }//GEN-LAST:event_jButtonCrearGradoActionPerformed

    private void jButtonCrearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearEstudianteActionPerformed
       irACrearEstudiante();
    }//GEN-LAST:event_jButtonCrearEstudianteActionPerformed

    private void jButtonCrearDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearDocenteActionPerformed
        irACrearDocentes();
    }//GEN-LAST:event_jButtonCrearDocenteActionPerformed

    private void jButtonCrearAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearAdminActionPerformed
       irACrearAdmin();
    }//GEN-LAST:event_jButtonCrearAdminActionPerformed

    private void jButtonHabilitarFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHabilitarFechasActionPerformed
       irActivarNotas();
    }//GEN-LAST:event_jButtonHabilitarFechasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambiarNotas;
    private javax.swing.JButton jButtonCrearAdmin;
    private javax.swing.JButton jButtonCrearAsignaturas;
    private javax.swing.JButton jButtonCrearCursos;
    private javax.swing.JButton jButtonCrearDocente;
    private javax.swing.JButton jButtonCrearEstudiante;
    private javax.swing.JButton jButtonCrearGrado;
    private javax.swing.JButton jButtonHabilitarFechas;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdministrador;
    // End of variables declaration//GEN-END:variables

    

    

    
}
