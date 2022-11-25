public class Zadanie3
{
    public static void main(String[] args)
    {
        metoda1();
        metoda2();
    }
    public static void metoda1(){
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
    public static void metoda2(){
        int i,j,k;

        for(i=0; i<5; i++)
        {
            for(k=i; k<5; k++)
                System.out.print(" ");
            for(j=0; j<=i; j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}