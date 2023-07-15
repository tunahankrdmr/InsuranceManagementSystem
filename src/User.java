import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private String isim, meslek, soyIsim, email, sifre;
    private int yas;
    private ArrayList<Adress> adres;
    private LocalDate sonGirisTarihi;

    public User(String isim, String meslek, String soyIsim,
                String email, String sifre, int yas) {
        this.isim = isim;
        this.meslek = meslek;
        this.soyIsim = soyIsim;
        this.email = email;
        this.sifre = sifre;
        this.yas = yas;
        this.adres = adres;
        this.sonGirisTarihi = sonGirisTarihi;
    }

    public void addAdress(Adress adress){
        this.adres.add(adress);
    }

    public void removeAdress(Adress adress){
        this.adres.remove(adress);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public ArrayList<Adress> getAdres() {
        return adres;
    }

    public void setAdres(ArrayList<Adress> adres) {
        this.adres = adres;
    }

    public LocalDate getSonGirisTarihi() {
        return sonGirisTarihi;
    }

    public void setSonGirisTarihi(LocalDate sonGirisTarihi) {
        this.sonGirisTarihi = sonGirisTarihi;
    }
}
