public class Person {
    private String name;

    public static void main (String[] args){

    Person roland = new Person();
    roland.name = "Roland";
        System.out.println(roland.getName());
        roland.setName("joe");
        roland.sayHello();



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
