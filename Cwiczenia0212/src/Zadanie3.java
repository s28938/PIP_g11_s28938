public class Zadanie3 {
    public static void main(String[] args) {
        int [] array = new int[] { 21,37,14,88,9,11,4,20,69,555};
        Tablica(array);
    }
    public static int [] Tablica (int[] array){

        System.out.println("Twoja tablica to: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.println("Tablica w odwrotnej kolejnosci: ");
        for (int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
