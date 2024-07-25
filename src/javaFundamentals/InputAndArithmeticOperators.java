package javaFundamentals;
import java.util.Scanner;

public class InputAndArithmeticOperators {

    public static void main(String[] args) {

//===Input===
    String x;

    Scanner scan = new Scanner(System.in); //Scans input from the User

    System.out.print("Enter Name: ");
    x = scan.nextLine();

    System.out.println("You are " + x);

    int y;

    System.out.print("Enter Number: ");
    y = scan.nextInt();

    System.out.println("Your number is " + y);

    scan.close(); //closes the scan variable

    //Output:
    // Enter Name: Rylle
    // You are Rylle
    // Enter Number: 15
    // Your number is 15

 //===Arithmethic Operators===

    int a = 5;
    int b = 2;

    System.out.println(a + b);
    //Output: 7
    
    int m = 10;
    int n = 5;

    System.out.println(m/n);
    //Output: 2

    int u = 5;
    int o = 2;

    System.out.println((o/u) + " r." + (o%u)); // o divided by u plus "remainder" plus modulus
    //Output: 2 r.1

    //using datatype Float: percise division
    float c = 5;
    float d = 2;

    System.out.println(c/d);
    //Output: 2.5
    }
}
