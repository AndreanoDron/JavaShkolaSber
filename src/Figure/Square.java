package Figure;

public class Square extends Snapes {
    private double side;

    public Square(double side) {
        if (side <= 0) {
            System.out.println("Дружише не коретное число или отрицательное!!!");
        }else {
            this.side = side;
        }
    }

    @Override
    double perimetr() {
        return (side + side) * 2;

    }

    @Override
    double ploshad() {
        return side * side;
    }

}
