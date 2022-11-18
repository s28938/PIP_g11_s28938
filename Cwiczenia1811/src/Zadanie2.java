import java.util.Scanner;

public class Zadanie4 {
    public static void main (String[] args){
        Scanner kantororo = new Scanner(System.in);
        System.out.println("Witamy w kalkulatorze!");
        System.out.println("Podaj pierwsza liczbe: ");
        int pierwszaLiczba = kantororo.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int drugaLiczba = kantororo.nextInt();
        System.out.println("Podaj wybrana metode: ");
        String metoda = kantororo.next();

    }
    public static void dodawanko (int add){
        System.out.println(kwotaPJ+" PLN = " + (kwotaPJ*30.75) + " JPY");
        return kwotaPJ;
    }
    public static double jpy2pln(double kwotaJP){
        System.out.println(kwotaJP+" JPY = " + (kwotaJP*0.033) + " PLN");
        return kwotaJP;
    }
}

