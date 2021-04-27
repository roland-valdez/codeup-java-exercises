import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args ) {

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f.", pi);


        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWhat is your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old?");
        // if not an integer it will give error message

        System.out.println("Describe yourself in three word.");
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();

        System.out.println("Your first word was: " + first + ".");
        System.out.println("Your second word was: " + second + ".");
        System.out.println("Your third word was: " + third + ".");

        System.out.println("What is your favorite quote?\n");
        String quote  = scanner.nextLine();
        System.out.println("Your favorite quoute is: \"" + quote + "\"");

//        System.out.println("Enter the length of the room.");
//        String lengthString = scanner.nextLine();
//        int length = Integer.parseInt(lengthString);
//        System.out.println("Enter the width of the room.");
//        String widthString = scanner.nextLine();
//        int width = Integer.parseInt(widthString);
//        System.out.println("Area of the classroom is: " + (length * width) + ".");
//        System.out.println("Perimeter of the classroom is: " + ((length *2) + (width * 2))+ ".");

//        System.out.println("Enter the length of the room with decimals if needed.");
//        String lengthString = scanner.nextLine();
//        double length = Double.parseDouble(lengthString);
//        System.out.println("Enter the width of the room with decimals if needed.");
//        String widthString = scanner.nextLine();
//        double width = Double.parseDouble(widthString);
//        System.out.println("Enter the height of the room with decimals if needed.");
//        String heightString = scanner.nextLine();
//        double height = Double.parseDouble(heightString);
//        System.out.println("Area of the classroom is: " + (length * width) + ".");
//        System.out.println("Perimeter of the classroom is: " + ((length *2) + (width * 2))+ ".");
//        System.out.println("Volume of the classroom is: " + (length * width * height) + ".");

        System.out.println("Enter the length, width and height of the room with decimals if needed.");
//        scanner.useDelimiter("\n");
        String lengthString = scanner.next();
        double length = Double.parseDouble(lengthString);
        String widthString = scanner.next();
        double width = Double.parseDouble(widthString);
        String heightString = scanner.next();
        double height = Double.parseDouble(heightString);

        System.out.println("Area of the classroom is: " + (length * width) + ".");
        System.out.println("Perimeter of the classroom is: " + ((length *2) + (width * 2))+ ".");
        System.out.println("Volume of the classroom is: " + (length * width * height) + ".");

    }

}
