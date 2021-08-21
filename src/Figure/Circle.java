package Figure;

public class Circle extends Snapes {//круг
    private double radius;



    public Circle(double radius) {
        if (radius <= 0) {
            System.out.println("Дружише не коретное число или отрицательное!!!");

        }else {
            this.radius = radius;
        }
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double ploshad() {
        return radius * radius * Math.PI;
    }
}
