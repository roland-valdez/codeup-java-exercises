package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args){
        System.out.println("To calculate circle properties I am going to need the radius of the circle.");
        Input circleRadius = new Input();
        Circle setRadius = new Circle(circleRadius.getDouble());
        System.out.println("The area of the the circle is " + setRadius.getArea());
        System.out.println("The circumference of the the circle is " + setRadius.getCircumference());

    }
}
