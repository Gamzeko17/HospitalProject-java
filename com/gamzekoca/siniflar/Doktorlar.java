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
public class Doktorlar {
     PreparedStatement ps;// Sorguları göndermeden önce derler.
    ResultSet rs;//Sorgu sonuçlarını üzerinde tutar.
    VeriTabanı vt = new VeriTabanı();// Veri tabanı sayfamıza vt isimli yeni değişken atadık.

    private int m_No;//int tipinde m_No değişkeni atadık.
    private long m_TCNo;//long tipinde m_TCNo değişkeni atadık.
    private String m_Ad;//String tipinde m_Ad değişkeni atadık.
    private String m_Soyad;//String tipinde m_Soyad değişkeni atadık.
    private boolean m_Cinsiyet;//booelan tipinde m_Cinsiyet değişkeni atadık.
    private String m_Adres;//String tipinde m_Adres değişkeni atadık.
    private String m_Sehir;//String tipinde m_Sehir değişkeni atadık.
    private String m_Yas;//String tipinde m_Yas değişkeni atadık.
    private String m_Eposta;//String tipinde m_Eposta değişkeni atadık.
    private String m_Brans;//String tipinde m_Bras değişkeni atadık.

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
        return m_Soyad;// bu değer m_Soyad ya aktarılacak.
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

    public String getM_Sehir() {//M_Sehir değeri okundu.
        return m_Sehir;//değer döndürüldü.
    }

    public void setM_Sehir(String m_Sehir) {//m_Sehir değeri yazdırıldı.
        this.m_Sehir = m_Sehir;//Bu değer m_Sehir e aktarıldı.
    }

    public String getM_Yas() {//M_Yas değeri okundu.
        return m_Yas;//değer döndürüldü.
    }

    public void setM_Yas(String m_Yas) {//m_Yas değeri okundu.
        this.m_Yas = m_Yas;//Bu değer m_Yas a aktarıldı.
    }

    public String getM_Eposta() {//M_Eposta değeri okundu.
        return m_Eposta;//değer döndürüldü.
    }

    public void setM_Eposta(String m_Eposta) {//m_Eposta değeri yazdırıldı.
        this.m_Eposta = m_Eposta;//Bu değer m_Eposta değerine aktarıldı.
    }

    public String getM_Brans() {//M_Brans değeri okundu.
        return m_Brans;//değer döndürüldü.
    }

    public void setM_Brans(String m_Brans) {//m_Brans değeri yazdırıldı.
        this.m_Brans = m_Brans;//Bu değer m_Brans değerine aktarıldı.
    }
    
