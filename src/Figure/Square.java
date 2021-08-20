package Figure;

public class Square extends Snapes {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    void getPerimetr() {
        if (side <= 0) {
            System.out.println("Дружише не коретное число или отрицательное!!!");

        } else {
            double per = (side + side) * 2;
            System.out.println("Периметр квадрата " + per);
        }
    }

    @Override
    void getPloshad() {
        if (side <= 0) {

        } else {
            double plosh = side * side;
            System.out.println("Плошадь квадрата " + plosh);
        }
    }  //квадрат

}
