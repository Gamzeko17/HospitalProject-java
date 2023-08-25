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
public class randevukisi {
    PreparedStatement ps;// Sorguları göndermeden önce derler.
    ResultSet rs;//Sorgu sonuçlarını üzerinde tutar.
    VeriTabanı vt = new VeriTabanı();// Veri tabanı sayfamıza vt isimli yeni değişken atadık.

    private int m_No;//int tipinde m_No değişkeni atadık.
    private long m_TCNo;//long tipinde m_TCNo değişkeni atadık.
    private String m_Ad;//String tipinde m_Ad değişkeni atadık.
    private String m_Soyad;//String tipinde m_Soyad değişkeni atadık.
    private boolean m_Cinsiyet;//booelan tipinde m_Cinsiyet değişkeni atadık.
    private String m_Adres;//String tipinde m_Adres değişkeni atadık.
    private String m_DogumYeri;//String tipinde m_DogumYeri değişkeni atadık.
    private String m_Yas;//String tipinde m_Yas değişkeni atadık.
    private String m_Eposta;//String tipinde m_Eposta değişkeni atadık.
    private String m_Sigortatürü;//String tipinde m_Sigorta değişkeni atadık.
    private String m_Poliklinik;//String tipinde m_Poliklinik değişkeni atadık.
    
    public int getM_No() {//M_No metodu okundu.
        return m_No;//değer döndürüldü.
    }

    public void setM_No(int m_No) {//M_No değeri yazdırılacak.
        this.m_No = m_No;//Bu değer m_No ya aktarılacak.
    }

    public long getM_TCNo() {//TCNo değeri okunacak.
        return m_TCNo;//değer döndürelecek.
    }

    public void setM_TCNo(long m_TCNo) {//TCNo değeri yazdırlacak.
        this.m_TCNo = m_TCNo;//Bu değer m_TCNo ya aktarılacak.
    }

    public String getM_Ad() {//M_Ad değeri okunacak.
        return m_Ad;//değer döndürelecek.
    }

    public void setM_Ad(String m_Ad) {//m_Ad değeri yazdırılacak.
        this.m_Ad = m_Ad;// Bu değer m_Ad ye aktarılacak.
    }

    public String getM_Soyad() {//M_Soyad değeri okunacak.
        return m_Soyad;//değer döndürüldü.
    }

    public void setM_Soyad(String m_Soyad) {// m_Soyad yazdırılacak.
        this.m_Soyad = m_Soyad;// bu değer m_Soyad ya aktarılacak.
    }

    public boolean isM_Cinsiyet() {//Cinsiyet değeri okunacak.
        return m_Cinsiyet;//değer döndürüldü.
    }

    public void setM_Cinsiyet(boolean m_Cinsiyet) {// m_Cinsiyet değeri yazdırıldı.
        this.m_Cinsiyet = m_Cinsiyet;// Bu değer m_Cinsiyet e aktarıldı.
    }

    public String getM_Adres() {//M_Adres değeri okundu.
        return m_Adres;//değer döndürüldü.
    }

    public void setM_Adres(String m_Adres) {//m_Adres yazdırılacak.
        this.m_Adres = m_Adres;// Bu değer m_Adres e aktarıldı.
    }

    public String getM_DogumYeri() {//M_DogumYeri değeri okundu.
        return m_DogumYeri;//değer döndürüldü.
    }

    public void setM_DogumYeri(String m_DogumYeri) {// Bu değer m_DogumYeri e aktarıldı.
        this.m_DogumYeri = m_DogumYeri;// Bu değer m_DogumYeri e aktarıldı.
    }

    public String getM_Yas() {//M_Yas değeri okundu.
        return m_Yas;//değer döndürüldü.
    }

    public void setM_Yas(String m_Yas) {//m_Yas değeri okundu.
        this.m_Yas = m_Yas;//Bu değer m_Yas a aktarıldı.
    }

    public String getM_Eposta() {//M_Eposta değeri okundu.
        return m_Eposta; //değer döndürüldü.
    }

    public void setM_Eposta(String m_Eposta) {//m_Eposta değeri yazdırıldı.
        this.m_Eposta = m_Eposta;//Bu değer m_Eposta değerine aktarıldı.
    }

    public String getM_Sigortatürü() {//M_Sigortatürü değeri okundu.
        return m_Sigortatürü;//değer döndürüldü.
    }

