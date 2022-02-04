
/*

zad.1 

a)stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy)

b) wprowadzić z klawiatury numer indeksu tablicy który chcemy wyświetlić, użyć metody next() - - > scan.next();

c)zabezpieczyć kod przed wprowadzeniem:

  - za dużej liczby (index > tab.lenght),

  - wprowadzeniem innego znaku niż liczba,

d) użyć metody finally aby wyświetlić komunikat zakończenia programu

e) wprowadzenie indeksu niech będzie zapętlone dp mementu wprowadzenia poprawnego indeksu

 
PODPOWIEDZI:

scan.next() - można wprowadzać dowolny znak z klawiatury,

index = Integer.parseInt(scan.next());  - parsowanie zmiennej do typu int (liczbowego całkowitego)

 

warto stworzyć flagę np. isinrexcorrect = false, i niech pętla się wykonuje, dopóki flaga jest false, bollean isIndexCorrect

white( ! isIndexCorrect) {}
*/

import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {

        int[] tablica = new int[] { 1, 2, 3, 4, 5, 6 };
        Scanner scan = new Scanner(System.in);

        try {
            Boolean isIndexCorrect = false;
            while (!isIndexCorrect) {

                try {
                    int index = Integer.parseInt(scan.next());

                    if (index < tablica.length - 1) {
                        System.out.println("Wartosc na pozycji " + index + " = " + tablica[index]);
                        isIndexCorrect = true;
                    }
                } catch (Exception ex2) {

                }

            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            System.out.println("Koniec programu");
            scan.close();
        }

    }

}
