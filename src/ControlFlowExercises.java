import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        String confirm;
        do {

            System.out.println("What was your grade 0-100:");
            double grade = scanner.nextByte();
            if(grade >= 88){
                if(grade >= 99){
                    System.out.println("Your letter grade is an A+.");
                } else if (grade >= 88 && grade <= 90){
                    System.out.println("Your letter grade is an A-.");
                }
                else {
                    System.out.println("Your letter grade is an A.");
                }
            }else if(grade >= 80){
                if(grade >= 85){
                    System.out.println("Your letter grade is an B+.");
                } else if (grade >= 80 && grade <= 82){
                    System.out.println("Your letter grade is an B-.");
                }
                else {
                    System.out.println("Your letter grade is an B.");
                }
            }else if(grade >= 67){
                if(grade >= 77){
                    System.out.println("Your letter grade is an C+.");
                } else if (grade >= 67 && grade <= 69){
                    System.out.println("Your letter grade is an C-.");
                }
                else {
                    System.out.println("Your letter grade is an C.");
                }
            }else if(grade >= 60){
                if(grade >= 65){
                    System.out.println("Your letter grade is an D+.");
                } else if (grade >= 60 && grade <= 62){
                    System.out.println("Your letter grade is an D-.");
                }
                else {
                    System.out.println("Your letter grade is an D.");
                }
            }else {
                System.out.println("Your letter grade is an F.");
            }
            System.out.println("Do you wish to continue?: Y/y");
            confirm = scanner.next();
        }while(confirm.equalsIgnoreCase("y"));

    }

}
