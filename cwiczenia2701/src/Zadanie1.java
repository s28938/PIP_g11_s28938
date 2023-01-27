import java.io.*;
import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {
        String imieNazwisko = "Tony Stark";
        String email = "tony@stark.pl";
        String krajZamieszkania = "USA";
        Osoba wypelnianko = new Osoba(imieNazwisko, email, krajZamieszkania );
        System.out.println(wypelnianko);
        System.out.println("Zadanie 2");
        File plik = new File ("C:\\Users\\s28938\\Documents\\GitHub\\PIP_g11_s28938\\cwiczenia2701\\src\\dataNowy.txt");
        //ze wzgledu na blokowany dysk wrzucilem pelna referencje, powinna być skrócona ponieważ plik dataNowy jest w tej lokalizacji
        BufferedReader reader = new BufferedReader(new FileReader(plik));
        String [] text = new String[10];
        String tmp;
        int i = 0;

        //System.out.println("Zadanie 2");
        while((tmp = reader.readLine()) != null){
            text[i] = tmp;
            //System.out.println(text[i]);
            i++;
        }
        reader.close();

        System.out.println("Tablica Osoba");
        String[][] Osoba = new String[10][3];
        for(int t = 0; t < text.length; t++){
            Osoba[t] = splitBy(text[t],",");
        }
        System.out.println(Arrays.deepToString(Osoba));
    }
    public static String[] splitBy (String line, String separator){
        String[] tablica = line.split(separator);
        return tablica;
    }

}
