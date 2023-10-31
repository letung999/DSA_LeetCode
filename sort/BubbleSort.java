package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            boolean isSorted = false;
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = true;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            if(!isSorted){
                break;
            }
            printArray(i, arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 1, 0, 6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int index, int[] arr) {
        System.out.println("index: " + index);
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
