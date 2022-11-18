import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner kantororo = new Scanner(System.in);
        System.out.println("Witamy w kalkulatorze!");
        System.out.println("Podaj pierwsza liczbe: ");
        int pierwszaLiczba = kantororo.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int drugaLiczba = kantororo.nextInt();
        System.out.println("Podaj wybrana metode: \n1 - ADD (do dodawania)\n2 - SUB (do odejmowania)\n3 - DIV (do dzielenia)\n4 - MUL (do mnozenia)");
        int metoda = kantororo.nextInt();

        switch (metoda) {
            case 1:
                System.out.println("Wybrano dodawanie. Wynik dodawania to: " + pierwszaLiczba + drugaLiczba);
                break;
            case 2:
                System.out.println("Wybrano odejmowanie. Wynik odejmowania to: " + (pierwszaLiczba - drugaLiczba));
                break;
            case 3:
                System.out.println("Wybrano mnozenie. Wynik mnozenia to: " + (pierwszaLiczba * drugaLiczba));
                break;
            case 4:
                System.out.println("Wybrano dzielenie. Wynik dzielenia to: " + (pierwszaLiczba / drugaLiczba));
                break;

        }

    }

}

