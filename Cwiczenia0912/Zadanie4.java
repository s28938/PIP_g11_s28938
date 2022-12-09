
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
        System.out.println("Is " + toCheckValue
                + " present in the array: " + test);
    }
    public static boolean Recursive(int[] myArray, int element, int size){
        if (size == 0){
            System.out.println("Blad");
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
        int toCheckValue = 21;

        System.out.println("Array: "
                + Arrays.toString(arr));
        ForEach(arr, toCheckValue);
        Recursive(arr,toCheckValue,arr.length);

    }
}

