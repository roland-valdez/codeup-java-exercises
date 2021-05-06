package shapes;

public class Circle {

    private double radius;
    private static int i = 0;

    public Circle(double radius){
        this.radius = radius;
        i++;
    }
    public double getArea(){
        return radius * radius *  Math.PI;
    }
    public double getCircumference(){
        return 2 * radius *  Math.PI;
    }
    public static int counter(){
        return i;
    }
}
