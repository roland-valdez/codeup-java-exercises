import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){
        double randomNumber = getRandom();
        int userInput = validateInput();
        int guesses = 1;
        int max = 5;
        gameHighLow(randomNumber, userInput, guesses, max);

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
    public static void gameHighLow(double random, int input, int guesses, int max){
        guesses++;
        if (input == random && guesses <= max) {
            System.out.println("You guessed the correct number");
            System.out.println("random = " + random);
            System.out.println("input = " + input);
        }
        else if (input > random && guesses <= max){
            System.out.println("Lower");
            int newInput = validateInput();
            gameHighLow(random, newInput, guesses, max);
        }
        else if (input < random && guesses <= max) {
            System.out.println("Higher");
            int newInput = validateInput();
            gameHighLow(random, newInput, guesses, max);
        } else {
            System.out.println("You have guessed incorrectly too many times!");
            System.out.println("You already guessed " + guesses + " times incorrectly.");
        }

    }

}
