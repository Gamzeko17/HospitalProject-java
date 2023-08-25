/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gamzekoca.arayüz;

import com.gamzekoca.veritabani.VeriTabanı;


public class VeriTabaniBaglantisi extends javax.swing.JFrame {

   VeriTabanı vt=new VeriTabanı();
    
    public VeriTabaniBaglantisi() {
        initComponents();//Kodların çalıştığı bölüm.
         btn_VTkapat.setEnabled(false);//Veri bağlantısı kopar butonu pasif oldu.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_VTbaglan = new javax.swing.JButton();
        btn_VTkapat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_VTbaglan.setText("Veri Tabanına Bağlan");
        btn_VTbaglan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VTbaglanActionPerformed(evt);
            }
        });

        btn_VTkapat.setText("Veri Tabanından Bağlantıyı Kopar");
        btn_VTkapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VTkapatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btn_VTbaglan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(btn_VTkapat)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btn_VTbaglan)
                .addGap(93, 93, 93)
                .addComponent(btn_VTkapat)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VTbaglanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VTbaglanActionPerformed
         vt.baglan();//Veri tabanına bağlanıyoruz.
        btn_VTkapat.setEnabled(true);//veri tabanına bağlantıyı kopar butonu aktif olacak.
        btn_VTbaglan.setEnabled(false);//Veri tabanına bağlan butonu aktif olacak 
    }//GEN-LAST:event_btn_VTbaglanActionPerformed

    private void btn_VTkapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VTkapatActionPerformed
         vt.baglan();//veri tabanından bağlantıyı koparma methodu aktif olacak.
        btn_VTkapat.setEnabled(true);//veri tabanından bağlantıyı koparma butonu pasif olacak.
        btn_VTbaglan.setEnabled(false);//veri tabanına bağlan butonu aktif olacak.
        
       
      
    }//GEN-LAST:event_btn_VTkapatActionPerformed

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
            java.util.logging.Logger.getLogger(VeriTabaniBaglantisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeriTabaniBaglantisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeriTabaniBaglantisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeriTabaniBaglantisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeriTabaniBaglantisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_VTbaglan;
    private javax.swing.JButton btn_VTkapat;
    // End of variables declaration//GEN-END:variables
}
