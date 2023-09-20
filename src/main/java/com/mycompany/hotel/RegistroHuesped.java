/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hotel;

import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import com.toedter.calendar.JDateChooser;

import Dao.HuespedDao;
import Model.Huesped;
import Model.Nacionalidad;
import Model.Reserva;

/**
 *
 * @author user
 */
public class RegistroHuesped extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private Reserva reservacion;

    public RegistroHuesped(Reserva reservacion) {
        this.reservacion = reservacion;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jDateChooser1 = new JDateChooser ();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        TextTelefono = new javax.swing.JTextField();
        ComBoxNacionalidad = new javax.swing.JComboBox<>();
        TextApellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        X = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BarraArriba = new javax.swing.JPanel();
        // </editor-fold>

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ha-100px.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        BtnRegistrar.setBackground(new java.awt.Color(0, 156, 233));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Continuar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnRegistrarLayout = new javax.swing.GroupLayout(BtnRegistrar);
        BtnRegistrar.setLayout(BtnRegistrarLayout);
        BtnRegistrarLayout.setHorizontalGroup(
            BtnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnRegistrarLayout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtnRegistrarLayout.setVerticalGroup(
            BtnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnRegistrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, 160, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 156, 233));
        jLabel4.setText("REGISTRO HUÉSPED");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("APELLIDO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 90, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("NOMBRE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        TextNombre.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        TextNombre.setBorder(null);
        getContentPane().add(TextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 270, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 156, 233));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 270, 10));

        jDateChooser1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 270, 40));

        jSeparator3.setForeground(new java.awt.Color(0, 156, 233));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 270, 10));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("FECHA DE NACIMIENTO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 240, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("NACIONALIDAD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 150, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("TELÉFONO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 120, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 156, 233));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 270, 10));

        TextTelefono.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        TextTelefono.setBorder(null);
        getContentPane().add(TextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 270, 40));

        ComBoxNacionalidad.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        ComBoxNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(Nacionalidad.values()));
        getContentPane().add(ComBoxNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 270, 30));

        TextApellido.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        TextApellido.setBorder(null);
        getContentPane().add(TextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 270, 40));

        jSeparator5.setForeground(new java.awt.Color(0, 156, 233));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 270, 10));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("NUMERO DE RESERVACIÓN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 240, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 156, 233));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 270, 10));

        X.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("X");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        X.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        getContentPane().add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrohuespe.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        BarraArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraArribaMouseDragged(evt);
            }
        });
        BarraArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraArribaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BarraArribaLayout = new javax.swing.GroupLayout(BarraArriba);
        BarraArriba.setLayout(BarraArribaLayout);
        BarraArribaLayout.setHorizontalGroup(
            BarraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        BarraArribaLayout.setVerticalGroup(
            BarraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(BarraArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 30));

        pack();
    }

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        BtnRegistrar.setBackground(new Color(0, 170, 240));
    }

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        BtnRegistrar.setBackground(new Color(0, 156, 233));
    }

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        LocalDate Datete = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Huesped huesped = new Huesped(TextNombre.getText(), TextApellido.getText(), Datete.toString(), ComBoxNacionalidad.getSelectedItem(), TextTelefono.getText(), reservacion);
        HuespedDao conn = new HuespedDao();
        conn.Guardar(huesped);

        javax.swing.JOptionPane.showMessageDialog(null, "Nueva Reservacion realizada");
        MenuUsuarior in = new MenuUsuarior();
        in.setVisible(true);
        this.dispose();
    }

    private void BarraArribaMousePressed(java.awt.event.MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    private void BarraArribaMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getX();
        int y = evt.getY();
        this.setLocation(this.getX() + x - xMouse, this.getY() + y - yMouse);
        repaint();
    }

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroHuesped(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraArriba;
    private javax.swing.JPanel BtnRegistrar;
    private javax.swing.JComboBox<Nacionalidad> ComBoxNacionalidad;
    private javax.swing.JTextField TextApellido;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JPanel X;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration//GEN-END:variables
}
