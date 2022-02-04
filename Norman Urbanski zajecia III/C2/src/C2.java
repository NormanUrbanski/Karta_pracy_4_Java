/*




a)stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,

klasa ma się znajdować w osobnym w osobnym pliku Student.java

b)stworzyć 3 objekty  klasy student i wstawić je do tablicy

c) wyświetlić dane z tablicy, użyć pętli for lub forEach

d)dane powinny być estetycznie przedstawione

*/
public class C2 {

    public static void main(String[] args) {
        Student s1 = new Student("Jan", "Kowalski", 30, true);
        Student s2 = new Student("Anna", "Kowalska", 32, true);
        Student s3 = new Student("Barbara", "Munk", 22, false);

        Student tab[] = new Student[] { s1, s2, s3 };

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i].imie);
            System.out.println(tab[i].nazwisko);
            System.out.println(tab[i].wiek);
            if (tab[i].stypendium == true)
                System.out.println("ma stypendium");
            else
                System.out.println("brak stypendium");
            System.out.println();

        }
    }

}
