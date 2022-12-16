import java.io.*;
import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {
        splitBy("Never; gonna; give; you; up",";");

        //ZADANIE 2
        File plik = new File ("data.txt");
        BufferedReader reader = new BufferedReader(new FileReader(plik));
        String [] text = new String[10];
        String tmp;
        int i = 0;


        while((tmp = reader.readLine()) != null){
            text[i] = tmp;
            System.out.println(text[i]);
            i++;
        }
        reader.close();

        File plik2 = new File ("data2.txt");
        plik2.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(plik2));
        for (int j=0;j<text.length;j++) {
            writer.write(text[j]);
            writer.newLine();
        }
        writer.close();

        String[][] shades = new String[10][3];
        // print array in rectangular form
        for (int r=0; r<shades.length; r++) {
            for (int c=0; c<shades[r].length; c++) {
                //shades[r][c]=splitBy(tmp, ",");//your value
            }
        }
        System.out.println(Arrays.deepToString(shades));
    }
    public static void splitBy (String line, String separator){
        //String kopia = Arrays.copyOf(line, line.length());
        System.out.println
                (java.util.Arrays.toString(line.split(separator)));

    }
}