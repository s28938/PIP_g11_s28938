import java.util.Arrays;
public class Zadanie3 {
    public static void ReverseArray(int arr[])
    {
        int i;
        int n = arr.length;
        if(n>0)
        {
            i=n-1;
            System.out.print(arr[i]+" ");
            i--;
            ReverseArray(arr);
        }
    }
    public static void main(String[] args) {
        int arr[]= {0,1,2,3,4};
        System.out.print("Provided array: "+ Arrays.toString(arr));
        System.out.println();
        System.out.print("After reversing Array Element Are:");
        ReverseArray(arr);
    }
    public static void ReverseArray2(int arr2[])
    {
        int i;
        int n = arr2.length;
        if(n>0)
        {
            i=n-1;
            System.out.print(arr2[i]+" ");
            i--;
            ReverseArray(arr2);
        }
    }
}


