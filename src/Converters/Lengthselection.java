package Converters;
import Data.AppData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 10205453
 */
public class Lengthselection extends javax.swing.JFrame {

    /**
     * Creates new form Lengthselection
     */
    private final AppData appData;
    public Lengthselection(AppData appData) {
        this.appData = appData;
        initComponents();
        getContentPane().setBackground(Color.CYAN);
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

        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Centimetres", "Feet", "Mile", "Kilometres", "Inches", "metres" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Centimetres", "Feet", "Mile", "Kilometres", "Inches", "metres" }));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addGap(49, 49, 49))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                    .addContainerGap(53, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(76, 76, 76)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(44, 44, 44)
                    .addComponent(jButton1)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Calcopt ca= new Calcopt(appData);
            ca.setVisible(true);
            this.setVisible(false);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String op1 = (String) jComboBox1.getSelectedItem();
        String op2 = (String) jComboBox2.getSelectedItem();
        if (op1.equals("Centimetres") && op2.equals("Inches") ){
            String cm = jTextField1.getText();
            float cf = Float.valueOf(cm);
            float ans;
            ans = (float) (cf/2.54);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " In");
        }
        else if (op1.equals("Centimetres") && op2.equals("Feet") ){
            String cm = jTextField1.getText();
            float cf = Float.valueOf(cm);
            float ans;
            ans = (float) (cf/30.48);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Ft");
        }
        else if (op1.equals("Centimetres") && op2.equals("Mile") ){
            String cm = jTextField1.getText();
            float cf = Float.valueOf(cm);
            float ans;
            ans = (float) (cf*0.000006213711922);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Mi");
        }
        else if (op1.equals("Centimetres") && op2.equals("Kilometres") ){
            String cm = jTextField1.getText();
            float cf = Float.valueOf(cm);
            float ans;
            ans = (float) (cf/100000);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Km");
        }
        else if (op1.equals("Centimetres") && op2.equals("metres") ){
            String cm = jTextField1.getText();
            float cf = Float.valueOf(cm);
            float ans;
            ans = (float) (cf/100);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " m");
        }
        else if (op1.equals("Feet") && op2.equals("Centimetres") ){
            String f = jTextField1.getText();
            float ff = Float.valueOf(f);
            float ans;
            ans = (float) (ff*30.48);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " cm");
        }
        else if (op1.equals("Feet") && op2.equals("Mile") ){
            String f = jTextField1.getText();
            float ff = Float.valueOf(f);
            float ans;
            ans = (float) (ff*0.00018939);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Mi");
        }
        else if (op1.equals("Feet") && op2.equals("Kilometres") ){
            String f = jTextField1.getText();
            float ff = Float.valueOf(f);
            float ans;
            ans = (float) (ff/3280.8);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Km");
        }
        else if (op1.equals("Feet") && op2.equals("Inches") ){
            String f = jTextField1.getText();
            float ff = Float.valueOf(f);
            float ans;
            ans = (float) (ff*12);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " In");
        }
        else if (op1.equals("Feet") && op2.equals("metres") ){
            String f = jTextField1.getText();
            float ff = Float.valueOf(f);
            float ans;
            ans = (float) (ff/3.2808);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " In");
        }
        else if (op1.equals("Mile") && op2.equals("Centimetres") ){
            String mi = jTextField1.getText();
            float mf = Float.valueOf(mi);
            float ans;
            ans = (float) (mf/0.000006213711922);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Cm");
        }
        else if (op1.equals("Mile") && op2.equals("Feet") ){
            String mi = jTextField1.getText();
            float mf = Float.valueOf(mi);
            float ans;
            ans = (float) (mf/0.00018939);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Ft");
        }
        else if (op1.equals("Mile") && op2.equals("Kilometres") ){
            String mi = jTextField1.getText();
            float mf = Float.valueOf(mi);
            float ans;
            ans = (float) (mf*1.609344 );
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Km");
        }
        else if (op1.equals("Mile") && op2.equals("Inches") ){
            String mi = jTextField1.getText();
            float mf = Float.valueOf(mi);
            float ans;
            ans = (float) (mf*63360);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " In");
        }
        else if (op1.equals("Mile") && op2.equals("metres") ){
            String mi = jTextField1.getText();
            float mf = Float.valueOf(mi);
            float ans;
            ans = (float) (mf/0.00062137);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " In");
        }
        else if (op1.equals("Kilometres") && op2.equals("Centimetres") ){
            String km = jTextField1.getText();
            float kmf = Float.valueOf(km);
            float ans;
            ans = (float) (kmf/0.000010000);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Cm");
        }
        else if (op1.equals("Kilometres") && op2.equals("Feet") ){
            String km = jTextField1.getText();
            float kmf = Float.valueOf(km);
            float ans;
            ans = (float) (kmf*3280.8);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Ft");
        }
        else if (op1.equals("Kilometres") && op2.equals("Mile") ){
            String km = jTextField1.getText();
            float kmf = Float.valueOf(km);
            float ans;
            ans = (float) (kmf/1.609344);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Mi");
        }
        else if (op1.equals("Kilometres") && op2.equals("Inches") ){
            String km = jTextField1.getText();
            float kmf = Float.valueOf(km);
            float ans;
            ans = (float) (kmf*39370.07874);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " In");
        }
        else if (op1.equals("Kilometres") && op2.equals("metres") ){
            String km = jTextField1.getText();
            float kmf = Float.valueOf(km);
            float ans;
            ans = (float) (kmf/0.0010000);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " M");
        }
        else if (op1.equals("Inches") && op2.equals("Centimetres") ){
            String in = jTextField1.getText();
            float inf = Float.valueOf(in);
            float ans;
            ans = (float) (inf*2.54);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Cm");
        }
        else if (op1.equals("Inches") && op2.equals("Feet") ){
            String in = jTextField1.getText();
            float inf = Float.valueOf(in);
            float ans;
            ans = (float) (inf/12);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Ft");
        }
        else if (op1.equals("Inches") && op2.equals("Mile") ){
            String in = jTextField1.getText();
            float inf = Float.valueOf(in);
            float ans;
            ans = (float) (inf/63360);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Mi");
        }
        else if (op1.equals("Inches") && op2.equals("Kilometres") ){
            String in = jTextField1.getText();
            float inf = Float.valueOf(in);
            float ans;
            ans = (float) (inf/39370.079);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Km");
        }
        else if (op1.equals("Inches") && op2.equals("metres") ){
            String in = jTextField1.getText();
            float inf = Float.valueOf(in);
            float ans;
            ans = (float) (inf/39.37);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " m");
        }
        else if (op1.equals("metres") && op2.equals("Centimetres") ){
            String m = jTextField1.getText();
            float mf = Float.valueOf(m);
            float ans;
            ans = (float) (mf*100);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Cm");
        }
        else if (op1.equals("metres") && op2.equals("Feet") ){
            String m = jTextField1.getText();
            float mf = Float.valueOf(m);
            float ans;
            ans = (float) (mf*3.281);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Ft");
        }
        else if (op1.equals("metres") && op2.equals("Mile") ){
            String m = jTextField1.getText();
            float mf = Float.valueOf(m);
            float ans;
            ans = (float) (mf/1609.344);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Mi");
        }
        else if (op1.equals("metres") && op2.equals("Kilometres") ){
            String m = jTextField1.getText();
            float mf = Float.valueOf(m);
            float ans;
            ans = (float) (mf/1000);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Km");
        }
        else if (op1.equals("metres") && op2.equals("Inches") ){
            String m = jTextField1.getText();
            float mf = Float.valueOf(m);
            float ans;
            ans = (float) (mf*39.37);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " In");
        }

        else {
            jTextField2.setText("Error or trying to convert to the same");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Lengthselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lengthselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lengthselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lengthselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        AppData appData = new AppData("name", 0, 0, 0, 0);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lengthselection(appData).setVisible(true);
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
