import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {
    int arr[] = tworzTablice();
    wyswietlTablice(arr);
    }
    public static int [] tworzTablice(){
        Scanner skanowanko = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow tablicy:");
        int wielkosc = skanowanko.nextInt();
        int[] tablica = new int[wielkosc];
        Random rClass = new Random();
        for(int i=0;i<tablica.length;i++)
        {
            tablica[i] = rClass.nextInt(100);
        }

        return tablica;
    }
    public static void wyswietlTablice(int[] tablica){
        for (int i=0;i<tablica.length;i++)
            System.out.println(tablica[i]);
    }
}
