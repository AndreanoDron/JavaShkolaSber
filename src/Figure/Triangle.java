package Figure;

public class Triangle extends Snapes {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Дружише не коретное число или отрицательное!!!");
        }else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }

    @Override
    public double perimetr() {
        return sideA + sideB + sideC;
    }

    @Override
    public double ploshad() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}  //треугольник

