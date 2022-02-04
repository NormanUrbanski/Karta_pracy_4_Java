
public class Student implements StudentI {

    private String uczelnia;
    private double sredniaOcena;
    private String kierunek;
    private String imie;
    private String nazwisko;

    public void setUczelnia(String uczelnia) {
        this.uczelnia = uczelnia;
    }

    public void setSredniaOcena(double sredniaOcena) {
        this.sredniaOcena = sredniaOcena;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKierunek() {
        return kierunek;
    }
    
    @Override
    public String getUczelnia() {
        return uczelnia;
    }

    @Override
    public double getSredniaOcena() {
        return sredniaOcena;
    }

    @Override
    public String getKierunkek() {
        return kierunek;
    }

    @Override
    public String getImie() {
        return imie;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }


    public String toString()
    {
        return "Student - " + imie +", "+nazwisko +", "+uczelnia +", "+kierunek+", "+sredniaOcena;
    }
}
