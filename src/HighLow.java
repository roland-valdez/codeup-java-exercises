import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){
        double randomNumber = getRandom();
        int userInput = validateInput();
        gameHighLow(randomNumber, userInput);

    }
    public static double getRandom(){
        return Math.ceil(Math.random() * (100 - 1) + 1);
    }
    public static int validateInput(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int inputNum = scanner.nextInt();
        if (inputNum >= 1 && inputNum <= 100){
            return inputNum;
        }
        else {
            return validateInput();
        }
    }
    public static void gameHighLow(double random, int input){
        if (input == random) {
            System.out.println("You guessed the correct number");
            System.out.println("random = " + random);
            System.out.println("input = " + input);
        }
        else if (input > random){
            System.out.println("Lower");
            int newInput = validateInput();
            gameHighLow(random, newInput);
        }
        else {
            System.out.println("Higher");
            int newInput = validateInput();
            gameHighLow(random, newInput);
        }

    }

}
