/*


Najpierw należy uzupełnić kod w klasie Punkt.java

a) stworzyć object punktA typu Punkt, w konstruktorze zainicjować zmienną pX - -> np. new Punkt(7),

wykonać metodę punktA.toString()

b) następnie ponownie wywołać konstruktor inicjalizujący wszystkie pola z klasy - -> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString()

c)napisać wartości pól z obiektu punktA za pomocą seterów i ponownie wywołać metodę toString()

d) wypisać wartości pól (za pomocą getterów)

e) wywołać metody suma i różnica (obje wersje) z klasy punkt


 */
public class C3 {

    public static void main(String[] args) {

        Punkt punktA = new Punkt(7);
        System.out.println(punktA.toString());

        Punkt punktB = new Punkt(1, 2, 3);
        System.out.println(punktB.toString());

        punktA.setX(5);
        punktA.setY(8);
        punktA.setZ(10);
        System.out.println(punktA.toString());

        System.out.println(punktA.getX() + " " + punktA.getY() + " " + punktA.getZ());

        Punkt punktC = punktB.suma(punktA);
        System.out.println(punktC.toString());

        Punkt punktD = punktB.roznica(punktA);
        System.out.println(punktD.toString());

    }

}
