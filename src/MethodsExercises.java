
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide me with two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        int i = 1;
        System.out.println("The result of adding " + num1 + " and " + num2 + " is: ");
        System.out.println(addition(num1, num2));
        System.out.println("The result of subtracting " + num1 + " from " + num2 + " is: ");
        System.out.println(subtraction(num1, num2));
        System.out.println("The result of multiplying " + num1 + " by " + num2 + " is: ");
        System.out.println(multiplication(num1, num2, i));
        System.out.println("The result of dividing " + num1 + " by " + num2 + " is: ");
        System.out.println(division(num1, num2));
        System.out.println("The modulo of " + num1 + " by " + num2 + " is: ");
        System.out.println(modulus(num1, num2));
        double userInput = getInteger(1, 10);
        System.out.println("userInput within the parameters = " + userInput);
        factorial();
        diceRoll();
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num2 - num1;
    }

    public static double multiplication(double num1, double num2, int i) {
        i++;
        if(i <= num2){
            num1 += num1;
            return multiplication(num1, num2, i);

        }
        else{
            return num1;
        }

    }

    public static String division(double num1, double num2) {
        if (num2 == 0){
            return "undefined";
        }
        else {
            return "" + (num1 / num2) + "";
        }
    }

    public static String modulus(double num1, double num2) {
        if (num2 == 0){
            return "undefined";
        }
        else {
            return "" + (num1 % num2) + "";
        }
    }

    public static double getInteger(double min, double max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 170: ");
        double num = scanner.nextDouble();
        if( num >= min && num <= max) {
            return num;
        }
        else {
            return getInteger(min,max);
        }
    }
    public static void factorial(){
        double inputNum = getInteger(1, 170);
        double factorialNum = 1;
        for (double i = 1; i <= inputNum; i++){
            factorialNum *= i;
        }
        System.out.println(factorialNum);
    }
     public static void diceRoll(){
        Scanner scanner = new Scanner(System.in);
         System.out.println("How many sides do you want the simulated dice to have?");
         int diceSides = scanner.nextInt();
         double diceRoll1 = Math.ceil(Math.random() * (diceSides - 1) + 1);
         double diceRoll2 = Math.ceil(Math.random() * (diceSides - 1) + 1);
         System.out.printf("Your first roll was a %.0f and your second roll was a %.0f", diceRoll1, diceRoll2);
     }
}
