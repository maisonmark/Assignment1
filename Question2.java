import java.util.*;

public class Question2{
	public static void main(String [] args){
		Scanner keyinput = new Scanner(System.in);

	// Simple instruction given to the user
	System.out.println("\n~~~~~~~~~ Please enter the price of the item ~~~~~~~~~");
	double price = keyinput.nextDouble();

	/* Since we are using Quebec taxes, TPS = 5%, and TVQ 14.75%. Each are separated,
	then calculated altogether in the total cost calculation process. Had it been in a 
	different province, the tax percentage would change.*/
	double tPS = 0.05 * price;
	double tVQ = 0.0975 * price;
	double totalcost = price + (tPS + tVQ);

	/* Prints out the total of TPS, TVQ, and total cost of the item.
	Just as the previous program, we have to used the printf() method in order
	to set the decimal numbers to 2; which is why I have used %.2f inside the quotations. */
	System.out.printf("\n - TPS = %.2f$", + tPS);	
	System.out.printf("\n - TVQ = %.2f$", + tVQ);
	System.out.printf("\n - TOTAL = %.2f$", + totalcost);

	}
}