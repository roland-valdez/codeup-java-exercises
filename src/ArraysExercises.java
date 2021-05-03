import java.util.Arrays;

public class ArraysExercises {

    public static void main(String [] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);// gives the address where the array is stored in memory
        Person tati = new Person("Tatiana");
        Person alex = new Person("Alejandro");
        Person daniel = new Person("Daniel");
        String[] people = {tati.getName(), alex.getName(), daniel.getName()};
        System.out.println(Arrays.toString(people));
        Person roland = new Person("Roland");
        addPerson(people, roland.getName());

    }

    static void addPerson(String[] people, String person){
        String[] newArray = Arrays.copyOf(people, people.length + 1);
        System.out.println(Arrays.toString(newArray));
        newArray[people.length] = person;
        System.out.println(Arrays.toString(newArray));

    }

}
