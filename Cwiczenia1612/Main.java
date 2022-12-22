import java.io.*;
import java.util.Arrays;


    public class Main {
        public static void main(String[] args) throws IOException {
            System.out.println("Zadanie 1");

            System.out.println(Arrays.toString(splitBy("Never; gonna; give; you; up",";")));


            File plik = new File ("data.txt");
            BufferedReader reader = new BufferedReader(new FileReader(plik));
            String [] text = new String[10];
            String tmp;
            int i = 0;

            System.out.println("Zadanie 2");
            while((tmp = reader.readLine()) != null){
                text[i] = tmp;
                System.out.println(text[i]);
                i++;
            }
            reader.close();

            System.out.println("Zadanie 3");
            String[][] shades = new String[10][3];
                for(int t = 0; t < text.length; t++){
                    shades[t] = splitBy(text[t],",");
                }
            System.out.println(Arrays.deepToString(shades));

            System.out.println("Zadanie 4 w pliku data2");
            File plik2 = new File ("data2.txt");
            plik2.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(plik2));
            for (int j=0;j<text.length;j++) {
                writer.write(j+","+text[j]);
                writer.newLine();
            }
            writer.close();

        }

        public static String[] splitBy (String line, String separator){
            String[] tablica = line.split(separator);
            return tablica;
        }
    }

