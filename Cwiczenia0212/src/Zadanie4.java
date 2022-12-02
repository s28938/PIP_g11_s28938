import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] genArr = generateArray();
        printArray(genArr);
        int[] sortedArr = sort(genArr);
        printArray(sortedArr);
        int[] revArr = reverse(sortedArr);
        printArray(revArr);
        System.out.println(checkReversed(sortedArr,revArr));
    }
    public static boolean checkReversed(int[] x, int[] y)
    {
        // For production code, possibly add nullity checks here (see comments)
        if (x.length != y.length)
        {
            return false;
        }
        // Loop through x forwards and y backwards
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] != y[y.length - 1 - i])
            {
                // As soon as we've found a "mistake" we can exit:
                // This is simpler (IMO) than keeping a "check" variable
                return false;
            }
        }
        return true;
    }
    public static int [] reverse (int[] array){

        //System.out.println("Twoja tablica to: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        //System.out.println("Tablica w odwrotnej kolejnosci: ");
        for (int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        return array;
    }
    public static int [] sort (int[] array) {
        for (int i = 0; i <array.length; i++){
            int index = i;
            for (int j = i ; j <= array.length-1; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        return array;
    }
    public static int [] generateArray(){
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
    public static void printArray(int[] tablica){
        for (int i=0;i<tablica.length;i++)
            System.out.println(tablica[i]);
    }
}
