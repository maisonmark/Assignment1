import java.util.*;

public class Question1{
	public static void main(String [] args){
		Scanner keyinput = new Scanner(System.in);
		System.out.println("\n~~~~~~~~ Welcome! Please enter the required information for your trip! ~~~~~~~~");
	
	// This is the information gathering process, where the user inputs the required information.
	System.out.println("\n 1. How much kilometers are you going to travel? ");
	double km = keyinput.nextDouble();	
	System.out.println(" 2. How much distance does your vehicle run per 1 liter gas?");
	double distance = keyinput.nextDouble();

	// 1.16$ is the price per liter. 
	double perliter = 1.16;
	double price = (km/distance) * perliter;

	// The printf() method is used to set two decimal numbers in place. 
	System.out.printf("\n The total cost for your trip is %.2f$!", price);
	}
}