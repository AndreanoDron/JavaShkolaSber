package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {8, 7, 43, 2, 67, 6, 1, 2, 0, -2, -54, 51};

        System.out.println(Arrays.toString(arr));
        getSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void getSort(int[] arr) {
        for (int barrer = arr.length - 1; barrer >= 0; barrer--) {
            for (int index = 0; index < barrer; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }
}
