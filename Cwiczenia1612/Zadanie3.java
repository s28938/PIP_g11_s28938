import java.util.Arrays;

public class Zadanie3 {
    public static void main(String[] args) {
        String[][] shades = new String[10][3];
        // print array in rectangular form
        for (int r=0; r<shades.length; r++) {
            for (int c=0; c<shades[r].length; c++) {
              //  shades[r][c]=splitBy();//your value
            }
        }
        System.out.println(Arrays.deepToString(shades));

    }
    public static void splitBy(String line, String separator){

        System.out.println
                (java.util.Arrays.toString(line.split(separator)));

    }
}
