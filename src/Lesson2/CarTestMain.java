package Lesson2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CarTestMain {

    public static void main(String[] args) {
        //        1) имеем структуру машина с двумя свойствами
        //        2) ввести в программу примеры разных машин
        //        3) отсортировать их по типу
        //        4) вывести отсортированный список машин


        List<Car> park = new ArrayList<>();

        Car car1 = new Car("Lada", "Sedan");
        Car car2 = new Car("Lada", "hatchback");
        Car car3 = new Car("Mercedes", "Sedan");
        Car car4 = new Car("Mercedes", "hatchback");
        Car car5 = new Car("Bmw", "Sedan");
        Car car6 = new Car("Bmw", "crossover");
        Car car7 = new Car("Ford", "Sedan");
        Car car8 = new Car("Ford", "hatchback");
        Car car9 = new Car("Peugeot", "Sedan");
        Car car10 = new Car("Peugeot", "hatchback");
        Car car11 = new Car("Toyota", "Sedan");
        Car car12 = new Car("Toyota", "crossover");

        park.add(car1);
        park.add(car2);
        park.add(car3);
        park.add(car4);
        park.add(car5);
        park.add(car6);
        park.add(car7);
        park.add(car8);
        park.add(car9);
        park.add(car10);
        park.add(car11);
        park.add(car12);

        Map<String, List<Car>> carGrupTupe = park.stream().collect(Collectors.groupingBy(Car::getType));


        carGrupTupe.forEach((tupe, model) -> {
            System.out.println(tupe);
            for (Car car : model) {

                System.out.println(car);

            }
            System.out.println();
        })
        ;


    }

}








