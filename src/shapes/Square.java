package shapes;

public class Square extends Rectangle {
    protected double side = 5;
    public Square (double side){
        super(side, side);
    }

    public double getArea(){
        return Math.pow(side, 2);
    }
    public double getPerimeter(){
        return this.side * 4;
    }
}
