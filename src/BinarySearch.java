import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Ведите число!!!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int left = 0;
        int right = arr.length - 1;

        System.out.println("Ищем число " + number + " в массиве!!!");
        System.out.println("Index v massive №" + getBinarySearch2(arr, number, left, right));


        // int x = getBinarySearch(number, arr);
        

        //  для проверки System.out.println("Возврашаемое число по индексу = " + x);
//        System.out.println("Возврашаемое число по индексу = " + x);
//        if (x >= 0) {
//            System.out.println(number + " Такое число есть в массиве!!!");
//
//        } else {
//           System.out.println("Такого числа нет в массиве!!!");
//       }
    }

    private static int getBinarySearch2(int[] arr, int number, int left, int right) {
        if (right >= left) {
            int midl = left + (right - left) / 2;

            if (arr[midl] == number) {
                return midl;
            }
            if (arr[midl] > number) {
                return getBinarySearch2(arr, number, left, midl - 1);
            } else {
                return getBinarySearch2(arr, number, midl + 1, right);
            }
        }
        return -1000;
    }


//    private static int getBinarySearch(int number, int[] arr) {
//
//        return Arrays.binarySearch(arr, number);
//    }


}





