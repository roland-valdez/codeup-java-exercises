public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
    public static void main (String[] args){

    Person roland = new Person("roland");
//    roland.name = "Roland";
        System.out.println(roland.getName());
        roland.setName("joe");
        roland.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;// they share the same slot in memory so you change one you change both
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person1.setName("Paul");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
    public String getName(){
//TODO: return the person's name
        return this.name;

    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;

    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name);
    }
}
