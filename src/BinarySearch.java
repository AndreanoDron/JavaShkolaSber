import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println("Ищем число " + number + " в массиве!!!");
        int x = getBinarySearch(number, arr);
        System.out.println("X= " + x);
        if (x > 0) {
            System.out.println(number + " Такое число есть в массиве!!!");

        } else {
            System.out.println("Такого числа нет в массиве!!!");
        }
    }

    private static int getBinarySearch(int number, int[] arr) {
        // System.out.println(Arrays.binarySearch(arr,number));
        return Arrays.binarySearch(arr, number);
    }


//        int minIndex = arr[0];
//        int maxIndex = arr[arr.length - 1];
//        System.out.println(minIndex);
//        System.out.println(max);

//        BinarySearch_Rec(arr, minIndex, maxIndex, number);

//        int arr[] = {2, 3, 4, 10, 40};
//        int n = arr.length;
//        int x = 3;
//
//        int result = binarySearch(arr, 0, n - 1, x);
//        if (result == -1) {
//            System.out.println("Element not present");
//        } else {
//            System.out.println("Element found at index " +
//                    result);
//        }


//    static int binarySearch(int[] array, int left, int right, int key) {
//        int mid = left + (right - left) / 2;
//        if (array[mid] == key)
//            return mid;
//        else if (array[mid] > key) {
//            return binarySearch(array, left, mid - 1, key);
//        } else {
//            return binarySearch(array, mid + 1, right, key);
//        }
//    }

//    private static int binarySerch(int number, int[] arr, int min, int max) {
//        int position;
//
//        // для начала найдем индекс среднего элемента массива
//        position = min + (max - min) / 2;
//      if (arr[position]==number){
//          return position;
//      }else if (arr[position]>number){
//          return+1;
//      }else {
//          return -1;
//      }

//    Теперь посмотрим на рекурсивную реализацию:
//
//    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {
//
//        // условие прекращения
//        if (lastElement >= firstElement) {
//            int mid = firstElement + (lastElement - firstElement) / 2;
//
//            // если средний элемент - целевой элемент, вернуть его индекс
//            if (arr[mid] == elementToSearch)
//                return mid;
//
//            // если средний элемент больше целевого
//            // вызываем метод рекурсивно по суженным данным
//            if (arr[mid] > elementToSearch)
//                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);
//
//            // также, вызываем метод рекурсивно по суженным данным
//            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
//        }
//
//        return -1;
}





