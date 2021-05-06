package shapes;

public abstract class Quadrilateral extends Shape implements Measurables{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    };
    public double getArea(){
        return this.length * this.width;
    };
    public abstract void setMeasurement(double length, double width );
}
