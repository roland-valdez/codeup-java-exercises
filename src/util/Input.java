package util;

import java.util.Scanner;

public class Input {
//    private class scanner;

    Scanner scanner = new Scanner(System.in);

    public String getString() {
        String input = scanner.nextLine();

        System.out.println("Enter a string.");
        input = scanner.nextLine();
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
        String input = scanner.nextLine();

        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    };

    public int getInt(int min, int max){
        System.out.println("Enter an integer number between " + min + " and " + max + ".");
        int input = scanner.nextInt();
        if (input >= min && input <= max){
            return input;
        }
        else {
            System.out.println("The input is not within the parameters.");
            return getInt(min, max);
        }
    };

    public int getInt(){
        System.out.println("Enter an integer number.");
//
        if (scanner.hasNextInt()){
            int input  = scanner.nextInt();
            return input;
        }
        else {
            String input  = scanner.next();
            System.out.println("The input " + input +  " is not an integer.");
            return getInt();
        }

    };

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal number between " + min + " and " + max + ".");
        double input = scanner.nextDouble();
        if (input >= min && input <= max){
            return input;
        }
        else {
            System.out.println("The input is not within the parameters.");
            return getDouble(min, max);
        }
    };

    public double getDouble(){
        System.out.println("Enter a decimal number.");
        if (scanner.hasNextDouble()){
            double input  = scanner.nextDouble();
            return input;
        }
        else {
            String input  = scanner.next();
            System.out.println("The input " + input +  " is not a decimal.");
            return getDouble();
        }
    };
    public String getString(String prompt) {
        System.out.println(prompt);

        String input = scanner.nextLine();

        System.out.println("Enter a string.");
        input = scanner.nextLine();
        if (!input.equals("")){
            return input;
        }
        else {
            System.out.println("Please enter a string");
            return getString();
        }
    };

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        System.out.println("Please enter yes or no");
        String input = scanner.nextLine();

        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    };

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        System.out.println("Enter an integer number between " + min + " and " + max + ".");
        int input = scanner.nextInt();
        if (input >= min && input <= max){
            return input;
        }
        else {
            System.out.println("The input is not within the parameters.");
            return getInt(min, max);
        }
    };

    public int getInt(String prompt){
        System.out.println(prompt);
        System.out.println("Enter an integer number.");
//
        if (scanner.hasNextInt()){
            int input  = scanner.nextInt();
            return input;
        }
        else {
            String input  = scanner.next();
            System.out.println("The input " + input +  " is not an integer.");
            return getInt();
        }

    };

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        System.out.println("Enter a decimal number between " + min + " and " + max + ".");
        double input = scanner.nextDouble();
        if (input >= min && input <= max){
            return input;
        }
        else {
            System.out.println("The input is not within the parameters.");
            return getDouble(min, max);
        }
    };

    public double getDouble(String prompt){
        System.out.println(prompt);
        System.out.println("Enter a decimal number.");
        if (scanner.hasNextDouble()){
            double input  = scanner.nextDouble();
            return input;
        }
        else {
            String input  = scanner.next();
            System.out.println("The input " + input +  " is not a decimal.");
            return getDouble();
        }
    };


}
