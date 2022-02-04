

/*

zad 1

a) Stworzyć interfejs Budynek,

b) interfejs powinien mieć metody:

  -double powierzchnia (double powBudynku, double powPodwórka, double powParkingu)

  -String adresBudynku (String miejscowość, String ulica, int nrDomu, String nrLokalu, String   kodPocztowy)

  - void liczbaokben (int vague); // użycie jak setter

  - void liczbaMiszkańców(int vague); // użycie jak seter

  - void kolorDomu(KolorEnum kolor); //użycie jak seter

  - double wyliczCene(double powierzchnia, double cena)

c) stworzyć enum KolorEnum z przykładowymi kolorami,

d)stworzyć jedną metodę z 2 parametrami wymyślona przez siebie,

*/

  

/* zad.2

a)  napisać klasę Dom implementującą interfejs Budynek,

b) zaimplementować wszystkie metody,

c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę  toString

(gettery i settery najlepiej wygenerować : Code/Prawy myszy - - >Generate - - > getters/setters/toString)

d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),

*/

 

/* zad.3

a) w klasie Main stworzyć dwa obiekty typu Dom deklarując pierwszy obiekt Typem Dom, drugi obiekt typem Budynek,

b) wykorzystać wszystkie metody do implementacji pól,

c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,

d) sprawdzić czy idzie wywołać z obu instancji obiektu (deklaracja z interfejsu i z klasy)

metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klasie Dom,

*/


public class Zad1 {


    public static void main(String[] args) {
       
        Dom d1 = new Dom();
      
        d1.setWlasciciel("Jan","Kowalski");
        d1.kolorDomu(KolorEnum.Blue);
        d1.liczbaMiszkancow(45);
        d1.liczbaokben(16);
        d1.adresBudynku("Warszawa", "Stara", 1, "A", "00-990");
        System.out.println(d1);
        
        //jesli zadeklarujemy obiekt jako budynek to mozemy wywolac jedynie metody zadeklarowane w interfejsie Budynek
        // a nie widzimy metod zadeklarowanych w klasie Dom
        Budynek d2 = new Dom();
        d2.setWlasciciel("Janusz", "Nowak");
        d2.adresBudynku("Warszawa", "Nowa", 2, "D", "00-990");
        
        System.out.println(d2);
        
    }
    
}
