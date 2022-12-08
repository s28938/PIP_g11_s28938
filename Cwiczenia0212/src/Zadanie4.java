import java.util.*;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] genArr = generateArray();
        System.out.println("Wygenerowana tablica");
        printArray(genArr);
        int[] sortedArr = sort(genArr);
        System.out.println("Posortowana tablica");
        printArray(sortedArr);
        int[] revArr = reverse(sortedArr);
        System.out.println("Odwrocona tablica");
        printArray(revArr);
        System.out.println("Czy tablice sa swoimi odwrotnosciami");
        System.out.println(equalsReverse(sortedArr,revArr));
    }
    public static boolean equalsReverse(int[] x, int[] y)
    {
        if (x.length != y.length)
        {
            return false;
        }
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] != y[y.length - 1 - i])
            {
                return false;
            }
        }
        return true;
    }
    public static int [] reverse (int[] array){

        int [] kopia = Arrays.copyOf(array,array.length);
        for(int i = 0; i < kopia.length / 2; i++)
        {
            int temp = kopia[i];
            kopia[i] = kopia[kopia.length - i - 1];
            kopia[kopia.length - i - 1] = temp;
           }
        return kopia;
    }
    public static int [] sort (int[] array) {
        int [] kopia = Arrays.copyOf(array,array.length);
        for (int i = 0; i <kopia.length; i++){
            int index = i;
            for (int j = i ; j <= kopia.length-1; j++){
                if (kopia[j] < kopia[index]){
                    index = j;
                }
            }
            int temp = kopia[i];
            kopia[i] = kopia[index];
            kopia[index] = temp;
        }
        //for (int i = 0; i < kopia.length; i++){
        //    System.out.println(kopia[i]);
        //}
        return kopia;
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
