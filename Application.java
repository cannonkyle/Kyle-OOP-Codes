// Place import libraries up here.
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;


public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // takes input from user

//Introduction
       // System.out.println(" Hello " + " World! "); // the + sign allows you to concatonate strings and variable values.

    //  1. What is the value of ‘a’ after each of the following expressions?
        //a.
       // int a = 3 / 2 ;  //Answer is 1
       // System.out.println(" a, " + a);
        //b.
       // float a = 3 / 2 ;    //Answer is 1.0 why not 1.5?????
        //System.out.println("a, " + a);
        //c.
       // float a = 3 / 2f ;   //Answer is 1.5
       // System.out.println("a, " + a);
        //d.
        float a = ( /*(float)*/5 * 5 - 4 ) / 6 ;    //Answer is 3.0 why not 3.5 ????? integer numbers inside are not casted to float as well, a is a float but not the numbers in the equation
        System.out.println("a, " + a);
        //e.
       // float a = ( float ) 3 / 2 ;      //Answer is 1.5


    /*  2. You have recently taken a multiple choice biology exam for which no partial marks are
awarded. Write a program to convert your score (out of 63) to a percent and print the
result. You may optionally incorporate I/O in your program to read input from the user.
*/

    System.out.println("Please enter your Biology Exam mark out of 63 : ");        // output to user
    int ExamPoints = input.nextInt();                                              //  assigning variable and setting it to scan the next line for input from the user

    float ExamPercent =  ((float)ExamPoints / 63)*100;                                    //  (float) casts the variable ExamPercent to a float value to give a proper percentage
        DecimalFormat fmt = new DecimalFormat("0.#");
    System.out.println(" Your exam percentage is: " + fmt.format(ExamPercent) +  " Percent."); // Printing the exam percentage.


    }
}