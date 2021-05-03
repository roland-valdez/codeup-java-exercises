package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    private static int i = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean confirm = true;

        do {
            System.out.println("To calculate circle properties I am going to need the radius of the circle.");
            Input circleRadius = new Input();
            Circle setRadius = new Circle(circleRadius.getDouble());
            System.out.println("The area of the the circle is " + setRadius.getArea());
            System.out.println("The circumference of the the circle is " + setRadius.getCircumference());
            System.out.println("Would you like to do another circle calculation? y/n");
            if (!scanner.nextLine().toLowerCase().startsWith("y")){
                confirm = false;
            }
            i++;
        } while (confirm);
        System.out.println("You ran the calculations for circles " + i + " times.");
    }
}
