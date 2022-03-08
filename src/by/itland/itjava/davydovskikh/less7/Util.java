package by.itland.itjava.davydovskikh.less7;
public class Util {

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int item : array){
            System.out.println(item + " ");
        }
    }

    public static boolean checkSort(int[] array) {
        return true;
    }
}