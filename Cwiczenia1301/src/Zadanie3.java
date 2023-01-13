public class Zadanie3 {
    public static void main(String[] args) {

        //Zadanie 3 i 4 sa polaczone w tej klasie

        SecretStudent nowy = new SecretStudent();
        System.out.println(nowy.getName());
        String newName2 = "Kajetan";
        nowy.setName(newName2);
        System.out.println(nowy.getName());
        SecretStudent nowy2 = new SecretStudent();
        String newName3 = null;
        nowy2.setName(newName3);
        System.out.println(nowy2.getName());
    }
}
