package javaFundamentals;

public class variablesAndDatatype {

    // datatype identifier;
    // datatype indentifier = value ;

    // char section = 'A';
        // String name = "David";
        // Boolean isTall = true;
        // int num3 = 5;
        // float grade = 95.55f;
        // double grade1 = 93.25;

        // section = 'B';
        // name = "Alenere";
        // isTall = true;
        // num3 = 10;
        // grade = 99.54f;
        
        

    public static void main(String[] args) {

        String name = "Rylle";
        System.out.println(name);

        //Output: Rylle

        name = "Alenere";
        System.out.println(name);

        //Output: Alenere

        //Concatenation: The process of joining string together with a plus operator
        // Concatination: "Hello" + "World"
        // Not 2 + 3 (Output: 5)

        String userName= "David";
        char section = 'A';

        System.out.println("I am " + userName + ".");
        System.out.println("I'm at Section " + section + "!");

        //Output: I am David.
        //Output: I'm at Section A!
    

    }

}
