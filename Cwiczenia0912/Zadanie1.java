public class Zadanie1 {
    public static int Fibonacci(int N) {
        int F1 = 0, F2 = 1, F3 ;

        int counter = 0;

        while (counter < N) {
            F3 = F2 + F1;
            F1 = F2;
            F2 = F3;
            counter = counter + 1;
        }
        return F1;
    }

    // Driver Code
    public static void main(String args[])
    {
        System.out.println(Fibonacci(9));
    }
}
