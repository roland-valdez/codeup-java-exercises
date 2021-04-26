import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        String confirm;
        do {

            System.out.println("What number would you like to go up to:");
            int numberTo = scanner.nextInt();
            System.out.println("Here is your table");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= numberTo; i++) {
                int square = (i * i);
                int cubed = (i * i * i);
                if (square > 9) {
                    System.out.printf("%d      | %d      | %d\n", i, square, cubed);
                } else {
                    System.out.printf("%d      | %d       | %d\n", i, square, cubed);
                }
            }
            System.out.println("Do you wish to continue?: Y/y");
            confirm = scanner.next();
        }while(confirm.equalsIgnoreCase("y"));

    }

}
