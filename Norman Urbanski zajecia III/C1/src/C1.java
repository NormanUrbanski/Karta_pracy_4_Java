/*

a) stworzyć prosty enum „LiczbyEnum” z liczbami od 1 do 6 zapisanymi słownie,

b)stworzyć prosty enum „StatusEnum” z wartościami KONTYNUUJEMY i KONIEC

c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla)

d) niech w pętli są podawane wartości liczbowe z klawiatury

e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie

f) umieścić w pętli switch() case: które będą wpisywały cyfry słownie odpowiednio do podanych cyfr przez użytkownika

g) gdy użytkownik wciśnie 0 ma wyświetlić się status koniec w innym wypadku KONTYNUUJEMY



statusy i wybór ze switch case to najczęstsze użycia enumów, neumy są często używane

w różnego rodzaju listach, selektach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) 

 */
import java.util.Scanner;

public class C1 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while (true) {
            int i;
            try {
                i = Integer.parseInt( s.next());
                 } catch (Exception ex) {
                System.err.println(ex.getMessage());
                continue;
            }
            
            
                if (i == 0) {
                    System.out.println(StatusEnum.KONIEC);
                    break;
                } else {
                    
                    switch (i) {
                        case 1:
                            System.out.println(LiczbyEnum.JEDEN);
                            break;
                        case 2:
                            System.out.println(LiczbyEnum.DWA);
                            break;
                        case 3:
                            System.out.println(LiczbyEnum.TRZY);
                            break;
                        case 4:
                            System.out.println(LiczbyEnum.CZTERY);
                            break;
                        case 5:
                            System.out.println(LiczbyEnum.PIEC);
                            break;
                        case 6:
                            System.out.println(LiczbyEnum.SZEŚĆ);
                            break;
                        
                    }
                    
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                    
                }
           
        }
    }
    
}
