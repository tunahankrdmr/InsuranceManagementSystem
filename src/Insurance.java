import java.time.LocalDate;

public abstract class Insurance {
    private String isim;
    private double ucret;
    private LocalDate baslangıc, bitis;

    public Insurance(String isim, int ucret, LocalDate baslangıc, LocalDate bitis) {
        this.isim = isim;
        this.ucret = ucret;
        this.baslangıc = baslangıc;
        this.bitis = bitis;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public LocalDate getBaslangıc() {
        return baslangıc;
    }

    public void setBaslangıc(LocalDate baslangıc) {
        this.baslangıc = baslangıc;
    }

    public LocalDate getBitis() {
        return bitis;
    }

    public void setBitis(LocalDate bitis) {
        this.bitis = bitis;
    }

    public abstract void calculate();

    public abstract String toString();
}
