package util;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter a string.");
        String input = scanner.nextLine();
        if (!input.equals("")){
            return input;
        }
        else {
            System.out.println("Please enter a string");
           return getString();
        }
    };

    public boolean yesNo(){
        System.out.println("Please enter yes or no");
        String input = scanner.next();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    };

    public int getInt(int min, int max){
        System.out.println("Enter an integer number between " + min + " and " + max + ".");
        int input = scanner.nextInt();
        if (input >= min || input <= max){
            return input;
        }
        else {
            System.out.println("The input is not within the parameters.");
            return getInt(min, max);
        }
    };

    public int getInt(){
        System.out.println("Enter an integer number.");
        int input = scanner.nextInt();
        if (scanner.hasNextInt()){
            return input;
        }
        else {
            System.out.println("The input is not within the parameters.");
            return getInt();
        }
    };

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal number between " + min + " and " + max + ".");
        double input = scanner.nextDouble();
        if (input >= min || input <= max){
            return input;
        }
        else {
            System.out.println("The input is not within the parameters.");
            return getDouble(min, max);
        }
    };

    public double getDouble(){
        System.out.println("Enter a decimal number.");
        double input = scanner.nextDouble();
        if (scanner.hasNextDouble()){
            return input;
        }
        else {
            System.out.println("The input is not within the parameters.");
            return getDouble();
        }
    };


}
