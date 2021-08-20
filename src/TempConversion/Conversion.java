package TempConversion;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

        System.out.println("Ведите температуру в Цельсия. ");
        Scanner scanner = new Scanner(System.in);
        double cels = scanner.nextInt();
        System.out.println("Перевод температуры Цельсия в Фаренгейта, Кельвины, Ньютона!!! ");
        conversionFarenget(cels);
        conversionKelvina(cels);
        conversionNuton(cels);
    }


    private static void conversionFarenget(double cels) {

        double fr = (1.8 * cels) + 32;
        System.out.println("Температура  Фаренгейта " + fr + "\u00B0" + "F");
    }

    private static void conversionKelvina(double cels) {
        double tK = cels + 273.15;
        System.out.println("Температура Кельвина " + tK + "\u00B0" + "K");
    }

    private static void conversionNuton(double cels) {
        double nT = cels * 0.33000;
        System.out.println("Температура Ньютон " + nT + "\u00B0" + "N");
    }

}
