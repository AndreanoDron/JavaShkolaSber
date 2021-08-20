package Figure;

public class Circle extends Snapes {//круг
    private int radius;
    final double Pi = Math.PI;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    void getPerimetr() {
        if (radius <= 0) {
            System.out.println("Дружише не коретное число или отрицательное!!!");


        } else {
            double per = 2 * Pi * radius;
            System.out.println("Периметр круга " + per);
        }

    }

    @Override
    void getPloshad() {
        if (radius <= 0) {

        } else {
            double plosh = radius * radius * Pi;
            System.out.println("Плошадь круга " + plosh);
        }
    }


}
