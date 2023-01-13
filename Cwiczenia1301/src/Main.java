
public class Main {
    public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();
    student1.name = "Kajetan Kaczmarek";
    student1.yearOfBirth = 2000;
    student1.ShowStudentInfo();
    System.out.println(student1.yearOfBirth);
    student2.ShowStudentInfo();
    System.out.println(student2.yearOfBirth);
    }
}
