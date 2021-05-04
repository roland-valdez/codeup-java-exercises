package shapes;

public class ShapesTest {
    public static void main (String [] args){
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Area of Rectangle:");
        System.out.println(box1.getArea());
        System.out.println("Perimeter of Rectangle:");
        System.out.println(box1.getPerimeter());
        System.out.println();
        Rectangle box2 = new Square(5);
        System.out.println("Area of Square:");
        System.out.println(box2.getArea());
        System.out.println("Perimeter fo Square:");
        System.out.println(box2.getPerimeter());
    }
}
