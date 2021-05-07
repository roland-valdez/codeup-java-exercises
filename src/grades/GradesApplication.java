package grades;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>(); //initializes Hashmap

        Student roland = new Student("Roland");//creates individual students
        roland.addGrade(0);
        roland.addGrade(0);
        roland.addGrade(0);
        roland.addGrade(100);

        Student norma = new Student("Norma");
        norma.addGrade(0);
        norma.addGrade(0);
        norma.addGrade(100);
        norma.addGrade(100);

        Student tatiana = new Student("Tatiana");
        tatiana.addGrade(0);
        tatiana.addGrade(100);
        tatiana.addGrade(100);
        tatiana.addGrade(100);

        Student alex = new Student("Alex");
        alex.addGrade(100);
        alex.addGrade(100);
        alex.addGrade(100);
        alex.addGrade(100);


        students.put("novice-programmer", roland);// adds individual key value entries to hashmap
        students.put("midlevel-programmer", norma);
        students.put("expert-programmer", tatiana);
        students.put("wizard-programmer", alex);
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Here is the list of the user names.");
            System.out.println(students.keySet());// prints out all keys from hashmap - students
            System.out.println("Which of the users would you like to see information on?");
            String userName = scanner.nextLine();


            if (students.get(userName) != null){ // looks for the value(Student) of the specified key typed in.  if not found returns null.
                String realName = students.get(userName).getName();
                double personalGrade = students.get(userName).getGradeAverage();
                System.out.println("The information for " + userName + " is the following.");
                System.out.println("Their real name is " + realName + " and their average grade is " + personalGrade);
                System.out.println("Would you like to continue to view all of their grades? yes or no");
                String allGrades = scanner.nextLine();
                if (allGrades.equalsIgnoreCase("y")){
                    System.out.println(students.get(userName).getAllGrades());
                }
            }
           else {
                System.out.println(userName + " does not exist. You will have to continue to try again.");
            }


            System.out.println("Would you like to continue? yes or no?");
            String yesNo = scanner.nextLine();
            if (!yesNo.equalsIgnoreCase("y")){
                break;
            }
        }

    }
}
