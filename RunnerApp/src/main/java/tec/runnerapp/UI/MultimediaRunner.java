package tec.runnerapp.UI;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import tec.runnerapp.Multimedia;
import tec.runnerapp.MultimediaList;
import tec.runnerapp.Runner;
import tec.runnerapp.Time;
import tec.runnerapp.TimeList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author leine
 */
public class MultimediaRunner extends javax.swing.JFrame {

    /**
     * Creates new form MultimediaRunner
     */
    public MultimediaRunner(Runner runner) {
        initComponents();
        chargeImages(runner);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbImage = new javax.swing.JComboBox<>();
        labelImage = new javax.swing.JLabel();
        btnLeave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(854, 480));

        cmbImage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbImage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbImageActionPerformed(evt);
            }
        });

        labelImage.setText("jLabel1");

        btnLeave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLeave.setText("Salir");
        btnLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(cmbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cmbImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnLeaveActionPerformed

    private void cmbImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbImageActionPerformed
        Object select = cmbImage.getSelectedItem();
        if (select == null){
            return;
        }
        String selectString = select.toString();
        int index = Integer.parseInt(selectString.split(" ")[1]);
        Multimedia multimediaSelected = MultimediaList.getMultimediaByPosition(index - 1);
        // ajustar la imagen al tamaño del label
        ImageIcon imageIcon = new ImageIcon(multimediaSelected.getPhoto().getAbsolutePath());
        Image image1 = imageIcon.getImage().getScaledInstance(labelImage.getWidth(), labelImage.getHeight(), Image.SCALE_SMOOTH);
        //mostrar la imagen en el label
        labelImage.setIcon(new ImageIcon(image1));
    }//GEN-LAST:event_cmbImageActionPerformed

    //funcion para cargar el combo box
    private void chargeImages(Runner runner){
        //cargar imagenes
        cmbImage.removeAllItems();

        //recuperar lista multimedia
        ArrayList<Multimedia> multimedia = MultimediaList.getMultimediaByRunnerName(runner.getName());

        //llenar combo box
        //contador
        int i = 0;
        for (Multimedia m : multimedia){
            i++;
            cmbImage.addItem("Imagen " + i);
        }
        String select = cmbImage.getSelectedItem().toString();
        int index = Integer.parseInt(select.split(" ")[1]);
        Multimedia multimediaSelected = multimedia.get(index - 1);
        
        // ajustar la imagen al tamaño del label
        ImageIcon imageIcon = new ImageIcon(multimediaSelected.getPhoto().getAbsolutePath());
        Image image1 = imageIcon.getImage().getScaledInstance(labelImage.getWidth(), labelImage.getHeight(), Image.SCALE_SMOOTH);
        //mostrar la imagen en el label
        labelImage.setIcon(new ImageIcon(image1));

        
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
            java.util.logging.Logger.getLogger(MultimediaRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultimediaRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultimediaRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultimediaRunner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultimediaRunner(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeave;
    private javax.swing.JComboBox<String> cmbImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelImage;
    // End of variables declaration//GEN-END:variables
}