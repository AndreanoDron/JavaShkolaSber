package Figure;

public class TestFigure {
    public static void main(String[] args) {
        Circle circle = new Circle(1);

        System.out.printf("Длина окружности  " + "%3.2f%n", circle.perimetr());
        System.out.printf("Плошадь окружности  " + "%3.2f%n", circle.ploshad());

        Rect rect = new Rect(2, 1.3);
        System.out.printf("Длина Прямоугольника   " + "%3.2f%n", rect.perimetr());
        System.out.printf("Плошадь прямоугольника  " + "%3.2f%n", rect.ploshad());


        Triangle triangle = new Triangle(2, 1, 2);
        System.out.printf("Длина триугольника  " + "%3.2f%n", triangle.perimetr());
        System.out.printf("Плошадь триугольника  " + "%3.2f%n", triangle.ploshad());

        Square square = new Square(2.2);
        System.out.printf("Длина квадрата  " + "%3.2f%n", square.perimetr());
        System.out.printf("Плошадь квадрата  " + "%3.2f%n", square.ploshad());


    }


}
