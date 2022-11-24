import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner kantororo = new Scanner(System.in);
        System.out.println("Witamy w kalkulatorze!");
        System.out.println("Podaj pierwsza liczbe: ");
        double pierwszaLiczba = kantororo.nextInt();
        System.out.println("Podaj druga liczbe: ");
        double drugaLiczba = kantororo.nextInt();
        System.out.println("Podaj wybrana metode: \nADD (do dodawania)\nSUB (do odejmowania)\nDIV (do dzielenia)\nMUL (do mnozenia)");
        kantororo.nextLine();
        String metoda = kantororo.nextLine();

        switch (metoda) {
            case "ADD":
                System.out.println("Wybrano dodawanie. Wynik to: " + pierwszaLiczba + drugaLiczba);
                break;
            case "SUB":
                System.out.println("Wybrano odejmowanie. Wynik to: " + (pierwszaLiczba - drugaLiczba));
                break;
            case "DIV":
                System.out.println("Wybrano dzielenie. Wynik to: " + pierwszaLiczba / drugaLiczba);
                break;
            case "MUL":
                System.out.println("Wybrano mnozenie. Wynik to: " + pierwszaLiczba * drugaLiczba);
                break;

        }

    }

}
