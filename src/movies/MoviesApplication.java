package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
           System.out.println("What would you like to do?");
           System.out.println();
           System.out.println("0 - exit");
           System.out.println("1 - view all movies");
           System.out.println("2 - view movies in the animated category");
           System.out.println("3 - view movies in the drama category");
           System.out.println("4 - view movies in the horror category");
           System.out.println("5 - view movies in the scifi category");
           System.out.println();
           System.out.print(" Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 0){
                break;
            }
            else if(choice == 1){
                System.out.println("display all list");

            }

       }
    }

}
