import java.util.Arrays;
public class Zadanie3 {

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4};
        System.out.print("Provided array: " + Arrays.toString(arr));
        System.out.println();
        reverseArray(arr);
        System.out.print("Reversed array: " + Arrays.toString(arr));
    }
    public static void reverseArray(int[] x){
        reverse(x, 0, x.length -1);
    }

    public static void reverse(int[] x, int i, int j){
        if(i<j){//Swap
            int tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;
            reverse(x, ++i, --j);//Recursive
        }
    }

}

