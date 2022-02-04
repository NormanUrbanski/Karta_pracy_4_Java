
public class PlytaCD extends Produkt{

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCzas() {
        return czas;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }
    
      private String autor;
    private int czas;
    
       public PlytaCD(String nazwa, float cena, String autor, int czas )
    {
        super(nazwa,cena);
        this.autor = autor;
        this.czas = czas;
        
    }
       
         public String toString()
    {
        return  "plyta cd - " + super.toString() + " ,autor: "+autor + ", czas trwania: "+czas;
    }
}
