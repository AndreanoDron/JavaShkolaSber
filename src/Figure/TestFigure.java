package Figure;

public class TestFigure {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Длина окружности  "+circle.perimetr()+" Плошадь окружности "+circle.ploshad());

        Rect rect = new Rect(2,1.3);
        System.out.println("Длина прямоугольника "+rect.perimetr()+" Плошадь прямоугольника "+rect.ploshad());



        Triangle triangle = new Triangle(2.2,1,2);
        System.out.println("Длина триугольника "+triangle.perimetr()+" Плошадь триугольника "+triangle.ploshad());

        Square square = new Square(2.2);
        System.out.println("Длина квадрата "+square.perimetr()+" Плошадь квадрата "+square.ploshad());


    }


}
