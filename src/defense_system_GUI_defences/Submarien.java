/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defense_system_GUI_defences;
import defense_system_util.DefenceObserver;
import defense_system_util.Level;
import defense_system.util.DefenceObsevable;
import defense_system_GUI_main_controller.MainController;

/**
 *
 * @author thili
 */
public class Submarien extends javax.swing.JFrame implements DefenceObserver{

    /**
     * Creates new form Submarien
     */
    
    private Level lastLv;
    private String name;
    private MainController mainController;
    private DefenceObsevable ob;
   
    public Submarien(String name) {
        initComponents();
        this.name=name;
        btnShoot.setEnabled(false);
        btnSonarOperation.setEnabled(false);
        btnTomahawkMissile.setEnabled(false);
        btnTrident2Missile.setEnabled(false);
        setTitle("Submarien-"+name);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSend = new javax.swing.JTextArea();
        btnTrident2Missile = new javax.swing.JButton();
        btnSonarOperation = new javax.swing.JButton();
        btnShoot = new javax.swing.JButton();
        btnTomahawkMissile = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        jsSoilderCount = new javax.swing.JSpinner();
        jsAmmoCount = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        cbPosition = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        slsOxigen = new javax.swing.JSlider();
        sldEnergy = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMSGArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtSend);

        btnTrident2Missile.setText("Trident-2 Missile");

        btnSonarOperation.setText("Sonar Operation");

        btnShoot.setText("Shoot");

        btnTomahawkMissile.setText("Tomahawk Missile");

        lblArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblArea.setText("Area Not Cleared");

        jsSoilderCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsSoilderCountStateChanged(evt);
            }
        });

        jsAmmoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsAmmoCountStateChanged(evt);
            }
        });

        jLabel2.setText("Ammo Count");

        cbPosition.setText("Position");
        cbPosition.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbPositionStateChanged(evt);
            }
        });
        cbPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPositionActionPerformed(evt);
            }
        });

        jLabel1.setText("Soildeir Count");

        slsOxigen.setMajorTickSpacing(20);
        slsOxigen.setMinorTickSpacing(10);
        slsOxigen.setOrientation(javax.swing.JSlider.VERTICAL);
        slsOxigen.setPaintLabels(true);
        slsOxigen.setPaintTicks(true);
        slsOxigen.setValue(100);

        sldEnergy.setMajorTickSpacing(20);
        sldEnergy.setMinorTickSpacing(10);
        sldEnergy.setOrientation(javax.swing.JSlider.VERTICAL);
        sldEnergy.setPaintLabels(true);
        sldEnergy.setPaintTicks(true);
        sldEnergy.setValue(100);

        jLabel3.setText("Energy");

        jLabel4.setText("Oxigen");

        txtMSGArea.setEditable(false);
        txtMSGArea.setColumns(20);
        txtMSGArea.setRows(5);
        jScrollPane1.setViewportView(txtMSGArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTomahawkMissile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTrident2Missile, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSonarOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jsSoilderCount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jsAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbPosition)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(sldEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slsOxigen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jsSoilderCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jsAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(cbPosition)
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSend, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slsOxigen, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sldEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSonarOperation)
                            .addComponent(btnShoot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTomahawkMissile)
                            .addComponent(btnTrident2Missile))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPositionActionPerformed

    private void cbPositionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbPositionStateChanged
        if (!cbPosition.isSelected()) {
            btnShoot.setEnabled(false);
            btnSonarOperation.setEnabled(false);
            btnTomahawkMissile.setEnabled(false); 
            btnTrident2Missile.setEnabled(false); 
        }else{
            updateButtonVisible(lastLv);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cbPositionStateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if(!txtSend.getText().equals("")){
            sendMessagetoAll("You : "+txtSend.getText());
            mainController.printArrivedMessage(name+" : "+txtSend.getText());
            txtSend.setText("");
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void jsSoilderCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsSoilderCountStateChanged
        // TODO add your handling code here:
        ob.updateSoilderCount();
    }//GEN-LAST:event_jsSoilderCountStateChanged

    private void jsAmmoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsAmmoCountStateChanged
            // TODO add your handling code here:
            ob.updateAmmoCount();
            
    }//GEN-LAST:event_jsAmmoCountStateChanged

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
            java.util.logging.Logger.getLogger(Submarien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submarien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submarien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submarien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonarOperation;
    private javax.swing.JButton btnTomahawkMissile;
    private javax.swing.JButton btnTrident2Missile;
    private javax.swing.JCheckBox cbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jsAmmoCount;
    private javax.swing.JSpinner jsSoilderCount;
    private javax.swing.JLabel lblArea;
    private javax.swing.JSlider sldEnergy;
    private javax.swing.JSlider slsOxigen;
    private javax.swing.JTextArea txtMSGArea;
    private javax.swing.JTextArea txtSend;
    // End of variables declaration//GEN-END:variables
    
    
    
    
    
     @Override
    public void updateButtonVisible(Level lv) {
       lastLv=lv;
       
       if(cbPosition.isSelected()){
           switch (lv) {
            case LOW:
                btnShoot.setEnabled(true);
                btnSonarOperation.setEnabled(false);
                btnTomahawkMissile.setEnabled(false);
                btnTrident2Missile.setEnabled(false);
                break;
            
            case MEDIUM:
                btnShoot.setEnabled(true);
                btnSonarOperation.setEnabled(true);
                btnTomahawkMissile.setEnabled(false);
                btnTrident2Missile.setEnabled(false);
                break;
                
            case HIGH:
                btnShoot.setEnabled(true);
                btnSonarOperation.setEnabled(true);
                btnTomahawkMissile.setEnabled(true);
                btnTrident2Missile.setEnabled(false);
                break;
                
            case STRONG:
                btnShoot.setEnabled(true);
                btnSonarOperation.setEnabled(true);
                btnTomahawkMissile.setEnabled(true);
                btnTrident2Missile.setEnabled(true);
                
                break;               
            default:
                btnShoot.setEnabled(false);
                btnSonarOperation.setEnabled(false);
                btnTomahawkMissile.setEnabled(false);
                btnTrident2Missile.setEnabled(false);
            }
       }
    
    
    }
    
    
    
    @Override
    public void sendMessagetoAll(String msg) {
        txtMSGArea.setText(txtMSGArea.getText()+msg+"\n");
    }

    @Override
    public void setArea(boolean Lc) {
        lblArea.setText(Lc?"Area Cleared":"Area Not Cleared");
    }

    @Override
    public void sendMessageToMainControll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setMainController(MainController mainController) {
        this.mainController=mainController;
    }

    @Override
    public int getSoilderCount() {
        return (int)jsSoilderCount.getValue();
    }

    @Override
    public void setDefenceOb(DefenceObsevable ob) {
        this.ob=ob;
    }
    
    
    @Override
    public int getAmmoCount() {
        return (int)jsAmmoCount.getValue();
    }
    
}
