package shapes;

public class ShapesTest {
    public static void main (String [] args){
        Measurables myShape = new Rectangle(4, 5);
//        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Area of Rectangle:");
        System.out.println(myShape.getArea());
        System.out.println("Perimeter of Rectangle:");
        System.out.println(myShape.getPerimeter());
        System.out.println();
        Measurables myShape2 = new Square(4, 4);
//        Rectangle box2 = new Square(5);
        System.out.println("Area of Square:");
        System.out.println(myShape2.getArea());
        System.out.println("Perimeter of Square:");
        System.out.println(myShape2.getPerimeter());
    }
}
