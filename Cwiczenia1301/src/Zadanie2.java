public class Zadanie2 {
    public static void main(String[] args) {
printStaticHello();
New print1 = new New();
print1.printHello();
/*Aby pokazac metode nie static, nalezy stworzyc osobna klase i w niej te metode i potem stworzyc obiekt ktory wywola z tej klasy metode*/
    }
    public static void printStaticHello() {
        System.out.println("Hello!");
    }
}
 class New {
     public void printHello(){
         System.out.println("Hello!");
     }
}