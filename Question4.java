import java.util.*;

public class Question4{
	public static void main(String [] args){
		Scanner keyinput = new Scanner(System.in);
	
		System.out.println("\n ~ Please insert a URL ~");
		String uRL = keyinput.nextLine();
		
		/* This is the coding that removes all white spaces in between URLs.
		This code replaces all empty spaces with nothing; removing the empty trails
		and sticking all the characters together. */
		uRL = uRL.replaceAll("\\s", "");
		System.out.println();
		System.out.println(" Your URL: " + uRL);

		// Verification of the length of the URL with the length() method + output.
		int len = uRL.length();
		System.out.println("\n Veryfying an URL with " + len + " characters...");

		/* The following is an if statement. If the inputed URL has "https://" in it's
		nature, the program would output that it is a valid and secure network. Otherwise,
		it would claim to URL to not being valid and secure  */
		if (uRL.contains("https://")) {
    	System.out.println(" Is this a valid and secure URL? [TRUE]. ");
		}

		else {
    		System.out.println(" Is this a valid and secure URL? [FALSE]. ");
		}

	}

}