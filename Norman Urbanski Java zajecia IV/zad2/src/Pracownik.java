
public class Pracownik implements PracownikI {

    private double zarobki;
    private String zawod;
    private String firma;
    private String imie;
    private String nazwisko;

    public void setZarobki(double zarobki) {
        this.zarobki = zarobki;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public double getZarobki() {
        return zarobki;
    }

    @Override
    public String getFirma() {
        return firma;
    }

    @Override
    public String getZawod() {
        return zawod;
    }

    @Override
    public String getImie() {
        return imie;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    public String toString() {
        return "Student - " + imie + ", " + nazwisko + ", " + firma + ", " + zawod + ", " + zarobki;
    }
}
