package by.itland.itjava.davydovskikh.less7;

public class SortingMethod {
    public static long counterQuick;
    public static long counterMerge;
    public static long counterSelect;
    public static long counterShaker;
    public static long counterInsert;
    public static long counterBobble;
    public static long changeMerge;
    public static long changeQuick;
    public static long changeSelect;
    public static long changeShaker;
    public static long changeInsert;
    public static long changeBobble;

    static int partition(int[] arrayCopy, int left, int right) {
        int key = arrayCopy[left];
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            counterQuick++;
            if (arrayCopy[i] <= key) {
                change(arrayCopy, ++j, i);
            }
        }
        change(arrayCopy, left, j);
        return j;
    }

    public static void quickSort(int[] arrayCopy, int left, int right) {
        if (left >= right)
            return;
        int key = partition(arrayCopy, left, right);
        quickSort(arrayCopy, left, key - 1);
        quickSort(arrayCopy, key + 1, right);
    }


    public static void mergeSort(int[] arrayCopy, int size) {
        if (size == 1)
            return;
        int middle = size / 2;
        int[] LeftArr = new int[middle];
        int[] rightArr = new int[size - middle];
        for (int i = 0; i < middle; i++) {
            LeftArr[i] = arrayCopy[i];
            counterMerge++;
        }
        for (int i = middle; i < size; i++) {
            rightArr[i - middle] = arrayCopy[i];
            counterMerge++;
        }
        mergeSort(LeftArr, middle);
        mergeSort(rightArr, size - middle);
        merge(arrayCopy, LeftArr, rightArr, middle, size - middle);
    }

    static void merge(int[] arrayCopy, int[] LeftArr, int[] rightArr, int sizeLeft, int sizeRight) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < sizeLeft && j < sizeRight) {
            counterMerge++;
            if (LeftArr[i] <= rightArr[j]) {
                arrayCopy[k++] = LeftArr[i++];
            } else {
                arrayCopy[k++] = rightArr[j++];
            }
        }
        while (i < sizeLeft) {
            counterMerge++;
            arrayCopy[k++] = LeftArr[i++];
        }
        while (j < sizeRight) {
            arrayCopy[k++] = rightArr[j++];
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            counterSelect++;
            int minIndex = findMinIndex(array, i);
            if (i != minIndex){
                change(array, i, minIndex);
                changeSelect++;
            }
        }
    }

    static int findMinIndex(int[] array, int indexStart) {
        int index = indexStart;
        int min = array[index];
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void shakerSort(int[] arrayCopy) {
        int left = 0;
        int right = arrayCopy.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (arrayCopy[i] > arrayCopy[i + 1]) {
                    change(arrayCopy, i, i + 1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arrayCopy[i] < arrayCopy[i - 1]) {
                    change(arrayCopy, i, i - 1);
                }
            }
            left++;
        } while (left < right);
    }

    private static void change(int[] arrayCopy, int i, int j) {
        int buf = arrayCopy[i];
        arrayCopy[i] = arrayCopy[j];
        arrayCopy[j] = buf;
    }

    public static void insertionSort(int[] arrayCopy) {
        for (int i = 1; i < arrayCopy.length; i++) {
            int key = arrayCopy[i];
            int j = i - 1;
            while (j >= 0 && arrayCopy[j] > key) {
                arrayCopy[j + 1] = arrayCopy[j];
                j--;
            }
            arrayCopy[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int buf = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buf;
                }
            }
        }
    }
}