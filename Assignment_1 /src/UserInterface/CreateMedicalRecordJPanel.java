/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.MedicalRecord;
import javax.swing.JOptionPane;

/**
 *
 * @author ramulyarao
 */
public class CreateMedicalRecordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateMedicalRecordJPanel
     */
    private MedicalRecord med;

    CreateMedicalRecordJPanel(MedicalRecord meds) {
        initComponents();
        this.med=meds;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mRnTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        aLg1Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aLg2Txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aLg3Txt = new javax.swing.JTextField();
        btnSaveMedicalRecord = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Medical Record");

        jLabel2.setText("Medical Record Number :");

        jLabel3.setText("Alergy1                           :");

        aLg1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLg1TxtActionPerformed(evt);
            }
        });

        jLabel4.setText("Alergy2                           :");

        aLg2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLg2TxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Alergy3                           :");

        aLg3Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLg3TxtActionPerformed(evt);
            }
        });

        btnSaveMedicalRecord.setText("Save");
        btnSaveMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMedicalRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aLg3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aLg2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aLg1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mRnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnSaveMedicalRecord)))
                .addGap(452, 452, 452))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mRnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aLg1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aLg2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aLg3Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(btnSaveMedicalRecord)
                .addContainerGap(635, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMedicalRecordActionPerformed
        // TODO add your handling code here:
        med.setMedicalRecordNumber(mRnTxt.getText());
        med.setAlergy1(aLg1Txt.getText());
        med.setAlergy2(aLg2Txt.getText());
        med.setAlergy3(aLg3Txt.getText());
        JOptionPane.showMessageDialog(this,"Medical Record  information saved");
    }//GEN-LAST:event_btnSaveMedicalRecordActionPerformed

    private void aLg1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLg1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aLg1TxtActionPerformed

    private void aLg3TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLg3TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aLg3TxtActionPerformed

    private void aLg2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLg2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aLg2TxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aLg1Txt;
    private javax.swing.JTextField aLg2Txt;
    private javax.swing.JTextField aLg3Txt;
    private javax.swing.JButton btnSaveMedicalRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mRnTxt;
    // End of variables declaration//GEN-END:variables
}
