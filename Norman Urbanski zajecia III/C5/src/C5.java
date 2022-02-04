
import java.util.ArrayList;
import java.util.List;

/*

Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży…

Będziemy budować podobną strukturę kodu jak w przykładzie 5

a)proszę stworzyć układ klas dziedziczących po sobie,

b)proszę użyć pól i metod protected jak i private,

c) proszę stworzyć konstruktory, metody: toString(), setery i gettery

d)proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych

(można wygenerować je - -> prawy przycisk myszki  - -> generate - ->setery, gettery, …)

e) w klasie Main proszę stworzyć obiekty podobnie jak w przykładzie 5,

oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>

*/
public class C5 {

  
    public static void main(String[] args) {
        
        Produkt p = new Produkt("Szachy",100);
        
        Ksiazka k1 = new Ksiazka("Ogrody",123,"Jan Kowalski", 300);
        Ksiazka k2 = new Ksiazka("Programowanie",193,"Janusz Nowak", 200);
        
        
        PlytaCD cd1 = new PlytaCD("Nie wolno zabic tej milosci",19,"Zenon Martyniuk", 60);
        PlytaCD cd2 = new PlytaCD("Ostatni klaps",29,"Zenon Martyniuk", 50);
        
        List<Produkt> produkty = new ArrayList<Produkt>();
        produkty.add(p);
        produkty.add(k1);
        produkty.add(k2);
        produkty.add(cd1);
        produkty.add(cd2);
        
        for(int i=0;i<produkty.size();i++)
        {
           System.out.println(produkty.get(i));
        }
        
        
        
        
        
        
    }
    
}
