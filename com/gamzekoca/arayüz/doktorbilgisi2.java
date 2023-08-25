/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gamzekoca.arayüz;
import com.gamzekoca.siniflar.Doktorlar;

public class doktorbilgisi2 extends javax.swing.JFrame {

    public doktorbilgisi2() {
        initComponents();//Kodların çalıştırıldığı kısım.
     
      btn_Guncelle.setEnabled(false);//Güncelle butonu pasif olacak.
     btn_Sil.setEnabled(false);//Sil butonu pasif olacak.
     temizle();
 
   }
      public void temizle(){//Yazdığımız metinlerin temizlenmesini sağlaya method
    txt_TCNo.setText("");//TCNo textfield'ı temizlendi.
    txt_Ad.setText("");//Ad textfield'ı temizlendi.
    txt_Soyad.setText("");//Soyad textfield'ı temizlendi.
    txt_Adres.setText("");//Adres textfield'i temizlendi.
    txt_Sehir.setText("");//Sehir textfield'ı temizledik.
    txt_Yas.setText("");//Yas textfield'ı temizledik.
    txt_Eposta.setText("");//Eposta textfield'i temizlendi.
    txt_Brans.setText("");//Brans textfield'ı temizlendi. 
    buttonGroup1.clearSelection();//Cinsiyet radio button seçili olan buton temizlendi.
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_Kaydet = new javax.swing.JButton();
        btn_Bul = new javax.swing.JButton();
        btn_Sil = new javax.swing.JButton();
        btn_Guncelle = new javax.swing.JButton();
        txt_TCNo = new javax.swing.JTextField();
        txt_Ad = new javax.swing.JTextField();
        txt_Soyad = new javax.swing.JTextField();
        txt_Adres = new javax.swing.JTextField();
        txt_Sehir = new javax.swing.JTextField();
        txt_Yas = new javax.swing.JTextField();
        txt_Eposta = new javax.swing.JTextField();
        txt_Brans = new javax.swing.JTextField();
        rb_Bay = new javax.swing.JRadioButton();
        rb_Bayan = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor_iconu.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setText("TCNo");

        jLabel3.setText("Ad");

        jLabel4.setText("Soyad");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cinsiyet");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Adres");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sehir");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Yas");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("E-posta");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Brans");

        btn_Kaydet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Kaydet.setText("Kaydet");
        btn_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KaydetActionPerformed(evt);
            }
        });

        btn_Bul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Bul.setText("Bul");
        btn_Bul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BulActionPerformed(evt);
            }
        });

        btn_Sil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Sil.setText("Sil");
        btn_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SilActionPerformed(evt);
            }
        });

        btn_Guncelle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Guncelle.setText("Güncelle");
        btn_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuncelleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_Bay);
        rb_Bay.setText("Bay");

        buttonGroup1.add(rb_Bayan);
        rb_Bayan.setText("Bayan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_Bay)
                                .addGap(41, 41, 41)
                                .addComponent(rb_Bayan))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_TCNo)
                                .addComponent(txt_Ad)
                                .addComponent(txt_Soyad)
                                .addComponent(txt_Adres)
                                .addComponent(txt_Sehir)
                                .addComponent(txt_Yas)
                                .addComponent(txt_Eposta)
                                .addComponent(txt_Brans, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btn_Kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Bul, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btn_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btn_Guncelle))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_TCNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(rb_Bay)
                                    .addComponent(rb_Bayan))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_Sehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_Yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_Eposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_Brans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(500, 500, 500)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Bul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KaydetActionPerformed
         boolean durum=false;//boolean tipinde durum değişkeni atandı ve false değeri verildi.
         Doktorlar me=new Doktorlar();//Doktorlar sınıfına me isimli değişken atadık.
         me.setM_TCNo(Long.valueOf(txt_TCNo.getText()));//TCNo değeri me değişkeni gettext ile okuyup settext ile yazıldı.
         me.setM_Ad(txt_Ad.getText());//Adi değeri  me değişkeni gettext ile okuyup settext ile yazıldı.
         me.setM_Soyad(txt_Soyad.getText());// Soyadi değeri  me değişkeni gettext ile okuyup settext ile yazıldı.
          if (rb_Bay.isSelected()==true) {//Cinsiyet değeri bay seçilme durumunda true olması sağlandı.
            me.setM_Cinsiyet(true);//Cinsiyet değeri yazdırıldı
        }
        if (rb_Bayan.isSelected()==true) {//Cinsiyet değeri bayan seçilme durumunda false olması sağlandı.
            me.setM_Cinsiyet(false);//Cinsiyet değeri yazdırıldı.
        }
        me.setM_Sehir(txt_Sehir.getText());//Sehir değeri me değişkeni gettext ile okuyup settext ile yazıldı.
        me.setM_Adres(txt_Adres.getText());//Adres değeri me değişkeni gettext ile okuyup settext ile yazıldı.
        me.setM_Yas(txt_Yas.getText());//Yas değeri me değişkeni gettext ile okuyup setext ile yazıldı.
        me.setM_Eposta(txt_Eposta.getText());//Eposta değeri me değişkeni gettext ile okuyup setext ile yazıldı.
        me.setM_Brans(txt_Brans.getText());//Brans değeri me değişkeni gettext ile okuyup settext ile yazıldı.
        durum=me.doktorEkle(me);//me değişkeni ile eklediğimiz doktor kayıtları durum değişkenine atandı.
         temizle();//Yazdığımız bilgiler textfield den ve radio buttondan temizlendi.
        
    }//GEN-LAST:event_btn_KaydetActionPerformed

    private void btn_BulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BulActionPerformed
        btn_Kaydet.setEnabled(false);//Kaydet butonu pasif oldu 
    btn_Guncelle.setEnabled(true);//Güncelle butonu aktif oldu.
    btn_Sil.setEnabled(true);//Sil butonu aktif oldu.
    boolean durum=false;//Boolean tipinde durum değişkenine false değeri atandı.
    Doktorlar mb=new Doktorlar();//Doktorlar kısmına mb adında değişken oluşturuldu.
    mb.setM_TCNo(Long.valueOf(txt_TCNo.getText()));//TCNo değeri mb değişkeni gettext ile okuyup settext ile  yazıldı.
    durum=mb.doktorBul(mb);//Durum değişkenine mb değişkeni ile kaydettiğimiz doktorun bulunması sağlanıyor.
    
    txt_Ad.setText(mb.getM_Ad());//Ad değeri mb değişkeni gettext ile okuyup settext ile yazıldi.
    txt_Soyad.setText(mb.getM_Soyad());// Soyadi değeri  mb değişkeni gettext ile okuyup settext ile yazıldı.
        if (mb.isM_Cinsiyet()==true) {// Cinsiyet değeri bay seçilme durumunda true olması sağlandı.   
            rb_Bay.setSelected(true);
        }
     if (mb.isM_Cinsiyet()==false) {// Cinsiyet değeri bayan seçilme durumunda false olması sağlandı.
            rb_Bayan.setSelected(true);
        }
        txt_Adres.setText(mb.getM_Adres());// Adres  değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        txt_Sehir.setText(mb.getM_Sehir());// Sehir değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        txt_Yas.setText(mb.getM_Yas());// Sehir değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        txt_Eposta.setText(mb.getM_Eposta());// Eposta değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        txt_Brans.setText(mb.getM_Brans());// Brans değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        if (!durum) {//Kaydettiğimiz değerleri durum değişkenine atamıştık.Yazdığımız değerler aynı değilse çalışacak method.
            System.out.println("Kayıt Bulunamadı.");// Yazdığımız değerler aynı değilse Kayıt Bulunumadı yazısı ekrana yazdırılacak.
            temizle();
            
        }
    }//GEN-LAST:event_btn_BulActionPerformed

    private void btn_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SilActionPerformed
      
         btn_Guncelle.setEnabled(false);// Güncelle butonu pasif oldu.
    btn_Sil.setEnabled(false);//Sil butonu pasif oldu.
    btn_Kaydet.setEnabled(true);//Kaydet butonu aktif oldu.
    btn_Bul.setEnabled(true);//Bul butonu aktif oldu.
    boolean durum=false;//Boolean tipinde durum değişkenine false değeri atandı.
    Doktorlar ms=new Doktorlar();//Doktorlar java classına ms isimli değişken atandı.
    ms.setM_TCNo(Long.valueOf(txt_TCNo.getText()));// TCNo değeri ms değişkeni gettext ile okuyup settext ile  yazıldı.
    durum=ms.doktorSil(ms);//durum değişkenine doktorSil komutu ile TCNo yazan doktorun silinmesi komutu.
    temizle();//Temizleme işlemi yapıldı.
    }//GEN-LAST:event_btn_SilActionPerformed

    private void btn_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuncelleActionPerformed
         btn_Guncelle.setEnabled(false);//Güncelle butonu pasif oldu.
      btn_Sil.setEnabled(false);//Sil butonu pasif oldu.
      btn_Kaydet.setEnabled(true);//Kaydet butonu aktif oldu.
      
      btn_Bul.setEnabled(true);//Bul butonu aktif oldu.
      
      boolean durum=false;//Boolean tipinde durum değişkenine false değeri atandı.
      Doktorlar mg=new Doktorlar();//Doktorlar java classa mg değişkeni atadık.
      mg.setM_TCNo(Long.valueOf(txt_TCNo.getText()));// TCNo değeri mg değişkeni gettext ile okuyup settext ile  yazıldı.
      mg.setM_Ad(txt_Ad.getText());// Ad değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
      mg.setM_Soyad(txt_Soyad.getText());// Soyad değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        if (rb_Bay.isSelected()==true) {//Cinsiyet değeri bay seçilme durumunda true olması sağlandı.   
            mg.setM_Cinsiyet(true);//Cinsiyet değeri güncellendi
        }
        if (rb_Bayan.isSelected()==true) {// Cinsiyet değeri bayan seçilme durumunda false olması sağlandı.   
            mg.setM_Cinsiyet(false);//Cinsiyet değeri yazdırıldı.
        }
        mg.setM_Adres(txt_Adres.getText());// Adres değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        mg.setM_Sehir(txt_Sehir.getText());// Sehir değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        mg.setM_Yas(txt_Yas.getText());// Yas değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        mg.setM_Eposta(txt_Eposta.getText());// Eposta değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        mg.setM_Brans(txt_Brans.getText());// Brans değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        durum=mg.doktorGuncelle(mg);//durum değişkenine doktorGuncelle komutu ile TCNo yazan doktor güncellenmesi  komutu.
        temizle();  //Temizleme yapıldı.
    }//GEN-LAST:event_btn_GuncelleActionPerformed

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
            java.util.logging.Logger.getLogger(doktorbilgisi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doktorbilgisi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doktorbilgisi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doktorbilgisi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doktorbilgisi2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Bul;
    private javax.swing.JButton btn_Guncelle;
    private javax.swing.JButton btn_Kaydet;
    private javax.swing.JButton btn_Sil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rb_Bay;
    private javax.swing.JRadioButton rb_Bayan;
    private javax.swing.JTextField txt_Ad;
    private javax.swing.JTextField txt_Adres;
    private javax.swing.JTextField txt_Brans;
    private javax.swing.JTextField txt_Eposta;
    private javax.swing.JTextField txt_Sehir;
    private javax.swing.JTextField txt_Soyad;
    private javax.swing.JTextField txt_TCNo;
    private javax.swing.JTextField txt_Yas;
    // End of variables declaration//GEN-END:variables
}
