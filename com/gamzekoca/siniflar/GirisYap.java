/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gamzekoca.siniflar;
import com.gamzekoca.veritabani.VeriTabanı;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gkoca
 */
public class GirisYap {
    ResultSet rs;//Statement nesnelerini kullanarak sql sorgusunu çalıştırdıktan sonra veri tabanına verileri saklar.

    PreparedStatement ps;//sql ifadelerimizi önceden derlemek için kullandığımız sınıf.

    public boolean giris(String kAdi, String ksifre) {

        VeriTabanı vt = new VeriTabanı();//Veri tabanı sayfasına vt adlı değişken oluşturduk.
        vt.baglan();//Veri tabanına bağlandık.
        String sorgu = "select * from kullanicibilgisi where kullaniciAdi=?";//kullanicibilgisi tablosunu 
        try {
            ps = vt.con.prepareStatement(sorgu);//Sorgu gönderdik.
            ps.setString(1, kAdi);//kAdi değişkeni yazdırıldı.
            rs = ps.executeQuery();// Sorguyu çalıştır sonuçları rs'ye gönder.
            while (rs.next()) {//sorgu devam eder.
                String ka = rs.getString("kullaniciAdi");//Kullaniciadi değeri okundu.
                String s = rs.getString("sifre");//sifre değeri okundu.
                if (ka.equals(kAdi) && s.equals(ksifre)) {//k_Adi ve ksifre eşitliği kontrol ediliyor.
                    return true;//doğruysa değer döndürecek.
                } else {
                    return false;//yanlışsa değer döndürelecek.
                }

            }

            rs.close();//rs ye değer gönderme kapandı.
            ps.close();//sorgu kapandı
            vt.kapat();//veri tabanı bağlantısı kapatıldı.

        } catch (Exception e) {
            System.out.println(e);//Hata olunca yazdırılacak komut
        }
        return false;

    }
}
