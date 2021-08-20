package Figure;

public class TestFigure {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.getPerimetr();
        circle.getPloshad();

        Rect rect = new Rect(2,1);
        rect.getPerimetr();
        rect.getPloshad();

        Square square = new Square(1);
        square.getPerimetr();
        square.getPloshad();

        Triangle triangle = new Triangle(13,15,14);
        triangle.getPerimetr();
        triangle.getPloshad();



    }


}
