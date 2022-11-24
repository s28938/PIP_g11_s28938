import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner kantororo = new Scanner(System.in);
        System.out.println("Witamy w kalkulatorze!");
        System.out.println("Podaj pierwsza liczbe: ");
        double pierwszaLiczba = kantororo.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double drugaLiczba = kantororo.nextDouble();
        System.out.println("Podaj wybrana metode: \nADD (do dodawania)\nSUB (do odejmowania)\nDIV (do dzielenia)\nMUL (do mnozenia)");
        kantororo.nextLine();
        String metoda = kantororo.nextLine();

        switch (metoda) {
            case "ADD":
                double wynik = pierwszaLiczba + drugaLiczba;
                System.out.println("Wybrano dodawanie. Wartosc absolutna wyniku to: " + absoluteValue(wynik));
                break;
            case "SUB":
                double wynik2 = pierwszaLiczba - drugaLiczba;
                System.out.println("Wybrano odejmowanie. Wartosc absolutna wyniku to: " + absoluteValue(wynik2));
                break;
            case "DIV":
                double wynik3 = pierwszaLiczba / drugaLiczba;
                System.out.println("Wybrano dzielenie. Wartosc absolutna wyniku to: " + absoluteValue(wynik3));
                break;
            case "MUL":
                double wynik4 = pierwszaLiczba * drugaLiczba;
                System.out.println("Wybrano mnozenie. Wartosc absolutna wyniku to: " + absoluteValue(wynik4));
                break;

        }

    }

    public static double absoluteValue (double b){
        return Math.abs(b);
    }
}
