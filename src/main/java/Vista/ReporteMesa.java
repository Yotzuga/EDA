/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import javax.swing.JFrame;

/**
 *
 * @author Fabricio Eduardo Placido Chambi 20221977[ultima Entrega] &&Sebastián Montenegro Carrillo 20223756 [ultima Entrega]
 */
public class ReporteMesa extends javax.swing.JFrame {

    private MesaElectoral mesaInsta;

    /**
     * Creates new form ReporteMesa
     */
    public ReporteMesa() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        txtAreaReporteMesa.setEditable(false);
    }

    public ReporteMesa(MesaElectoral mesa) {
        initComponents(); // Inicializa los componentes gráficos
        mesaInsta = mesa; // Guardamos la mesa en el objeto
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra la ventana cuando se termine
        generarReporte(); // Llamamos a la función para generar el reporte
    }
    //Fabricio Eduardo Placido Chambi 20221977-generarReporte-[ultima Entrega] &&Sebastián Montenegro Carrillo 20223756 -generarReporte-[ultima Entrega]
    // Este método genera el reporte y lo muestra en el JTextArea
    private void generarReporte() {
        StringBuilder reporte = new StringBuilder();
        // Título principal
        reporte.append("----------------------- INFORME GENERAL DE LA MESA ELECTORAL ------------------------------\n");
        reporte.append("Número de Mesa: ").append(mesaInsta.getnMesa()).append("\n");

        // Información de los miembros de la mesa electoral
        reporte.append("Miembros de la Mesa Electoral:\n");
        reporte.append(mesaInsta.getPilaMiebros().printString()).append("\n");

        // Información del acta electoral
        ActaElectoral acta = mesaInsta.getActaElectoral();
        if (acta != null) {
            reporte.append("\nActa Electoral:\n");
            reporte.append("Título: ").append(acta.getTitulo()).append("\n");
            reporte.append("Fecha: ").append(acta.getFecha()).append("\n");
            reporte.append("Número de Mesa: ").append(acta.getnMesa()).append("\n");
            reporte.append("Votantes Registrados: ").append(acta.getVotantesRegistradosAc()).append("\n");
            reporte.append("Votos Blancos: ").append(acta.getVotoBlanco()).append("\n");
            reporte.append("Votos Nulos: ").append(acta.getVotoNulo()).append("\n");
            reporte.append("Votos Totales: ").append(acta.getVotoTotal()).append("\n");
            reporte.append("Observaciones: ").append(acta.getObs()).append("\n");
        } else {
            reporte.append("\nNo se ha registrado un acta electoral.\n");
        }

        // Información de los candidatos
        reporte.append("\nLista de Candidatos:\n");
        reporte.append(mesaInsta.getActaElectoral().getColaCandidatos().printString()).append("\n");

        // Separador final
        reporte.append("--------------------------------------------------------------------------------------------");

        // Mostrar el reporte en el JTextArea
        txtAreaReporteMesa.setText(reporte.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReporteMesa = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaReporteMesa.setColumns(20);
        txtAreaReporteMesa.setRows(5);
        jScrollPane1.setViewportView(txtAreaReporteMesa);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(btnAceptar)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.dispose(); // Cierra la ventana ReporteMesa
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaReporteMesa;
    // End of variables declaration//GEN-END:variables
}