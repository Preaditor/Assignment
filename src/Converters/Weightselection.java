/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converters;
import Data.AppData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author adam
 */
public class Weightselection extends javax.swing.JFrame {

    /**
     * Creates new form Weightselection
     */
    //setup communication for AppData
    private final AppData appData;
    public Weightselection(AppData appData) {
        //general form setup
        this.appData = appData;
        initComponents();
        getContentPane().setBackground(new Color(66,122,244));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gram", "Kilogram", "Ounce", "Pound", "Stone" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gram", "Kilogram", "Ounce", "Pound", "Stone" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // logic for which conversion to perform and its calculation
        String op1 = (String) jComboBox1.getSelectedItem();
        String op2 = (String) jComboBox2.getSelectedItem();
        if (op1.equals("Gram") && op2.equals("Kilogram") ){
            String g = jTextField1.getText();
            float gf = Float.valueOf(g);
            float ans;
            ans = (float) (gf/1000);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Kg");
        }
        else if (op1.equals("Gram") && op2.equals("Ounce") ){
            String g = jTextField1.getText();
            float gf = Float.valueOf(g);
            float ans;
            ans = (float) (gf/28.35);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Oz");
        }
        else if (op1.equals("Gram") && op2.equals("Pound") ){
            String g = jTextField1.getText();
            float gf = Float.valueOf(g);
            float ans;
            ans = (float) (gf/453.592);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Lbs");
        }
        else if (op1.equals("Gram") && op2.equals("Stone") ){
            String g = jTextField1.getText();
            float gf = Float.valueOf(g);
            float ans;
            ans = (float) (gf/6350.293);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Stone");
        }
        else if (op1.equals("Kilogram") && op2.equals("Gram") ){
            String kg = jTextField1.getText();
            float kgf = Float.valueOf(kg);
            float ans;
            ans = (float) (kgf*1000);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" g");
        }
        else if (op1.equals("Kilogram") && op2.equals("Ounce") ){
            String kg = jTextField1.getText();
            float kgf = Float.valueOf(kg);
            float ans;
            ans = (float) (kgf*35.274);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Oz");
        }
        else if (op1.equals("Kilogram") && op2.equals("Pound") ){
            String kg = jTextField1.getText();
            float kgf = Float.valueOf(kg);
            float ans;
            ans = (float) (kgf*2.205);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Lbs");
        }
        else if (op1.equals("Kilogram") && op2.equals("Stone") ){
            String kg = jTextField1.getText();
            float kgf = Float.valueOf(kg);
            float ans;
            ans = (float) (kgf/6.35);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Stone");
        }
        else if (op1.equals("Ounce") && op2.equals("Gram") ){
            String oz = jTextField1.getText();
            float ozf = Float.valueOf(oz);
            float ans;
            ans = (float) (ozf*28.35);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" g");
        }
        else if (op1.equals("Ounce") && op2.equals("Kilogram") ){
            String oz = jTextField1.getText();
            float ozf = Float.valueOf(oz);
            float ans;
            ans = (float) (ozf/35.274);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Kg");
        }
        else if (op1.equals("Ounce") && op2.equals("Pound") ){
            String oz = jTextField1.getText();
            float ozf = Float.valueOf(oz);
            float ans;
            ans = (float) (ozf/16);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Lbs");
        }
        else if (op1.equals("Ounce") && op2.equals("Stone") ){
            String oz = jTextField1.getText();
            float ozf = Float.valueOf(oz);
            float ans;
            ans = (float) (ozf/224);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Stone");
        }
        else if (op1.equals("Pound") && op2.equals("Gram") ){
            String lbs = jTextField1.getText();
            float lbsf = Float.valueOf(lbs);
            float ans;
            ans = (float) (lbsf*453.592);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" g");
        }
        else if (op1.equals("Pound") && op2.equals("Kilogram") ){
            String lbs = jTextField1.getText();
            float lbsf = Float.valueOf(lbs);
            float ans;
            ans = (float) (lbsf/2.205);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Kg");
        }
        else if (op1.equals("Pound") && op2.equals("Ounce") ){
            String lbs = jTextField1.getText();
            float lbsf = Float.valueOf(lbs);
            float ans;
            ans = (float) (lbsf*16);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Oz");
        }
        else if (op1.equals("Pound") && op2.equals("Stone") ){
            String lbs = jTextField1.getText();
            float lbsf = Float.valueOf(lbs);
            float ans;
            ans = (float) (lbsf/14);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Stone");
        }
        else if (op1.equals("Stone") && op2.equals("Gram") ){
            String Stone = jTextField1.getText();
            float Stonef = Float.valueOf(Stone);
            float ans;
            ans = (float) (Stonef*6350.293);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" g");
        }
        else if (op1.equals("Stone") && op2.equals("Kilogram") ){
            String Stone = jTextField1.getText();
            float Stonef = Float.valueOf(Stone);
            float ans;
            ans = (float) (Stonef*6.35);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Kg");
        }
        else if (op1.equals("Stone") && op2.equals("Ounce") ){
            String Stone = jTextField1.getText();
            float Stonef = Float.valueOf(Stone);
            float ans;
            ans = (float) (Stonef*224);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Oz");
        }
        else if (op1.equals("Stone") && op2.equals("Pound") ){
            String Stone = jTextField1.getText();
            float Stonef = Float.valueOf(Stone);
            float ans;
            ans = (float) (Stonef*14);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Lbs");
        }
        else {
            jTextField2.setText("Error or trying to convert to the same");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Takes the user to the conversion selection screen
        Calcopt ca= new Calcopt(appData);
        ca.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Weightselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Weightselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Weightselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Weightselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        AppData appData = new AppData("some test string", 1, 1, 1, 1);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Weightselection(appData).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
