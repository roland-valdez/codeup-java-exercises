package shapes;

public class Square extends Quadrilateral implements Measurables {


    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public void setMeasurement(double length, double width) {
        this.length = length;
        this.width = width;
    }

}
