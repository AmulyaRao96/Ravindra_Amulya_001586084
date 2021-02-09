/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Address;
import Business.Checkings;
import Business.Demographic;
import Business.DriverLicense;
import Business.MedicalRecord;
import Business.Savings;

/**
 *
 * @author ramulyarao
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    Demographic demo;
    Address addr;
    Savings savngs;
    Checkings chkngs;
    MedicalRecord meds;
    DriverLicense dl;
    public MainJFrame() {
        initComponents();
        demo =new Demographic();
        addr=new Address();
        savngs=new Savings();
        chkngs=new Checkings();
        meds=new MedicalRecord();
        dl=new DriverLicense();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        LeftJPanel = new javax.swing.JPanel();
        btnCreateDemographic = new javax.swing.JButton();
        btnViewDemographic = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCreateAddr = new javax.swing.JButton();
        btnViewAddr = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCreateSavings = new javax.swing.JButton();
        btnViewSavings = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCreateCheckings = new javax.swing.JButton();
        btnViewCheckings = new javax.swing.JButton();
        btnViewDriverInfo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCreateDriversInfo = new javax.swing.JButton();
        btnViewMedicalRecord = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCreateMedicalRecord = new javax.swing.JButton();
        btnReportPanel = new javax.swing.JButton();
        RightJpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnCreateDemographic.setText("Create");
        btnCreateDemographic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDemographicActionPerformed(evt);
            }
        });

        btnViewDemographic.setText("View");
        btnViewDemographic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDemographicActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Demographic Info");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Address Info");

        btnCreateAddr.setText("Create");
        btnCreateAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAddrActionPerformed(evt);
            }
        });

        btnViewAddr.setText("View");
        btnViewAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAddrActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Savings Info");

        btnCreateSavings.setText("Create");
        btnCreateSavings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSavingsActionPerformed(evt);
            }
        });

        btnViewSavings.setText("View");
        btnViewSavings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSavingsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Checkings Info");

        btnCreateCheckings.setText("Create");
        btnCreateCheckings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCheckingsActionPerformed(evt);
            }
        });

        btnViewCheckings.setText("View");
        btnViewCheckings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCheckingsActionPerformed(evt);
            }
        });

        btnViewDriverInfo.setText("View");
        btnViewDriverInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDriverInfoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Driver's Liscense Info");

        btnCreateDriversInfo.setText("Create");
        btnCreateDriversInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDriversInfoActionPerformed(evt);
            }
        });

        btnViewMedicalRecord.setText("View");
        btnViewMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMedicalRecordActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Medical Record Info");

        btnCreateMedicalRecord.setText("Create");
        btnCreateMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMedicalRecordActionPerformed(evt);
            }
        });

        btnReportPanel.setText("Report");
        btnReportPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftJPanelLayout = new javax.swing.GroupLayout(LeftJPanel);
        LeftJPanel.setLayout(LeftJPanelLayout);
        LeftJPanelLayout.setHorizontalGroup(
            LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnViewDemographic)
                    .addComponent(btnCreateDemographic))
                .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewAddr)
                            .addComponent(btnCreateAddr)))
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewSavings)
                            .addComponent(btnCreateSavings))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)))
                .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewCheckings)
                    .addComponent(btnCreateCheckings)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btnViewDriverInfo)
                    .addComponent(btnCreateDriversInfo))
                .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6))
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewMedicalRecord)
                            .addComponent(btnCreateMedicalRecord))
                        .addGap(44, 44, 44)
                        .addComponent(btnReportPanel)))
                .addGap(66, 66, 66))
        );

        LeftJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateAddr, btnCreateCheckings, btnCreateDemographic, btnCreateDriversInfo, btnCreateMedicalRecord, btnCreateSavings, btnViewAddr, btnViewCheckings, btnViewDemographic, btnViewDriverInfo, btnViewMedicalRecord, btnViewSavings, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        LeftJPanelLayout.setVerticalGroup(
            LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftJPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftJPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreateDriversInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewDriverInfo))
                            .addGroup(LeftJPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnReportPanel))))
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateCheckings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewCheckings))
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateSavings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewSavings))
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateDemographic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewDemographic))
                    .addGroup(LeftJPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftJPanelLayout.createSequentialGroup()
                                .addComponent(btnCreateMedicalRecord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewMedicalRecord))
                            .addGroup(LeftJPanelLayout.createSequentialGroup()
                                .addComponent(btnCreateAddr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewAddr)))))
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(LeftJPanel);

        javax.swing.GroupLayout RightJpanelLayout = new javax.swing.GroupLayout(RightJpanel);
        RightJpanel.setLayout(RightJpanelLayout);
        RightJpanelLayout.setHorizontalGroup(
            RightJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1183, Short.MAX_VALUE)
        );
        RightJpanelLayout.setVerticalGroup(
            RightJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(RightJpanel);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDemographicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDemographicActionPerformed
        // TODO add your handling code here:
        CreateDemographicJpanel createdemographicjpanel=new CreateDemographicJpanel(demo);
        jSplitPane1.setRightComponent(createdemographicjpanel);
    }//GEN-LAST:event_btnCreateDemographicActionPerformed

    private void btnViewDemographicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDemographicActionPerformed
        // TODO add your handling code here:
        ViewDemographicJpanel viewdemographicjpanel=new ViewDemographicJpanel(demo);
        jSplitPane1.setRightComponent(viewdemographicjpanel);
    }//GEN-LAST:event_btnViewDemographicActionPerformed

    private void btnCreateAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAddrActionPerformed
        // TODO add your handling code here:
        CreateAddressJPanel createaddressjpanel=new CreateAddressJPanel(addr);
        jSplitPane1.setRightComponent(createaddressjpanel);
    }//GEN-LAST:event_btnCreateAddrActionPerformed

    private void btnViewAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAddrActionPerformed
        // TODO add your handling code here:
         ViewAddressJpanel viewaddressjpanel=new ViewAddressJpanel(addr);
        jSplitPane1.setRightComponent(viewaddressjpanel);
    }//GEN-LAST:event_btnViewAddrActionPerformed

    private void btnCreateSavingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSavingsActionPerformed
        // TODO add your handling code here:
         CreateSavingsJPanel createsavingsjpanel=new CreateSavingsJPanel(savngs);
        jSplitPane1.setRightComponent(createsavingsjpanel);
    }//GEN-LAST:event_btnCreateSavingsActionPerformed

    private void btnViewSavingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSavingsActionPerformed
        // TODO add your handling code here:
        ViewSavingsJPanel viewsavingsjpanel=new ViewSavingsJPanel(savngs);
        jSplitPane1.setRightComponent(viewsavingsjpanel);
    }//GEN-LAST:event_btnViewSavingsActionPerformed

    private void btnCreateCheckingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCheckingsActionPerformed
        // TODO add your handling code here:
         CreateCheckingsJPanel createcheckingsjpanel=new CreateCheckingsJPanel(chkngs);
        jSplitPane1.setRightComponent(createcheckingsjpanel);
        
    }//GEN-LAST:event_btnCreateCheckingsActionPerformed

    private void btnViewCheckingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCheckingsActionPerformed
        // TODO add your handling code here:
        ViewCheckingsJPanel viewcheckingsjpanel=new ViewCheckingsJPanel(chkngs);
        jSplitPane1.setRightComponent(viewcheckingsjpanel);
    }//GEN-LAST:event_btnViewCheckingsActionPerformed

    private void btnViewDriverInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDriverInfoActionPerformed
        // TODO add your handling code here:
        ViewDriverLicenseJPanel viewdriverlicensejpanel=new ViewDriverLicenseJPanel(dl);
        jSplitPane1.setRightComponent(viewdriverlicensejpanel);
    }//GEN-LAST:event_btnViewDriverInfoActionPerformed

    private void btnCreateDriversInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDriversInfoActionPerformed
        // TODO add your handling code here:
        CreateDriverLicenseJPanel createdriverlicensejpanel=new CreateDriverLicenseJPanel(dl);
        jSplitPane1.setRightComponent(createdriverlicensejpanel);
    }//GEN-LAST:event_btnCreateDriversInfoActionPerformed

    private void btnViewMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMedicalRecordActionPerformed
        // TODO add your handling code here:
        ViewMedicalRecordJPanel viewmedicalrecordjpanel=new ViewMedicalRecordJPanel(meds);
        jSplitPane1.setRightComponent(viewmedicalrecordjpanel);
    }//GEN-LAST:event_btnViewMedicalRecordActionPerformed

    private void btnCreateMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMedicalRecordActionPerformed
        // TODO add your handling code here:
        CreateMedicalRecordJPanel createmedicalrecordjpanel=new CreateMedicalRecordJPanel(meds);
        jSplitPane1.setRightComponent(createmedicalrecordjpanel);
    }//GEN-LAST:event_btnCreateMedicalRecordActionPerformed

    private void btnReportPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportPanelActionPerformed
        // TODO add your handling code here:
        ReportJPanel reportjpanel=new ReportJPanel(demo,addr,savngs,chkngs,dl,meds);
        jSplitPane1.setRightComponent(reportjpanel);
    }//GEN-LAST:event_btnReportPanelActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftJPanel;
    private javax.swing.JPanel RightJpanel;
    private javax.swing.JButton btnCreateAddr;
    private javax.swing.JButton btnCreateCheckings;
    private javax.swing.JButton btnCreateDemographic;
    private javax.swing.JButton btnCreateDriversInfo;
    private javax.swing.JButton btnCreateMedicalRecord;
    private javax.swing.JButton btnCreateSavings;
    private javax.swing.JButton btnReportPanel;
    private javax.swing.JButton btnViewAddr;
    private javax.swing.JButton btnViewCheckings;
    private javax.swing.JButton btnViewDemographic;
    private javax.swing.JButton btnViewDriverInfo;
    private javax.swing.JButton btnViewMedicalRecord;
    private javax.swing.JButton btnViewSavings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
