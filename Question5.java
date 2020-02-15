import java.util.*;

public class Question5 {
	public static void main(String [] args){
		Scanner keyinput = new Scanner(System.in);
		System.out.println("\n~~~~~~~~~~~~~ Generating a random number! ~~~~~~~~~~~~~ ");

	// Since the java.util.* package is utilized, we are able to use the Random() method.
		Random rand = new Random();
		int n = rand.nextInt(101);
		System.out.println("\nGenerated random number is: " + n +"!");

	// These are the the mathematical operations used for the result of random generated number.
		double power2 = Math.pow(n, 2);
		double power3 = Math.pow(n, 3);
		double sqrt = Math.sqrt(n);
		double ln = Math.log(n);
		double ln10 = Math.log10(n);

	// This is used to create a line break; to make the program look cleanly spaced.
		System.out.println();

	// Alas, this outputs the results of each following mathematical operations! 
		System.out.println(n + " to the Power of 2 = " + power2);
		System.out.println(n + " to the Power of 3 = " + power3);
		System.out.println("Square root of " + n + " = " + sqrt);
		System.out.println("Natural logarithm of " + n + " = " + ln);
		System.out.println("Base 10 logarithm of " + n + " = " + ln10);
	
	}
}