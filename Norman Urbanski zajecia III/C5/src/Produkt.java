
public class Produkt {

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
    
    protected String nazwa;
    protected float cena;
    public Produkt(String nazwa, float cena )
    {
        this.nazwa= nazwa;
        this.cena = cena;
        
    }
    
    public String toString()
    {
        return "nazwa: "+nazwa + ",  cena: "+cena;
    }
    
}
