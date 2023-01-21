package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Scanner input1 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter first binary number");
		String binarynum1 = input1.nextLine();  // Read user input
		Binary binary1=new Binary(binarynum1);
        System.out.println( "First binary number is "+binary1.getValue());
		Scanner input2 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter second binary number");
		String binarynum2 = input1.nextLine();  // Read user input
		Binary binary2=new Binary(binarynum2);
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());
    }
}
