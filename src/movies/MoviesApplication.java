package movies;

import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Movie[] list = MoviesArray.findAll();
        while (true) {
           System.out.println("What would you like to do?");
           System.out.println();
           System.out.println("0 - exit");
           System.out.println("1 - view all movies");
           System.out.println("2 - view movies in the animated category");
           System.out.println("3 - view movies in the drama category");
           System.out.println("4 - view movies in the horror category");
           System.out.println("5 - view movies in the scifi category");
           System.out.println("6 - add a new movie");
           System.out.println();
           System.out.print(" Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 0){
                break;
            }
            else if(choice == 1){
                System.out.println();
                System.out.println("These are all the movies:");
                for (Movie movie : list){
                    System.out.println("Title: " + movie.getMovie()[0] + "\tCategory: " + movie.getMovie()[1]);
                }
                System.out.println();
            }
            else if(choice == 2){
                System.out.println();
                System.out.println("These are all the animated movies:");
                for (Movie movie : list){
                    if (movie.getMovie()[1].equals("animated")){
                        System.out.println(movie.getMovie()[0]);
                    }
                }
                System.out.println();
            }
            else if(choice == 3){
                System.out.println();
                System.out.println("These are all the drama movies:");
                for (Movie movie : list){
                    if (movie.getMovie()[1].equals("drama")){
                        System.out.println(movie.getMovie()[0]);
                    }
                }
                System.out.println();
            }
            else if(choice == 4){
                System.out.println();
                System.out.println("These are all the horror movies:");
                for (Movie movie : list){
                    if (movie.getMovie()[1].equals("horror")){
                        System.out.println(movie.getMovie()[0]);
                    }
                }
                System.out.println();
            }
            else if(choice == 5){
                System.out.println();
                System.out.println("These are all the sci-fi movies:");
                for (Movie movie : list){
                    if (movie.getMovie()[1].equals("scifi")){
                        System.out.println(movie.getMovie()[0]);
                    }
                }
                System.out.println();
            }
            else if(choice == 6){
                System.out.println();
                System.out.println("Enter the title and the category of the movie you wish to add");
                String title = scanner.next();
                String category = scanner.next();
                System.out.println(list.length);
                Movie[] newList = Arrays.copyOf(list, (list.length + 1));
                System.out.println(newList.length);
                newList[newList.length - 1] = new Movie(title, category);
//
                System.out.println("These are all the movies:");
                for (Movie movie : newList){
                    System.out.println("Title: " + movie.getMovie()[0] + "\tCategory: " + movie.getMovie()[1]);
                }
                System.out.println();
            }
       }
    }

}
