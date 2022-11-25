public class Zadanie4 {
    public static void main(String[] args) {
        int x, y, z, i, j;
        x = 5;
        y = 3;
        z = 8;
        for (i = 0; i < z; i++) {
            for (j = 0; j < y; j++) {
                if (x < z) {
                    System.out.println("  ");
                } else {
                    System.out.println("* ");
                }
                if (y < z) {
                    System.out.println("  ");
                } else {
                    System.out.println("* ");
                }
                System.out.println("* ");
            }
            System.out.println("\n");
        }
    }
}
