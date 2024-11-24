/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import TDA.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author YANCE VALENZUELA Anthony 20224203[ultima Entrega] &&David Eduardo Vilela Rivera 20222786 [ULTIMA ENTREGA]
 */
public class Reporte extends javax.swing.JFrame {

    ListaMesasElectoral ListaMesasPrint;

    /**
     * Creates new form Report
     */
    public Reporte() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        txtAreaReporte.setEditable(false);
    }

    public Reporte(ListaMesasElectoral listaprint) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbVotosTotales = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbVotosNulo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbVotosBlanco = new javax.swing.JLabel();
        btnConteoGeneral = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbElecciones = new javax.swing.JLabel();
        lbFechaElecciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReporte = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ventanaEleciones = new javax.swing.JMenuItem();
        menuBarCandidato = new javax.swing.JMenuItem();
        menuBarMesaElectoral = new javax.swing.JMenuItem();

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(18, 38, 63));
        jLabel1.setText("Votos Totales");

        lbVotosTotales.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbVotosTotales.setForeground(new java.awt.Color(18, 38, 63));
        lbVotosTotales.setText("0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVotosTotales)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbVotosTotales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setForeground(new java.awt.Color(18, 38, 63));
        jLabel2.setText("Votos Nulos");

        lbVotosNulo.setBackground(new java.awt.Color(244, 248, 232));
        lbVotosNulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbVotosNulo.setForeground(new java.awt.Color(18, 38, 63));
        lbVotosNulo.setText("0000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(lbVotosNulo))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVotosNulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setForeground(new java.awt.Color(18, 38, 63));
        jLabel3.setText("Votos Blancos");

        lbVotosBlanco.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbVotosBlanco.setForeground(new java.awt.Color(18, 38, 63));
        lbVotosBlanco.setText("0000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVotosBlanco)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVotosBlanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        btnConteoGeneral.setBackground(new java.awt.Color(255, 223, 131));
        btnConteoGeneral.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConteoGeneral.setForeground(new java.awt.Color(162, 99, 50));
        btnConteoGeneral.setText("Actualizar Conteo General");
        btnConteoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConteoGeneralActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 223, 131));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(162, 99, 50));
        btnActualizar.setText("F5");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 38, 63));
        jLabel4.setText("Mesas Electorales:");

        lbElecciones.setBackground(new java.awt.Color(255, 255, 255));
        lbElecciones.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbElecciones.setForeground(new java.awt.Color(18, 38, 63));
        lbElecciones.setText("Elecciones generales");
        lbElecciones.setToolTipText("");

        lbFechaElecciones.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbFechaElecciones.setForeground(new java.awt.Color(102, 102, 102));
        lbFechaElecciones.setText("00/00/00");

        txtAreaReporte.setColumns(20);
        txtAreaReporte.setRows(5);
        jScrollPane1.setViewportView(txtAreaReporte);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(78, 78, 78)
                                .addComponent(btnConteoGeneral))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lbElecciones))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFechaElecciones)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbElecciones)
                .addGap(18, 18, 18)
                .addComponent(lbFechaElecciones)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnConteoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMenu1.setText("Registro");

        ventanaEleciones.setText("Eleciones");
        ventanaEleciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaElecionesActionPerformed(evt);
            }
        });
        jMenu1.add(ventanaEleciones);

        menuBarCandidato.setText("Candidato");
        menuBarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarCandidatoActionPerformed(evt);
            }
        });
        jMenu1.add(menuBarCandidato);

        menuBarMesaElectoral.setText("Mesa Electoral");
        menuBarMesaElectoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarMesaElectoralActionPerformed(evt);
            }
        });
        jMenu1.add(menuBarMesaElectoral);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarCandidatoActionPerformed

        RegistroCandidato registroCandidato = new RegistroCandidato();
        registroCandidato.setVisible(true);
    }//GEN-LAST:event_menuBarCandidatoActionPerformed

    private void menuBarMesaElectoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarMesaElectoralActionPerformed
        RegistroMesa registroMesa = new RegistroMesa();
        registroMesa.setVisible(true);
    }//GEN-LAST:event_menuBarMesaElectoralActionPerformed
       //David Eduardo Vilela Rivera 20222786 "btnConteoGeneralActionPerformed"[ULTIMA ENTREGA]
    private void btnConteoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConteoGeneralActionPerformed
        ListaMesasPrint = RegistroMesa.getListaGeneral(); // Obtener la lista de mesas desde RegistroMesa

        if (ListaMesasPrint != null) {
            int totalVotosBlancos = ListaMesasPrint.ContarVotosBlancos();
            int totalVotosNulos = ListaMesasPrint.ContarVotosNulos();
            int totalVotosTotales = ListaMesasPrint.ContarVotosTotales();
                       
            lbVotosBlanco.setText(String.valueOf(totalVotosBlancos));
            lbVotosNulo.setText(String.valueOf(totalVotosNulos));
            lbVotosTotales.setText(String.valueOf(totalVotosTotales));
            generarReporte() ;// Actualizar labels con los valores acumulados

        } else {
            // Si no hay datos, establecer valores predeterminados
            lbVotosBlanco.setText("0000");
            lbVotosNulo.setText("0000");
            lbVotosTotales.setText("0000");
        }


    }//GEN-LAST:event_btnConteoGeneralActionPerformed

    private void ventanaElecionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaElecionesActionPerformed
        RegistroEleciones registroElecciones = new RegistroEleciones();
        registroElecciones.setVisible(true);
    }//GEN-LAST:event_ventanaElecionesActionPerformed
     // YANCE VALENZUELA Anthony 20224203-btnActualizarActionPerformed-[ultima Entrega] 
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        Elecciones elecciones = RegistroEleciones.getEleccionesGenerales();

        if (elecciones != null) {
            lbElecciones.setText("Elecciónes : " + elecciones.getTipoEleccion());
            lbFechaElecciones.setText(elecciones.getFecha());
        } else {
            lbElecciones.setText("Elecciones :");
            lbFechaElecciones.setText("--/--/--");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    
    // YANCE VALENZUELA Anthony 20224203-generarReporte-[ultima Entrega] 
    private void generarReporte() {
        // Verificar si la lista de mesas está vacía
        if (ListaMesasPrint == null || ListaMesasPrint.vacia()) {
            JOptionPane.showMessageDialog(this,
                    "No hay mesas registradas para generar el reporte.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            txtAreaReporte.setText("No hay datos disponibles para generar el reporte.");
            return;
        }

        StringBuilder reporte = new StringBuilder();
        reporte.append("======================================================================\n");
        reporte.append("                                                                     Resultados Generales\n\n");

        // Obtener totales generales
        int totalVotosRegistrados = ListaMesasPrint.ContarVotosRegistrados();
        int totalVotosTotales = ListaMesasPrint.ContarVotosTotales();
        int totalVotosBlancos = ListaMesasPrint.ContarVotosBlancos();
        int totalVotosNulos = ListaMesasPrint.ContarVotosNulos();

        // Calcular votos válidos
        int totalVotosValidos = totalVotosTotales - totalVotosBlancos - totalVotosNulos;

        // Mostrar porcentajes generales por candidato
        Map<String, Integer> votosPorCandidato = new HashMap<>();
        NodoMesaElectoral actualMesa = ListaMesasPrint.getL();
        while (actualMesa != null) {
            ActaElectoral acta = actualMesa.getMesaElectoral().getActaElectoral();
            NodoCandidatos actualCandidato = acta.getColaCandidatos().getFront();
            while (actualCandidato != null) {
                Candidato candidato = actualCandidato.getCandidato();
                votosPorCandidato.put(
                        candidato.getNombre(),
                        votosPorCandidato.getOrDefault(candidato.getNombre(), 0) + candidato.getVotos()
                );
                actualCandidato = actualCandidato.getNext();
            }
            actualMesa = actualMesa.getNext();
        }

        // Formatear resultados generales
        votosPorCandidato.forEach((nombre, votos) -> {
            double porcentaje = (totalVotosTotales > 0) ? ((double) votos / totalVotosTotales) * 100 : 0;
            reporte.append("Candidato ").append(nombre).append(" : ").append(String.format("%.2f", porcentaje)).append("%    ");
        });
        reporte.append("\n======================================================================\n");

        // Resultados por mesa
        actualMesa = ListaMesasPrint.getL();
        while (actualMesa != null) {
            MesaElectoral mesa = actualMesa.getMesaElectoral();
            ActaElectoral acta = mesa.getActaElectoral();

            if (acta != null) {
                reporte.append("---------------------------------------------------------------------------------------------------------------\n");
                reporte.append("Resultados por mesa: ").append(mesa.getnMesa()).append("\n\n");
                reporte.append("Votos en mesa:\n\n");

                // Resultados por candidato en esta mesa
                NodoCandidatos actualCandidato = acta.getColaCandidatos().getFront();
                while (actualCandidato != null) {
                    Candidato candidato = actualCandidato.getCandidato();
                    reporte.append("Candidato ").append(candidato.getNombre()).append(" : ").append(candidato.getVotos()).append("    ");
                    actualCandidato = actualCandidato.getNext();
                }

                // Resultados totales de la mesa
                reporte.append("\n\n");
                reporte.append("votoTotal de la mesa: ").append(acta.getVotoTotal())
                        .append("     voto nulos de la mesa: ").append(acta.getVotoNulo())
                        .append("     voto blancos de la mesa: ").append(acta.getVotoBlanco()).append("\n");
            }

            actualMesa = actualMesa.getNext();
        }

        reporte.append("---------------------------------------------------------------------------------------------------------------\n");

        // Mostrar el reporte en el JTextArea
        txtAreaReporte.setText(reporte.toString());
    }

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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConteoGeneral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbElecciones;
    private javax.swing.JLabel lbFechaElecciones;
    private javax.swing.JLabel lbVotosBlanco;
    private javax.swing.JLabel lbVotosNulo;
    private javax.swing.JLabel lbVotosTotales;
    private javax.swing.JMenuItem menuBarCandidato;
    private javax.swing.JMenuItem menuBarMesaElectoral;
    private javax.swing.JTextArea txtAreaReporte;
    private javax.swing.JMenuItem ventanaEleciones;
    // End of variables declaration//GEN-END:variables
}
