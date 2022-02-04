
public class Ksiazka extends Produkt{

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIloscStron() {
        return iloscStron;
    }

    public void setIloscStron(int iloscStron) {
        this.iloscStron = iloscStron;
    }
    
    private String autor;
    private int iloscStron;
    
       public Ksiazka(String nazwa, float cena, String autor, int iloscStron )
    {
        super(nazwa,cena);
        this.autor = autor;
        this.iloscStron = iloscStron;
        
    }
       
         public String toString()
    {
        return  "ksiazka - " + super.toString() + " ,autor: "+autor + ",  ilosc stron: "+iloscStron;
    }
       
}
