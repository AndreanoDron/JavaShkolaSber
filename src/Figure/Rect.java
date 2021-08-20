package Figure;

public class Rect extends Snapes {

  private   int sideA;
  private   int sideB;

    public Rect(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }



    @Override
    void getPerimetr() {
        if (sideA <=0 || sideB <=0) {
            System.out.println("Дружише не коретное число или отрицательное!!!");
        } else {
            double per = (sideA + sideB)*2;
            System.out.println("Периметр прямоугольника "+ per);
        }
    }

    @Override
    void getPloshad() {

        if (sideA <=0 || sideB <=0) {

        } else {
            double plosh = sideA * sideB;
            System.out.println("Плошадь прямоугольника "+ plosh);
        }
    } //прямоугольник
}
