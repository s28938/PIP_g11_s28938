public class IronMan {
    public String _ironManName;
    public String _ironManSurname;
    public IronMan(Billionaire HeroName) {
        _ironManName = HeroName.className;
        _ironManSurname = HeroName.classFamilyName;
    }

    public void attack(Enemy enemy) {
        System.out.println(_ironManName + " is fighting!");
    }

    public void printNameOfOwner() {
        System.out.println(_ironManName +" "+ _ironManSurname);
    }
}
