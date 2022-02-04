
public class Dom implements Budynek {

    private KolorEnum kolor;
    private int liczbaOkien;
    private int liczbaMieszkancow;
    private String imieWlasciciela;
    private String adresBudynku;

    private double powierzchnia;

    public void setKolor(KolorEnum kolor) {
        this.kolor = kolor;
    }


    public void setLiczbaMieszkancow(int liczbaMieszkancow) {
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    public void setAdresBudynku(String adresBudynku) {
        this.adresBudynku = adresBudynku;
    }

    public void setImieWlasciciela(String imieWlasciciela) {
        this.imieWlasciciela = imieWlasciciela;
    }

    public void setNazwiskoWlasciciela(String nazwiskoWlasciciela) {
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
    }

    public String getImieWlasciciela() {
        return imieWlasciciela;
    }

    public String getNazwiskoWlasciciela() {
        return nazwiskoWlasciciela;
    }
    private String nazwiskoWlasciciela;

    public KolorEnum getKolorDomu() {
        return kolor;
    }

    public int getLiczbaOkien() {
        return liczbaOkien;
    }

    public int getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu) {
        this.powierzchnia = powBudynku + powPodworka + powParkingu;
        return this.powierzchnia;
    }

    public String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy) {
        adresBudynku = miejscowosc + " " + ulica + " " + nrDomu + " " + nrLokalu + " " + kodPocztowy;
        return adresBudynku;
    }

    public String getAdresBudynku() {
        return adresBudynku;
    }

    public void liczbaokben(int value) {
        liczbaOkien = value;
    }

    public void liczbaMiszkancow(int value) {
        liczbaMieszkancow = value;
    }

    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }

    public double wyliczCene(double powierzchnia, double cena) {
        return powierzchnia * cena;
    }

    public String toString() {
        return "Dom - kolor: " + kolor + ", liczba okien: " + liczbaOkien + ", liczba mieszkancow: " + liczbaMieszkancow;
    }

    public void setWlasciciel(String imie, String nazwisko) {
        this.imieWlasciciela = imie;
        this.nazwiskoWlasciciela = nazwisko;
    }
}
