/*

zad.1

a) napisać interfejs CzlowiekI,

b) zadeklarować 2 metody

c) napisać interfejs StudelntI który dziedziczy po interfejsie CzłowiekI

d) zadeklarować 3 metody

e) napisać interfejs PracownikI który dziedziczy po interfejsie CzłowiekI 

f) zadeklarować 3 metody

 

zad.2

a) napisać klasę Student która będzie implementować interfejs StudentI 

b) napisać klasę Pracownik która będzie implementować intetrfejs PracownikI 

c) stworzyć pola, gettery i setery, metodę toString dla obu klas, (konstruktor z przeciążeniem - jak ktoś chce), 

(gettery i setters / toString() …, najlepiej wygenerować:

- - Code/Prawy myszy - - >gettera/setters/toString

 

zad.3

a) stworzyć dwa obiekty typu Student i uzupełnić wszystkie pola,

b) stworzyć dwa obiekty typu Pracownik i uzupełnić wszystkie pola,

c)wypisać metody toString() wszystkich obiektów


 */
public class Zad2 {

  
    public static void main(String[] args) {
       Student s1 = new Student();
       Student s2 = new Student();
       
       s1.setImie("Jan");
       s1.setNazwisko("Kowalski");
       s1.setUczelnia("UW");
       s1.setKierunek("biologia");
       s1.setSredniaOcena(4);
       
       s1.setImie("Jan");
       s1.setNazwisko("Nowak");
       s1.setUczelnia("UW");
       s1.setKierunek("chemia");
       s1.setSredniaOcena(4.1);
       
       System.out.println(s1);
       System.out.println(s2);
       
       Pracownik p = new Pracownik();
       p.setImie("Jan");
       p.setNazwisko("Kowalski");
       p.setFirma("Google");
       p.setZarobki(1000);
       p.setZawod("ksiegowy");
       
        System.out.println(p);
       
       
    }
    
}
