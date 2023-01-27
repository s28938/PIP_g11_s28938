import java.io.*;
import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {
        String imieNazwisko = "Tony Stark";
        String email = "tony@stark.pl";
        String krajZamieszkania = "USA";
        Osoba wypelnianko = new Osoba(imieNazwisko, email, krajZamieszkania );
        System.out.println(wypelnianko);

        File plik = new File ("src/data.txt");
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
    }
    public static String[] splitBy (String line, String separator){
        String[] tablica = line.split(separator);
        return tablica;
    }

}
