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
public class Speedselection extends javax.swing.JFrame {

    /**
     * Creates new form Speedselection
     */
    //setup communication for AppData
    private final AppData appData;
    public Speedselection(AppData appData) {
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mph", "Kph", "Mps", "Fps", "Knots" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mph", "Kph", "Mps", "Fps", "Knots" }));
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
                .addContainerGap(335, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
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
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(76, 76, 76)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(44, 44, 44)
                    .addComponent(jButton1)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Takes the user to the conversion selection screen
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
        // logic for which conversion to perform and its calculation
        String op1 = (String) jComboBox1.getSelectedItem();
        String op2 = (String) jComboBox2.getSelectedItem();
        if (op1.equals("Mph") && op2.equals("Kph") ){
            String mph = jTextField1.getText();
            float mphf = Float.valueOf(mph);
            float ans;
            ans = (float) (mphf*1.609);
            String sans = Float.toString(ans);
            jTextField2.setText(sans + " Kph");
        }
        else if (op1.equals("Mph") && op2.equals("Mps") ){
            String mph = jTextField1.getText();
            float mphf = Float.valueOf(mph);
            float ans;
            ans = (float) (mphf/2.237);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Mps");
        }
        else if (op1.equals("Mph") && op2.equals("Fps") ){
            String mph = jTextField1.getText();
            float mphf = Float.valueOf(mph);
            float ans;
            ans = (float) (mphf*1.467);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Fps");
        }
        else if (op1.equals("Mph") && op2.equals("Knots") ){
            String mph = jTextField1.getText();
            float mphf = Float.valueOf(mph);
            float ans;
            ans = (float) (mphf/1.151);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Knots");
        }
        else if (op1.equals("Kph") && op2.equals("Mph") ){
            String kph = jTextField1.getText();
            float kphf = Float.valueOf(kph);
            float ans;
            ans = (float) (kphf/1.609);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Mph");
        }
        else if (op1.equals("Kph") && op2.equals("Mps") ){
            String kph = jTextField1.getText();
            float kphf = Float.valueOf(kph);
            float ans;
            ans = (float) (kphf/3.6);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Mps");
        }
        else if (op1.equals("Kph") && op2.equals("Fps") ){
            String kph = jTextField1.getText();
            float kphf = Float.valueOf(kph);
            float ans;
            ans = (float) (kphf/1.097);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Fps");
        }
        else if (op1.equals("Kph") && op2.equals("Knots") ){
            String kph = jTextField1.getText();
            float kphf = Float.valueOf(kph);
            float ans;
            ans = (float) (kphf/1.852);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Knots");
        }
        else if (op1.equals("Mps") && op2.equals("Mph") ){
            String mps = jTextField1.getText();
            float mpsf = Float.valueOf(mps);
            float ans;
            ans = (float) (mpsf*2.237);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Mph");
        }
        else if (op1.equals("Mps") && op2.equals("Kph") ){
            String mps = jTextField1.getText();
            float mpsf = Float.valueOf(mps);
            float ans;
            ans = (float) (mpsf*3.6);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Kph");
        }
        else if (op1.equals("Mps") && op2.equals("Fps") ){
            String mps = jTextField1.getText();
            float mpsf = Float.valueOf(mps);
            float ans;
            ans = (float) (mpsf*3.281);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Fps");
        }
        else if (op1.equals("Mps") && op2.equals("Knots") ){
            String mps = jTextField1.getText();
            float mpsf = Float.valueOf(mps);
            float ans;
            ans = (float) (mpsf*1.944);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Knots");
        }
        else if (op1.equals("Fps") && op2.equals("Mph") ){
            String fps = jTextField1.getText();
            float fpsf = Float.valueOf(fps);
            float ans;
            ans = (float) (fpsf/1.467);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Mph");
        }
        else if (op1.equals("Fps") && op2.equals("Kph") ){
            String fps = jTextField1.getText();
            float fpsf = Float.valueOf(fps);
            float ans;
            ans = (float) (fpsf*1.097);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Kph");
        }
        else if (op1.equals("Fps") && op2.equals("Mps") ){
            String fps = jTextField1.getText();
            float fpsf = Float.valueOf(fps);
            float ans;
            ans = (float) (fpsf/3.281);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Mps");
        }
        else if (op1.equals("Fps") && op2.equals("Knots") ){
            String fps = jTextField1.getText();
            float fpsf = Float.valueOf(fps);
            float ans;
            ans = (float) (fpsf/1.688);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Knots");
        }
        else if (op1.equals("Knots") && op2.equals("Mph") ){
            String knt = jTextField1.getText();
            float kntf = Float.valueOf(knt);
            float ans;
            ans = (float) (kntf*1.151);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Mph");
        }
        else if (op1.equals("Knots") && op2.equals("Kph") ){
            String knt = jTextField1.getText();
            float kntf = Float.valueOf(knt);
            float ans;
            ans = (float) (kntf*1.852);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Kph");
        }
        else if (op1.equals("Knots") && op2.equals("Mps") ){
            String knt = jTextField1.getText();
            float kntf = Float.valueOf(knt);
            float ans;
            ans = (float) (kntf/1.944);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Mps");
        }
        else if (op1.equals("Knots") && op2.equals("Fps") ){
            String knt = jTextField1.getText();
            float kntf = Float.valueOf(knt);
            float ans;
            ans = (float) (kntf*1.688);
            String sans = Float.toString(ans);
            jTextField2.setText(sans +" Fps");
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
            java.util.logging.Logger.getLogger(Speedselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Speedselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Speedselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Speedselection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        AppData appData = new AppData("some test string", 1, 1, 1, 1);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Speedselection(appData).setVisible(true);
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
