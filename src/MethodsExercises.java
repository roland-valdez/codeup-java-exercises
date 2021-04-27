import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide me with two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("The result of adding " + num1 + " and " + num2 + " is: ");
        System.out.println(addition(num1, num2));
        System.out.println("The result of subtracting " + num1 + " from " + num2 + " is: ");
        System.out.println(subtraction(num1, num2));
        System.out.println("The result of multiplying " + num1 + " by " + num2 + " is: ");
        System.out.println(multiplication(num1, num2));
        System.out.println("The result of dividing " + num1 + " by " + num2 + " is: ");
        System.out.println(division(num1, num2));
        System.out.println("The modulo of " + num1 + " by " + num2 + " is: ");
        System.out.println(modulus(num1, num2));
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtraction(double num1, double num2) {
        return num2 - num1;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public static double division(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

}