    public void setM_Sigortatürü(String m_Sigortatürü) {//m_Sigortatürü değeri yazdırıldı.
        this.m_Sigortatürü = m_Sigortatürü;//Bu değer m_Sigortatürü değerine aktarıldı.
    }

    public String getM_Poliklinik() {//M_Poliklinik değeri okundu.
        return m_Poliklinik;//değer döndürüldü.
    }

    public void setM_Poliklinik(String m_Poliklinik) {//m_Poliklinik değeri yazdırıldı.
        this.m_Poliklinik = m_Poliklinik;//Bu değer m_Sigortatürü değerine aktarıldı.
    }
    public boolean randevuEkle(randevukisi m_ekle) {//Randevu ekle methodu oluşturuldu.

        try {//Kodların olduğu bölümdür.
            vt.baglan();// Veri tabanına bağlanırız.
            String sorgu = "insert into randevular (TCNo,Ad,Soyad,Cinsiyet,Adres,DogumYeri,Yas,Eposta,Sigortatürü,Poliklinik) values (?,?,?,?,?,?,?,?,?,?)";//Sorgu değişkeni oluşturup veri tabanına eklediğimiz verilere karşılık gelmesini istediğimiz kısımlar bulunur.
            ps = vt.con.prepareStatement(sorgu);//Veri tabanına eklediğimiz değerleri sorgu şeklinde çalıştırıyoruz.
            ps.setLong(1, m_ekle.getM_TCNo());//TCNo değerinin okunmasını sağlarız.
            ps.setString(2, m_ekle.getM_Ad());//Ad değerinin okunmasını sağlarız.
            ps.setString(3, m_ekle.getM_Soyad());//Soyad değerinin okunmasını sağlarız.
            ps.setBoolean(4, m_ekle.isM_Cinsiyet());//Cinsiyet değerinin okunmasını sağlarız.
            ps.setString(5, m_ekle.getM_Adres());//Adres değerinin okunmasını sağlarız.
            ps.setString(6, m_ekle.getM_DogumYeri());//DogumYeri değerinin okunmasını sağlarız.
            ps.setString(7, m_ekle.getM_Yas());//Yas değerinin okunmasını sağlarız.
            ps.setString(8, m_ekle.getM_Eposta());//Eposta değerinin okunmasını sağlarız.
            ps.setString(9, m_ekle.getM_Sigortatürü());//Sigortatürü değerinin okunmasını sağlarız.
            ps.setString(10, m_ekle.getM_Poliklinik());//Poliklinik değerinin okunmasını sağlarız.
            
          
          
            ps.execute();//Sorgu çalıştırıldı.
            ps.close();//Sorguyu kapatma işlemi 
            vt.kapat();//Veri tabanını kapatma işlemi 

            return true;//değer döndürelecek
        } catch (Exception e) {
            System.out.println(e);//Hata olduğunda hatanın tipi yazdırılacak.
        }

        return true;// değer döndürelecek
    }
 public boolean randevuBul(randevukisi m_bul){//randevu Bul metodu oluşturuldu.
try{//Kodların olduğu kısım 
vt.baglan();//Veri tabanına bağlandık.
String sorgu="select * from randevular where TCNo=?";// TCNo girildiğinde diğer eklediğimiz bilgileri getirecek sorgu.
ps=vt.con.prepareStatement(sorgu);//Veri tabanına bağlanılarak sorgu çalışmasını isteriz.
ps.setLong(1, m_bul.getM_TCNo());//Bulduğun parametreyi getir ve koy

rs=ps.executeQuery();//ps çalıştığı zaman sorgu sonucunu rs nesnesine at.
rs.next();//Kayıt ilerletiliyor.
setM_Ad(rs.getString("Ad"));//M_Ad değerine Ad olan bilgiyi oku ve rs değişkenine gönder.
setM_Soyad(rs.getString("Soyad"));//M_Soyad değerine Soyad olan bilgiyi oku ve rs değişkenine gönder.
setM_Cinsiyet(rs.getBoolean("Cinsiyet"));//M_Cinsiyet değerine Cinsiyet olan bilgiyi oku ve rs değişkenine gönder.
setM_Adres(rs.getString("Adres"));//M_Adres değerine Adres olan bilgiyi oku ve rs değişkenine gönder.
setM_DogumYeri(rs.getString("DogumYeri"));//M_DogumYeri değerine DogumYeri olan bilgiyi oku ve rs değişkenine gönder.
setM_Yas(rs.getString("Yas"));//M_Yas değerine Yas olan bilgiyi oku ve rs değişkenine gönder.
setM_Eposta(rs.getString("Eposta"));//M_Eposta değerine Eposta olan bilgiyi oku ve rs değişkenine gönder.
setM_Sigortatürü(rs.getString("Sigortatürü"));//M_Sigortatürü değerine Sigortatürü olan bilgiyi oku ve rs değişkenine gönder.
setM_Poliklinik(rs.getString("Poliklinik"));//M_Poliklinik değerine Poliklinik olan bilgiyi oku ve rs değişkenine gönder.



ps.close();//Sorgu kapatıldı.
vt.kapat();//Veri tabanı kapatıldı.
return true;// değer döndürüldü.
}catch(Exception e){
    System.out.println(e);// Hata olduğunda yazdırılacak hata kodu.
return false;//değer döndürüldü.
}
 }
 public boolean randevuSil(randevukisi m_sil){//randevuSil methodu oluşturuldu.
  try{//Komutların olduğu method.
  vt.baglan();//Veri tabanına bağlanırız.
  String sorgu="delete from randevular where TCNo=?";//TCNo değeri yazılıp bulunan diğer değerler ile birlikte veri tabanından silme işlemi yapılır.
  ps=vt.con.prepareStatement(sorgu);//Veri tabanına bağlanılarak sorgu çalışmasını isteriz.
  ps.setLong(1, m_sil.getM_TCNo());//Silme işlemi TCNo değeri bulunup okunması sağlanır
  ps.execute();//Sorgu çalıştırıldı.
  ps.close();//Sorgu kapatıldı.
  vt.kapat();//Veri tabanı kapatıldı.
  return true;// değer döndürüldü.
  
  }catch(Exception e){
      System.out.println(e);// Hata olduğunda yazdırılacak hata kodu.
      return false;// değer döndürüldü.
  }
  
  }
 public boolean randevuGuncelle(randevukisi m_guncelle){//RandevuGuncelle methodu oluşturuldu.
    try{
    vt.baglan();//Veri tabanına bağlanırız.
    String sorgu="update randevular set Ad=?,Soyad=?,Cinsiyet=?,Adres=?,DogumYeri=?,Yas=?,Eposta=?,Sigortatürü=?,Poliklinik=? where TCNo=?";//TCNo değeri girilip bulunan diğer değerler ile birlikte bilgilerin güncellenmesi sorgusu.
    ps=vt.con.prepareStatement(sorgu);//Veri tabanına bağlanılarak sorgu çalışmasını isteriz.
    ps.setString(1,m_guncelle.getM_Ad());//M_Ad değeri okundu ve ps değişkenine atandı.
    ps.setString(2, m_guncelle.getM_Soyad());//M_Soyad değeri okundu ve ps değişkenine atandı.
    ps.setBoolean(3, m_guncelle.isM_Cinsiyet());//M_Cinsiyet değeri okundu ve ps değişkenine atandı.
    ps.setString(4, m_guncelle.getM_Adres());//M_Adres değeri okundu ve ps değişkenine atandı.
    ps.setString(5, m_guncelle.getM_DogumYeri());//M_DogumYeri değeri okundu ve ps değişkenine atandı.
    ps.setString(6, m_guncelle.getM_Yas());//M_Yas değeri okundu ve ps değişkenine atandı.
    ps.setString(7, m_guncelle.getM_Eposta());//M_Eposta değeri okundu ve ps değişkenine atandı.
    ps.setString(8, m_guncelle.getM_Sigortatürü());//M_Sigortatürü değeri okundu ve ps değişkenine atandı.
    ps.setString(9, m_guncelle.getM_Poliklinik());//M_Poliklinik değeri okundu ve ps değişkenine atandı.
    ps.setLong(10, m_guncelle.getM_TCNo());//M_TCNo değeri okundu ve ps değişkenine atandı.
     
    ps.execute();//Komutların güncellenmesi sağlanır.
    ps.close();//Sorgu kapatıldı.
    vt.kapat();//Veri tabanı kapatıldı.
    return true;// değer döndürüldü.
    
    
    
        
    }catch(Exception e){
        System.out.println(e);// Hata olduğunda yazdırılacak hata kodu.
        return false;// değer döndürüldü.
        }
    
    }
    
    

    
}
