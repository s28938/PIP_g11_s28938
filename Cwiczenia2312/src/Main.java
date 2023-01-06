import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner liczba = new Scanner(System.in);
                System.out.println("Podaj dlugosc boku tablicy");
                int zmienna = liczba.nextInt();
                System.out.println("Podana macierz to:" + Arrays.deepToString(tablica(zmienna)));

            }
            public static int [][] tablica(int n){
                int array[][] = new int[n][n];
                Random random = new Random();

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = random.nextInt(100);
                    }
                }

                return array;
            }

}