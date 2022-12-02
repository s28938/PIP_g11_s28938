public class Zadanie2 {
    public static void main(String[] args) {
        int[] array = new int[] { 21,37,14,88,9,11,4,20,69 };
        Tablica(array);
    }
    public static void Tablica (int[] array) {
        for (int i = 0; i <array.length; i++){
            int index = i;
            for (int j = i ; j <= array.length-1; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
