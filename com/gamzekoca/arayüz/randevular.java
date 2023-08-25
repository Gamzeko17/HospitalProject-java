/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gamzekoca.arayüz;
import com.gamzekoca.siniflar.randevukisi;

/**
 *
 * @author gkoca
 */
public class randevular extends javax.swing.JFrame {

    
    
    public randevular() {
        initComponents();//Kodların çalıştırıldığı kısım.
         btn_Guncelle.setEnabled(false);//Güncelle butonu pasif olacak.
     btn_Sil.setEnabled(false);// Sil butonu pasif olacak.
     temizle();
    }
     public void temizle(){// Yazdığımız metinlerin temizlenmesini sağlayan method.
    txt_TCNo.setText("");//TCNo textfield ı temizlendi.
    txt_Ad.setText("");//Ad textfield ı temizlendi.
    txt_Soyad.setText("");//Soyad textfield ı temizlendi.
    txt_Adres.setText("");//Adres textfield ı temizlendi.
    txt_DogumYeri.setText("");//DogumYeri textfield ı temizlendi.
    txt_Yas.setText("");//Yas textfield ı temizlendi.
    txt_Eposta.setText("");//Eposta textfield ı temizlendi.
    txt_Sigortatürü.setText("");//Sigortatürü textfield ı temizlendi.
    txt_Poliklinik.setText("");//Poliklinik textfield ı temizlendi.
    
    
    buttonGroup1.clearSelection();// Cinsiyet radio buttton seçili olan buton temizlendi.
    
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
        jLabel11 = new javax.swing.JLabel();
        btn_Kaydet = new javax.swing.JButton();
        btn_Bul = new javax.swing.JButton();
        btn_Sil = new javax.swing.JButton();
        btn_Guncelle = new javax.swing.JButton();
        txt_TCNo = new javax.swing.JTextField();
        txt_Ad = new javax.swing.JTextField();
        txt_Soyad = new javax.swing.JTextField();
        rb_Bay = new javax.swing.JRadioButton();
        rb_Bayan = new javax.swing.JRadioButton();
        txt_Adres = new javax.swing.JTextField();
        txt_DogumYeri = new javax.swing.JTextField();
        txt_Yas = new javax.swing.JTextField();
        txt_Eposta = new javax.swing.JTextField();
        txt_Sigortatürü = new javax.swing.JTextField();
        txt_Poliklinik = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hasta.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setText("TCNo");

        jLabel3.setText("Ad");

        jLabel4.setText("Soyad");

        jLabel5.setText("Cinsiyet");

        jLabel6.setText("Adres");

        jLabel7.setText("DogumYeri");

        jLabel8.setText("Yas");

        jLabel9.setText("Eposta");

        jLabel10.setText("Sigortatürü");

        jLabel11.setText("Poliklinik");

        btn_Kaydet.setText("Kaydet");
        btn_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KaydetActionPerformed(evt);
            }
        });

        btn_Bul.setText("Bul");
        btn_Bul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BulActionPerformed(evt);
            }
        });

        btn_Sil.setText("Sil");
        btn_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SilActionPerformed(evt);
            }
        });

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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(btn_Kaydet))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Bul)
                        .addGap(67, 67, 67)
                        .addComponent(btn_Sil)
                        .addGap(35, 35, 35)
                        .addComponent(btn_Guncelle))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TCNo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_Bay)
                        .addGap(52, 52, 52)
                        .addComponent(rb_Bayan))
                    .addComponent(txt_Ad)
                    .addComponent(txt_Soyad)
                    .addComponent(txt_Adres)
                    .addComponent(txt_DogumYeri)
                    .addComponent(txt_Yas)
                    .addComponent(txt_Eposta)
                    .addComponent(txt_Sigortatürü)
                    .addComponent(txt_Poliklinik, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_TCNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_Bay)
                    .addComponent(rb_Bayan))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_DogumYeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Eposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_Sigortatürü, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_Poliklinik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Kaydet)
                    .addComponent(btn_Bul)
                    .addComponent(btn_Sil)
                    .addComponent(btn_Guncelle))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KaydetActionPerformed
         boolean durum=false;//boolean tipinde durum değişkeni atandı ve false değeri verildi.
       randevukisi me=new randevukisi();// randevukisi sınıfına me isimli değişken atadık.
       me.setM_TCNo(Long.valueOf(txt_TCNo.getText()));// TCNo değeri me değişkeni gettext ile okuyup settext ile  yazıldı.
       me.setM_Ad(txt_Ad.getText());// Adi değeri  me değişkeni gettext ile okuyup settext ile yazıldı.
       me.setM_Soyad(txt_Soyad.getText());// Soyadi değeri  me değişkeni gettext ile okuyup settext ile yazıldı.
        if (rb_Bay.isSelected()==true) {// Cinsiyet değeri bay seçilme durumunda true olması sağlandı.   
            me.setM_Cinsiyet(true);//Cinsiyet değeri yazdırıldı
        }
        if (rb_Bayan.isSelected()==true) {// Cinsiyet değeri bayan seçilme durumunda false olması sağlandı.
            me.setM_Cinsiyet(false);//Cinsiyet değeri yazdırıldı.
        }
        me.setM_DogumYeri(txt_DogumYeri.getText());// DogumYeri değeri me değişkeni gettxt ile okuyup settext ile yazıldı.
        me.setM_Adres(txt_Adres.getText());// Adres değeri me değişkeni gettxt ile okuyup settext ile yazıldı.
        me.setM_Yas(txt_Yas.getText());// Yas değeri me değişkeni gettxt ile okuyup settext ile yazıldı.
        me.setM_Eposta(txt_Eposta.getText());// Eposta değeri me değişkeni gettxt ile okuyup settext ile yazıldı.
        me.setM_Sigortatürü(txt_Sigortatürü.getText());// Sigortatürü değeri me değişkeni gettxt ile okuyup settext ile yazıldı.
        me.setM_Poliklinik(txt_Poliklinik.getText());// Poliklinik değeri me değişkeni gettxt ile okuyup settext ile yazıldı.
       
        durum=me.randevuEkle(me);//me değişkeni ile eklediğimiz randevu kayıtları durum değişkenine atandı. 
        temizle();//Yazdığımız bilgiler textfield den ve radio buttondan temizlendi.
    }//GEN-LAST:event_btn_KaydetActionPerformed

    private void btn_BulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BulActionPerformed
        
           btn_Kaydet.setEnabled(false);//Kaydet butonu pasif oldu.
    btn_Guncelle.setEnabled(true);// Güncelle butonu aktif oldu.
    btn_Sil.setEnabled(true);// Sil butonu aktif oldu.
    boolean durum=false;//Boolean tipinde durum değişkenine false değeri atandı.
    randevukisi mb=new randevukisi();//randevukisi kısmına mb adında değişken oluşturuldu.
    mb.setM_TCNo(Long.valueOf(txt_TCNo.getText()));// TCNo değeri mb değişkeni gettext ile okuyup settext ile  yazıldı.
    durum=mb.randevuBul(mb);//Durum değişkenine mb değişkeni ile kaydettiğimiz randevu bulunması sağlanıyor.
    
    txt_Ad.setText(mb.getM_Ad());// Ad değeri  mb değişkeni gettext ile okuyup settext ile yazıldı.
    txt_Soyad.setText(mb.getM_Soyad());// Soyad değeri  mb değişkeni gettext ile okuyup settext ile yazıldı.
        if (mb.isM_Cinsiyet()==true) {// Cinsiyet değeri bay seçilme durumunda true olması sağlandı.   
            rb_Bay.setSelected(true);
        }
     if (mb.isM_Cinsiyet()==false) {// Cinsiyet değeri bayan seçilme durumunda false olması sağlandı.
            rb_Bayan.setSelected(true);
        }
        txt_Adres.setText(mb.getM_Adres());// Adres  değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        txt_DogumYeri.setText(mb.getM_DogumYeri());// DogumYeri  değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        txt_Yas.setText(mb.getM_Yas());// Yas  değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        txt_Eposta.setText(mb.getM_Eposta());// Eposta  değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        txt_Sigortatürü.setText(mb.getM_Sigortatürü());// Sigortatürü  değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        txt_Poliklinik.setText(mb.getM_Poliklinik());// Poliklinik  değeri mb değişkeni gettext ile okuyup settext ile yazıldı.
        
        if (!durum) {//Kaydettiğimiz değerleri durum değişkenine atamıştık.Yazdığımız değerler aynı değilse çalışacak method.
            System.out.println("Kayıt Bulunamadı.");// Yazdığımız değerler aynı değilse Kayıt Bulunumadı yazısı ekrana yazdırılacak.
            temizle();
            
        }
    }//GEN-LAST:event_btn_BulActionPerformed

    private void btn_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SilActionPerformed
         btn_Guncelle.setEnabled(false);//Güncelle butonu pasif olfu.
    btn_Sil.setEnabled(false);// Sil butonu pasif oldu
    btn_Kaydet.setEnabled(true);// Kaydet butonu aktif oldu.
    btn_Bul.setEnabled(true);// Bul butonu aktif oldu. 
    boolean durum=false;//Boolean tipinde durum değişkenine false değeri atandı.
    randevukisi ms=new randevukisi();//randevukisi  java classına ms isimli değişken atandı.
    ms.setM_TCNo(Long.valueOf(txt_TCNo.getText()));// TCNo değeri ms değişkeni gettext ile okuyup settext ile  yazıldı.
    durum=ms.randevuSil(ms);//durum değişkenine randevuSil komutu ile TCNo yazan müşteri silinmesi komutu.
    temizle();// temizleme işlemi yapıldı.
        
    }//GEN-LAST:event_btn_SilActionPerformed

    private void btn_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuncelleActionPerformed
        btn_Guncelle.setEnabled(false);//Güncelle butonu pasif oldu.
      btn_Sil.setEnabled(false);//Sil butonu pasif oldu.
      btn_Kaydet.setEnabled(true);// Kaydet butonu aktif oldu. 
      
      btn_Bul.setEnabled(true);//Bul butonu aktif oldu.
      
      boolean durum=false;//Boolean tipinde durum değişkenine false değeri atandı.
      randevukisi mg=new randevukisi();//Randevukisi java classına mg değişkeni atandı.
      mg.setM_TCNo(Long.valueOf(txt_TCNo.getText()));// TCNo değeri mg değişkeni gettext ile okuyup settext ile  yazıldı.
      mg.setM_Ad(txt_Ad.getText());// Ad değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
      mg.setM_Soyad(txt_Soyad.getText());// Soyad değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        if (rb_Bay.isSelected()==true) {//Cinsiyet değeri bay seçilme durumunda true olması sağlandı.   
            mg.setM_Cinsiyet(true);//Cinsiyet değeri güncellendi.
        }
        if (rb_Bayan.isSelected()==true) {// Cinsiyet değeri bayan seçilme durumunda false olması sağlandı.   
            mg.setM_Cinsiyet(false);//Cinsiyet değeri yazdırıldı.
        }
        mg.setM_Adres(txt_Adres.getText());// Adres değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        mg.setM_DogumYeri(txt_DogumYeri.getText());// DogumYeri değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        mg.setM_Yas(txt_Yas.getText());// Yas değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        mg.setM_Eposta(txt_Eposta.getText());// Eposta değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        mg.setM_Sigortatürü(txt_Sigortatürü.getText());// Sigortatürü değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
        mg.setM_Poliklinik(txt_Poliklinik.getText());// Poliklinik değeri  mg değişkeni gettext ile okuyup settext ile yazıldı.
       
        durum=mg.randevuGuncelle(mg);//durum değişkenine randevuGuncelle komutu ile TCNo yazan müşteri güncellenmesi  komutu.
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
            java.util.logging.Logger.getLogger(randevular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(randevular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(randevular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(randevular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new randevular().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField txt_DogumYeri;
    private javax.swing.JTextField txt_Eposta;
    private javax.swing.JTextField txt_Poliklinik;
    private javax.swing.JTextField txt_Sigortatürü;
    private javax.swing.JTextField txt_Soyad;
    private javax.swing.JTextField txt_TCNo;
    private javax.swing.JTextField txt_Yas;
    // End of variables declaration//GEN-END:variables
}
