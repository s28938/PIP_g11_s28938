import java.util.Scanner;

public class Zadanie4 {

    public static void main( String [] args ) {

        Scanner scanner = new Scanner(System.in);
        int[] values = new int[3];
        System.out.println("Wprowadz wartosc x:");
        int currentItem1 = scanner.nextInt();
        System.out.println("Wprowadz wartosc y:");
        int currentItem2 = scanner.nextInt();
        System.out.println("Wprowadz wartosc z:");
        int currentItem3 = scanner.nextInt();
        values[0] = currentItem1;
        values[1] = currentItem2;
        values[2] = currentItem3;

        drawStars(values);

    }

    public static void drawStars( int[] values ) {

        int rows = values.length;
        int maxValue = findMax( values );

        String[] horizontalRow = new String[ maxValue + 1];

        for( int row = 0; row <= maxValue; row++ ) {

            String patternRow = "";
            int barRow = maxValue - row;
            for( int column = 0; column < values.length; column++ ) {

                if( barRow < values[ column ] ) {
                    patternRow += "* ";
                } else {
                    patternRow += "  ";
                }
            }

            horizontalRow[ row ] = patternRow;

        }

        for( String pattern : horizontalRow ) {
            System.out.println( pattern );
        }

    }

    public static int findMax( int[] values ) {

        int max = 0;
        for( int value : values ) {
            if( max < value ) {
                max = value;
            }
        }

        return max;
    }

}

