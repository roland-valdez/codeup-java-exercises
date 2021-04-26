public class HelloWorld {
    public static void main(String[] args) {

        //1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
            int myFavoriteNumber = 23;
            System.out.println(myFavoriteNumber);

        //2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Roland";
        System.out.println(myString);

        //3. Change your code to assign a character value to myString. What do you notice?
        char myString2 = 'r';

        //4. Change your code to assign the value 3.14159 to myString. What happens?
            // float myString = 3.14159F;

        //5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        long myNumber;
        //System.out.println(myNumber);

        //6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//             myNumber = 3.14;

        //7.  Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
             myNumber = 123L;

        //8.  Change your code to assign the value 123 to myNumber.
             myNumber = 123;

        //9.  Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//             int myNumber2 = 3.14;

        //10. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//             myNumber = 3.14F;

//             if (myNumber != 123){
//                 myNumber = 3.14F;
//             }
            //change the scope or explicit cast - narrowing conversion
            // Copy and paste the following code blocks one at a time and execute them

                int f = 6;
                System.out.println(f++);
                System.out.println(f);

                int y = 6;
                System.out.println(++y);
                System.out.println(y);

                // What is the difference between the above code blocks? Explain why the code outputs what it does.
                    // pre and post addition

        //11. Try to create a variable named class. What happens?
            int classes = 3;
            // it is a reserved word

        //12. Object is the most generic type in Java. You can assign any value to a variable of type Object.
        // What do you think will happen when the following code is run?
            String theNumberThree = "three";
            System.out.println(theNumberThree);
            Object o = theNumberThree;
            System.out.println(o);

        //How is the above example different from the code block below?
            // int three = (int) o;
            // System.out.println(three);
        //What are the two different types of errors we are observing?

        //Copy and paste the code above and then run it. Does the result match with your expectation?
            // re-referencing three will cause problems

        //How is the above example different from the code block below?
            // int three = (int) "three";
            // this wont even compile as you are trying to explicitly cast a string into a integer.


        //13. Rewrite the following expressions using the relevant shorthand assignment operators:
            int x = 4;
            //  x = x + 5;
                x += 5;
                System.out.println(x);
            int i = 3;
            int j = 4;
            // j = j * i;
                j *= i;
                System.out.println(j);
            int a = 10;
            int b = 2;
                a /= b;
                System.out.println(a);
                b -= a;
                System.out.println(b);
            // a = a / b;
            // a = b - a;


        //14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
            int maxNumber = Integer.MAX_VALUE;
            System.out.println(maxNumber);
            maxNumber = maxNumber * maxNumber;
            System.out.println(maxNumber);
            

    }
}
