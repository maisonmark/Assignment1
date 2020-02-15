import java.util.*;

public class Question3 {
	public static void main(String [] args){
		Scanner keyinput = new Scanner(System.in);

	// (num) and (sum) are the two intergers used for the digit calculation.
	System.out.println("\n ~ Please enter 3 digits you would like to calculate ~ ");
	int num = keyinput.nextInt();
	int sum = 0;

	// This is the loop that calculates each digit, with the help of the % remainder.
	while(num > 0){
		sum = sum + num % 10;
		num = num / 10;
	}
		System.out.println("\nThe sum of your three digits is = " + sum);

	}
}