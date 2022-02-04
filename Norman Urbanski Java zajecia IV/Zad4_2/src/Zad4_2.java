/*
zad.2

a) stworzyć dowolny przykład z NullPonterException

b) stworzyć dowolny przykład z ArithemticException

c)stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally

 */
public class Zad4_2 {

    public static void main(String[] args) {

        String s = null;

        try {

            s = s.substring(0);
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        try {

            int i = 6 / 0;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            int a[] = new int[2];
            a[4] = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception");
        } finally {
            System.out.println("Koniec");
        }

    }

}
