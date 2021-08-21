package Figure;

public class Rect extends Snapes {

    private double sideA;
    private double sideB;

    public Rect(double sideA, double sideB) {
        if (sideA <= 0 || sideB <= 0) {
            System.out.println("Дружише не коретное число или отрицательное!!!");
        }else {
            this.sideA = sideA;
            this.sideB = sideB;
        }
    }


    @Override
    public double perimetr() {

        return (sideA + sideB) * 2;
    }

    @Override
    public double ploshad() {

        return sideA * sideB;

    } //прямоугольник
}
