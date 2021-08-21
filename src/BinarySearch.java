import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Ведите число!!!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println("Ищем число " + number + " в массиве!!!");
        int x = getBinarySearch(number, arr);
        int x1 = getBinarySearch2(number, arr);
        // для проверки System.out.println("Возврашаемое число по индексу = " + x);
        System.out.println("Возврашаемое число по индексу = " + x);
        if (x >= 0  ) {
            System.out.println(number + " Такое число есть в массиве!!!");

        } else {
            System.out.println("Такого числа нет в массиве!!!");
        }
    }

    private static int getBinarySearch2(int number, int[] arr) {
int x;

        return number;
    }

    private static int getBinarySearch(int number, int[] arr) {

        return Arrays.binarySearch(arr, number);
    }



}





