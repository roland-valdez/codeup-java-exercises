package shapes;

public class Rectangle extends Quadrilateral implements Measurables{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setMeasurement(double length, double width) {
        this.length = length;
        this.width = width;

    }
}
