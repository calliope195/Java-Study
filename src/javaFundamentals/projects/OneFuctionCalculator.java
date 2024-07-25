package javaFundamentals.projects;
import java.util.Scanner;

public class OneFuctionCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x;

        System.out.print("Num 1: ");
        x = scan.nextInt();

        int y;

        System.out.print("Num 2: ");
        y = scan.nextInt();

        int answer = x+y;
        System.out.println("Result: " + x + " + " + y + " = " + answer);

        scan.close();

        // float numOne;
        // float numTwo;
        // float result;

        //Scanner scan = new Scanner(System.in);

        //System.out.print("First Number: ");
        //numOne = s.nextFloat;

        //System.out.print("Second number: ");
        //numTwo = s.nextFloat;

        //result = numOne + numTwo;

        //System.out.println("The Result is: " + numOne + "+" + numTwo  + "=" + result);

    }

}
