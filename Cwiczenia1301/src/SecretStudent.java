public class SecretStudent {
    private String Name = "secret student";
    public String getName(){
        return Name;
    }
    public void setName(String newName){
        if(newName==null || newName.isEmpty() || newName.isBlank()) {
            System.out.println("Wartosc nie moze byc pusta");
            return;
        }
        Name = newName;
    }
}
