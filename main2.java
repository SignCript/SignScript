/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackathon;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Dibyajit Banerjee
 */
public class main2 extends javax.swing.JFrame {

    /**
     * Creates new form main2
     */
     int count =0,max;double ans=0.0;
          Color ch=null;
          String Name1;
    public main2() {
        initComponents();
        this.setTitle("Submit");
           panel2.set(5);
           panel2.setVisible(false);
           this.setName("Submit");
           Submit.setEnabled(false);
           Erase.setEnabled(false);
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
        panel2 = new hackathon.Panel();
        jPanel2 = new javax.swing.JPanel();
        Card = new javax.swing.JPanel();
        Sub1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        trial = new javax.swing.JComboBox();
        Start = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        Erase = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Authn = new javax.swing.JPanel();
        Submit1 = new javax.swing.JButton();
        Erase1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Labels = new javax.swing.JPanel();
        PrecLab = new javax.swing.JLabel();
        TolLab = new javax.swing.JLabel();
        Sliders = new javax.swing.JPanel();
        Precision = new javax.swing.JSlider();
        Tolerance = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        color = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(311, 93));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        Card.setLayout(new java.awt.CardLayout());

        jLabel3.setText("No. of Trials");
        Sub1.add(jLabel3);

        trial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "6", "7", "8", "9", "10" }));
        trial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trialActionPerformed(evt);
            }
        });
        Sub1.add(trial);

        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        Sub1.add(Start);

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        Sub1.add(Submit);

        Erase.setText("Erase");
        Erase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EraseActionPerformed(evt);
            }
        });
        Sub1.add(Erase);

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));
        Sub1.add(jPanel4);

        Card.add(Sub1, "card2");

        Submit1.setText("Submit");
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });
        Authn.add(Submit1);

        Erase1.setText("Erase");
        Erase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Erase1ActionPerformed(evt);
            }
        });
        Authn.add(Erase1);

        jPanel8.setLayout(new java.awt.GridLayout(2, 1));
        Authn.add(jPanel8);

        Card.add(Authn, "card3");

        jPanel2.add(Card);

        Labels.setMinimumSize(new java.awt.Dimension(100, 50));
        Labels.setLayout(new java.awt.GridLayout(2, 1));

        PrecLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrecLab.setText("Precision");
        Labels.add(PrecLab);

        TolLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TolLab.setText("Tolerance");
        Labels.add(TolLab);

        Sliders.setLayout(new javax.swing.BoxLayout(Sliders, javax.swing.BoxLayout.Y_AXIS));

        Precision.setMinorTickSpacing(10);
        Precision.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PrecisionStateChanged(evt);
            }
        });
        Sliders.add(Precision);

        Tolerance.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ToleranceStateChanged(evt);
            }
        });
        Sliders.add(Tolerance);

        jLabel4.setText("User Name : ");

        color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Red", "Green", "Blue", "Yellow" }));
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Labels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(Sliders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Labels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Sliders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        // TODO add your handling code here:
        if(!Name.getText().isEmpty()){
            panel2.setVisible(true);
            max=trial.getSelectedIndex()+5;
            trial.setEnabled(false);
            Precision.setEnabled(false);
            Tolerance.setEnabled(false);
            Submit.setEnabled(true);
            Erase.setEnabled(true);
            Start.setEnabled(false);
            Name1=Name.getText();
            color.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(this,"Name Not entered!","Error",0);
        }
    }//GEN-LAST:event_StartActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        if(count!=max){
            ans=ans+ (panel2.res()/max);
                    count++;
            panel2.erase();
            if(count==max){
                JOptionPane.showMessageDialog(this,"Get Ready for authentication!");
                Start.setEnabled(false);
                color.setEnabled(true);
                Precision.setEnabled(true);
                Tolerance.setEnabled(true);
                Name.setText("");
                Authn.setVisible(true);
                Sub1.setVisible(false);
                color.setSelectedIndex(0);
                this.setTitle("Authentication");
            }
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void EraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EraseActionPerformed
        // TODO add your handling code here:
        panel2.erase();
    }//GEN-LAST:event_EraseActionPerformed

    private void PrecisionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PrecisionStateChanged
        // TODO add your handling code here:
        Tolerance.setValue(100-Precision.getValue());
        PrecLab.setText("Precision("+Precision.getValue()+")");
    }//GEN-LAST:event_PrecisionStateChanged

    private void ToleranceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ToleranceStateChanged
        // TODO add your handling code here:
        Precision.setValue(100-Tolerance.getValue());
        TolLab.setText("Tolerance("+Tolerance.getValue()+")");
    }//GEN-LAST:event_ToleranceStateChanged

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        // TODO add your handling code here:
        switch(color.getSelectedIndex()+1){
            case 1 :ch=Color.BLACK;break;
            case 2 :ch=Color.red;break;
            case 3 :ch=Color.green;break;
            case 4 :ch=Color.BLUE;break;
            case 5 :ch=Color.yellow;break;
        }
        panel2.setColor(ch);
    }//GEN-LAST:event_colorActionPerformed

    private void trialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trialActionPerformed
        // TODO add your handling code here:
        max=trial.getSelectedIndex()+5;
    }//GEN-LAST:event_trialActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
        // TODO add your handling code here:
        if(!Name.getText().isEmpty()){
            if(count==max){
            Submit1.setEnabled(false);
            Erase1.setEnabled(false);
            if((panel2.res()<=(ans+(Precision.getValue()*100))) && (panel2.res()>=(ans-(Precision.getValue()*100))) && (Name1.equals(Name.getText()))){
                JOptionPane.showMessageDialog(this,"Access Granted!");
                //OptionPane.showMessageDialog(this,(ans+(Precision.getValue()*10))+" < "+panel2.res()+" < "+" < "+(ans-(Precision.getValue()*10)));
            }else{
                JOptionPane.showMessageDialog(this,"Access Denied");
            }
        }
        }else{
                     JOptionPane.showMessageDialog(this,"Name Not entered!","Error",0);
            }
    }//GEN-LAST:event_Submit1ActionPerformed

    private void Erase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Erase1ActionPerformed
        // TODO add your handling code here
        panel2.erase();
    }//GEN-LAST:event_Erase1ActionPerformed

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
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Authn;
    private javax.swing.JPanel Card;
    private javax.swing.JButton Erase;
    private javax.swing.JButton Erase1;
    private javax.swing.JPanel Labels;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel PrecLab;
    private javax.swing.JSlider Precision;
    private javax.swing.JPanel Sliders;
    private javax.swing.JButton Start;
    private javax.swing.JPanel Sub1;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit1;
    private javax.swing.JLabel TolLab;
    private javax.swing.JSlider Tolerance;
    private javax.swing.JComboBox color;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private hackathon.Panel panel2;
    private javax.swing.JComboBox trial;
    // End of variables declaration//GEN-END:variables
}
