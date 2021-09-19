package Lesson10MultithreadingPart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Lesson10MultithreadingPart1.CalculateFactorial.factorial;

public class Main {
    private static int fact;

    public static void main(String[] args) throws FileNotFoundException {

        List<Integer> listIntov = new ArrayList<>();
        File fileInt = new File("d:/namber.txt");
        Scanner scanner = new Scanner(fileInt);
        for (Scanner it = scanner; it.hasNext(); ) {
            int i = Integer.parseInt(it.next());
            //System.out.println(i);
            listIntov.add(i);


        }
        for (Object i : listIntov) {
            fact = (int) i;
            new MyThread(fact).start();
        }


    }

}

class MyThread extends Thread {
    private double fact2;

    public MyThread(long fact) {

        this.fact2 = fact;

    }

    @Override
    public void run() {


        System.out.println(Thread.currentThread().getName() + " Вычислить факториал числа :" + fact2 + "=" + factorial(fact2));

    }


}
