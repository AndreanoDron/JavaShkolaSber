package Figure;

public class Triangle extends Snapes {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    void getPerimetr() {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Дружише не коретное число или отрицательное!!!");
        } else {
            double per = sideA + sideB + sideC;
            System.out.println("Периметр треугольника " + per);
        }
    }

    @Override
    void getPloshad() {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {

        } else {


            int p = (sideA + sideB + sideC) / 2;
            double plosh = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            System.out.println("Площадь треугольника " + plosh);
        }
    }  //треугольник
}
