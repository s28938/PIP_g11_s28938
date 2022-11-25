import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println("Podaj parametr n:");
        Scanner skanowanko = new Scanner(System.in);
        int x = skanowanko.nextInt();
        System.out.println("Losowe liczby wygenerowane metoda do while");
        doWhile(x);
        System.out.println("Losowe liczby wygenerowane metoda while");
        loopWhile(x);
    }
    public static void doWhile(int skaner1) {
        Random rand = new Random();

        int i = 0;
        do {
            System.out.println(rand.nextInt());
            i++;
        }while (i<skaner1);
    }
    public static void loopWhile(int skaner1) {

        Random rand = new Random();

        int i = 0;
        while (i<skaner1){
            System.out.println(rand.nextInt());
            i++;
        }
        }
    }

