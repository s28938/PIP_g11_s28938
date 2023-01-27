public class Osoba {
    private String imieNazwisko ;
    private String email;
    private String krajZamieszkania;

    public String getImieNazwisko(){
        return imieNazwisko;
    }
    public String getEmail(){
        return email;
    }
    public String getKrajZamieszkania(){
        return krajZamieszkania;
    }

    public void setImieNazwisko(String newImieNazwisko){
        if(newImieNazwisko==null || newImieNazwisko.isEmpty() || newImieNazwisko.isBlank()) {
            System.out.println("Wartosc nie moze byc pusta");
            return;
        }
        imieNazwisko = newImieNazwisko;
    }
    public void setEmail(String newEmail){
        if(newEmail==null || newEmail.isEmpty() || newEmail.isBlank()) {
            System.out.println("Wartosc nie moze byc pusta");
            return;
        }
        email = newEmail;
    }
    public void setKrajZamieszkania(String newKrajZamieszkania){
        if(newKrajZamieszkania==null || newKrajZamieszkania.isEmpty() || newKrajZamieszkania.isBlank()) {
            System.out.println("Wartosc nie moze byc pusta");
            return;
        }
        krajZamieszkania = newKrajZamieszkania;
    }
    public Osoba(String imieNazwisko, String email, String krajZamieszkania) {
        setImieNazwisko(imieNazwisko);
        setEmail(email);
        setKrajZamieszkania(krajZamieszkania);
    }
    public String toString(){
        return imieNazwisko + " " + email + " " + krajZamieszkania;
    }

}
