import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner skanowanko = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        int liczba = skanowanko.nextInt();
        int i;
        for (i = 0; i <= liczba; i++) {
            System.out.println(i);
        }
        if (liczba < 0) {
            for (i = 0; i >= liczba; i--) {
                System.out.println(i);
            }
        }
    }
}
