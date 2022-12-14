
import java.util.Arrays;

public class Zadanie4 {

    public static void ForEach(int[] arr, int toCheckValue)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        System.out.println("Czy " + toCheckValue
                + " znajduje sie w tablicy?: " + test);
    }
    public static boolean Recursive(int[] myArray, int element, int size){
        if (size == 0){
            System.out.println("Elementu nie ma w tabeli");
            return false;
        }
        if (myArray[size-1] == element){
            System.out.println("Element znajduje sie w tabeli");
            return true;
        }
        return Recursive(myArray, element, size-1);
    }



    public static void main(String[] args)
    {
        int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
        int toCheckValue = 10;

        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println("Metoda wykorzystujaca petle: ");
        ForEach(arr, toCheckValue);
        System.out.println("Metoda wykorzystujaca rekurencje: ");
        Recursive(arr,toCheckValue,arr.length);

    }
}
