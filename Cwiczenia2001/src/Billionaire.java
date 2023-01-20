public class Billionaire {

    public long heroMoney;
    public String className = "Test name value";
    public String classFamilyName = "Test Family Name Value";
    public boolean danger;

    public Billionaire(RegularPerson RegularPerson) {
        className = RegularPerson.className;
        classFamilyName = RegularPerson.classFamilyName;
    }

    public void setMoney(long money) {
        heroMoney = money ;
    }

    public boolean isInDanger() {
        return danger;
    }

    public void goParty() {
        System.out.println("Party Time!");
    }
}