 public boolean doktorEkle(Doktorlar m_ekle) {//doktor ekle methodu oluşturuldu.

        try {//Kodların olduğu bölümdür.
            vt.baglan();// Veri tabanına bağlanırız.
            String sorgu = "insert into doktorbilgisi (TCNo,Ad,Soyad,Cinsiyet,Adres,Sehir,Yas,Eposta,Brans) values (?,?,?,?,?,?,?,?,?)";//Sorgu değişkeni oluşturup veri tabanına eklediğimiz verilere karşılık gelmesini istediğimiz kısımlar bulunur.
            ps = vt.con.prepareStatement(sorgu);//Veri tabanına eklediğimiz değerleri sorgu şeklinde çalıştırıyoruz.
            ps.setLong(1, m_ekle.getM_TCNo());//TCNo değerinin okunmasını sağlarız.
            ps.setString(2, m_ekle.getM_Ad());//Ad değerinin okunmasını sağlarız.
            ps.setString(3, m_ekle.getM_Soyad());//Soyad değerinin okunmasını sağlarız.
            ps.setBoolean(4, m_ekle.isM_Cinsiyet());//Cinsiyet değerinin okunmasını sağlarız.
            ps.setString(5, m_ekle.getM_Adres());//Adres değerinin okunmasını sağlarız.
            ps.setString(6, m_ekle.getM_Sehir());//Sehir değerinin okunmasını sağlarız.
            ps.setString(7, m_ekle.getM_Yas());//Yas değerinin okunmasını sağlarız.
            ps.setString(8, m_ekle.getM_Eposta());//Eposta değerinin okunmasını sağlarız.
            ps.setString(9, m_ekle.getM_Brans());//Brans değerinin okunmasını sağlarız.
            ps.execute();//Sorgu çalıştırıldı.
            ps.close();//Sorguyu kapatma işlemi 
            vt.kapat();//Veri tabanını kapatma işlemi 

            return true;
        } catch (Exception e) {
            System.out.println(e);//Hata olduğunda hatanın tipi yazdırılacak.
        }

        return true;//değer döndürelecek
    }
 public boolean doktorBul(Doktorlar m_bul){//doktor Bul metodu oluşturuldu.
try{//Kodların olduğu kısım 
vt.baglan();//Veri tabanına bağlandık.
String sorgu="select * from doktorbilgisi where TCNo=?";// TCNo girildiğinde diğer eklediğimiz bilgileri getirecek sorgu.
ps=vt.con.prepareStatement(sorgu);//Veri tabanına bağlanılarak sorgu çalışmasını isteriz.
ps.setLong(1, m_bul.getM_TCNo());//Bulduğun parametreyi getir ve koy

rs=ps.executeQuery();//ps çalıştığı zaman sorgu sonucunu rs nesnesine at.
rs.next();//Kayıt ilerletiliyor.
setM_Ad(rs.getString("Ad"));//M_Ad değerine Ad olan bilgiyi oku ve rs değişkenine gönder.
setM_Soyad(rs.getString("Soyad"));//M_Soyad değerine Soyad olan bilgiyi oku ve rs değişkenine gönder.
setM_Cinsiyet(rs.getBoolean("Cinsiyet"));//M_Cinsiyet değerine Cinsiyet olan bilgiyi oku ve rs değişkenine gönder.
setM_Adres(rs.getString("Adres"));//M_Adres değerine Adres olan bilgiyi oku ve rs değişkenine gönder.
setM_Sehir(rs.getString("Sehir"));//M_Sehir değerine Sehir olan bilgiyi oku ve rs değişkenine gönder.
setM_Yas(rs.getString("Yas"));//M_Yas değerine Yas olan bilgiyi oku ve rs değişkenine gönder.
setM_Eposta(rs.getString("Eposta"));//M_Eposta değerine Eposta olan bilgiyi oku ve rs değişkenine gönder.
setM_Brans(rs.getString("Brans"));//M_Brans değerine Brans olan bilgiyi oku ve rs değişkenine gönder.
ps.close();//Sorgu kapatıldı.
vt.kapat();//Veri tabanı kapatıldı.
return true;// değer döndürüldü.
}catch(Exception e){
    System.out.println(e);// Hata olduğunda yazdırılacak hata kodu.
return false;//değer döndürüldü.
}
    
    

}
  public boolean doktorSil(Doktorlar m_sil){//doktorSil methodu oluşturuldu.
  try{//Komutların olduğu method.
  vt.baglan();//Veri tabanına bağlanırız.
  String sorgu="delete from doktorbilgisi where TCNo=?";//TCNo değeri yazılıp bulunan diğer değerler ile birlikte veri tabanından silme işlemi yapılır.
  ps=vt.con.prepareStatement(sorgu);//Veri tabanına bağlanılarak sorgu çalışmasını isteriz.
  ps.setLong(1, m_sil.getM_TCNo());//Silme işlemi TCNo değeri bulunup okunması sağlanır.
  ps.execute();//Sorgu çalıştırıldı.
  ps.close();//Sorgu kapatıldı.
  vt.kapat();//Veri tabanı kapatıldı.
  return true;// değer döndürüldü.
  
  }catch(Exception e){
      System.out.println(e);// Hata olduğunda yazdırılacak hata kodu.
      return false;// değer döndürüldü.
  }
  
  }
   public boolean doktorGuncelle(Doktorlar m_guncelle){//doktorGuncelle methodu oluşturuldu.
    try{
    vt.baglan();//Veri tabanına bağlanırız.
    String sorgu="update doktorbilgisi set Ad=?,Soyad=?,Cinsiyet=?,Adres=?,Sehir=?,Yas=?,Eposta=?,Brans=? where TCNo=?";//TCNo değeri girilip bulunan diğer değerler ile birlikte bilgilerin güncellenmesi sorgusu.
    ps=vt.con.prepareStatement(sorgu);//Veri tabanına bağlanılarak sorgu çalışmasını isteriz.
    ps.setString(1,m_guncelle.getM_Ad());//M_Ad değeri okundu ve ps değişkenine atandı.
    ps.setString(2,m_guncelle.getM_Soyad());//M_Soyad değeri okundu ve ps değişkenine atandı.
    ps.setBoolean(3,m_guncelle.isM_Cinsiyet());//M_Cinsiyet değeri okundu ve ps değişkenine atandı.
    ps.setString(4,m_guncelle.getM_Adres());//M_Adres değeri okundu ve ps değişkenine atandı.
    ps.setString(5,m_guncelle.getM_Sehir());//M_Sehir değeri okundu ve ps değişkenine atandı.
    ps.setString(6,m_guncelle.getM_Yas());//M_Yas değeri okundu ve ps değişkenine atandı.
    ps.setString(7,m_guncelle.getM_Eposta());//M_Eposta değeri okundu ve ps değişkenine atandı.
    ps.setString(8,m_guncelle.getM_Brans());//M_Brans değeri okundu ve ps değişkenine atandı.
    ps.setLong(9,m_guncelle.getM_TCNo());//M_TCNo değeri okundu ve ps değişkenine atandı.
    ps.execute();//Komutların güncellenmesi sağlanır.
    ps.close();//Sorgu kapatıldı.
    vt.kapat();//Veri tabanı kapatıldı.
    return true;// değer döndürüldü.değer döndürülmek istenmezse retun kullanmıyoruz.
    
    
    
        
    }catch(Exception e){
        System.out.println(e);// Hata olduğunda yazdırılacak hata kodu.
        return false;// değer döndürüldü.
        }
    
    }
    
    
}

