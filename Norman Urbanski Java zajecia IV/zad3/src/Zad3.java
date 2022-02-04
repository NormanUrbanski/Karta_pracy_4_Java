/*

zad.1

a) stworzyć klasę abstrakcyjną Figura

b) stworzyć metody abstrakcyjne pole() i obwód()

c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst „To jest figura: …..” , 


zad.2

a) stworzyć klasę kwadrat i prostokąt które będą dziedziczyć po klasie Figura

b) zaimplementować metody abstrakcyjne odpowiednimi wzorami 

c) stworzyć obiekty tych klas i wyświetlić przykładowe wyliczenia


 */
public class Zad3 {

    public static void main(String[] args) {
        Kwadrat k = new Kwadrat(4);
        Prostokat p = new Prostokat(4, 2);

        System.out.println("Kwadrat - obwod: " + k.obwod() + ", pole: " + k.pole());
        System.out.println("Prostokat - obwod: " + p.obwod() + ", pole: " + p.pole());

    }

}
