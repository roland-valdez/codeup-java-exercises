package grades;

import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> grade;

    public static void main(String[] args) {
        Student roland = new Student("Roland");
        System.out.println(roland.getName());
        roland.addGrade(0);
        roland.addGrade(100);
        System.out.println(roland.grade);
        System.out.println(roland.getGradeAverage());

        Student tatiana = new Student("Tatiana");
        System.out.println(tatiana.getName());
        tatiana.addGrade(50);
        tatiana.addGrade(100);
        System.out.println(tatiana.grade);
        System.out.println(tatiana.getGradeAverage());
    }

    public Student (String name){
        ArrayList<Integer> grade = new ArrayList<>();
        this.name = name;
        this.grade = grade;
    }

    // returns the student's name
    public String getName(){
        return name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grade.add(grade);

    };
    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (double score : grade) {
            total += score;
        }
        return (total / grade.size());
    }
}
