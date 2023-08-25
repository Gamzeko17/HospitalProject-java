

package com.gamzekoca.veritabani;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author gkoca
 */
public class VeriTabanı {
     public Connection con;//Connection sınıfından con diye bir nesne oluşturuldu.
    private String url="jdbc:mysql://localhost:3306/";//Kullanacağımız veri tabanı veri tabanı adresi ve port numarası
    private String dbname="hastaneveritabani1";//Kullanacağımız veri tabanı adresi ve port numarası
    private String driver="com.mysql.jdbc.Driver";//Kullanacağımız sürücü adresi
    private String username="root";//Veri tabanı bağlantı ismi root olarak ayarlandı.
    private String password="";//Veri tabanı şifresi ayarlandı.
    
    public void baglan()//Baglan adında method oluşturuldu.
    {
       try{
       Class.forName(driver).newInstance();//Sürücü yüklemesi yapar.
       con=DriverManager.getConnection(url+dbname, username,password);//Bağlanacağımız veri tabanı yolu ve adını ve şifresini yazdık.
           System.out.println("Bağlandı.");//Ekrana bağlandı yazdık.
         //  JOptionPane.showMessageDialog(null, "VeriTabanına Bağlandı...");//Ekrana veri tabanı bağlandı yazıldı.
       }catch (Exception ex){
           System.out.println(ex);
         //  JOptionPane.showMessageDialog(null, "VeriTabanına Bağlanamadı"+ ex);//Ekrana veri tabanına bağlanamadı yazıldı.
    }
    
}
    public void kapat()
    {
    try{
    con.close();//Bağlantı kapatıldı.
        System.out.println("Bağlantı Kapatıldı.");//Bağlantı kapatıldı yazıldı.
      //  JOptionPane.showMessageDialog(null, "Bağlantı Kapatıldı.");//consol ekranına hata ve Bağlantı Kapatıldı yazdırıldı.
    }catch(Exception ex){
        System.out.println(ex);
       // JOptionPane.showMessageDialog(null, "Bağlantı Kapatma Hatası"+ex);//Console ekranına hata ve Bağlantı Kapatma hatası yazdırıldı.
    }
     
    }
}
