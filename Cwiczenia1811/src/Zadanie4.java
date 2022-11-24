import java.util.Scanner;

public class zadanie41 {

    public static String getString(int dlugosc)
    {

        String givenValues = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";

            StringBuilder buildString = new StringBuilder(dlugosc);

        for (int i = 0; i < dlugosc; i++) {
            int index
                    = (int)(givenValues.length()
                    * Math.random());
            buildString.append(givenValues
                    .charAt(index));
        }

        return buildString.toString();
    }

    public static void main(String[] args)
    {
        Scanner podaj = new Scanner(System.in);
        System.out.println("Podaj dlugosc stringa");
        int dlugosc = podaj.nextInt();
        System.out.println(zadanie41
                .getString(dlugosc));
    }
}
