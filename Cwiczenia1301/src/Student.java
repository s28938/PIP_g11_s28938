
public class Student {
    public String name = "default value";
    public int yearOfBirth = 2137;


    // jak uzyć zmiennej która jest prywatna
    private int tmp2 = 0;
    public int getTmp2(){
        return tmp2;
    }
    public void increaseTmp2()
    {
        tmp2++;
    }
    public String ShowStudentInfo(){
        System.out.println(name);
        return name;
    }

    }
