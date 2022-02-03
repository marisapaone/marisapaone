import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {

		//Declaring variables
		
		String input;
		int total = 0;
		
		//making a scanner called looping to have the user input numbers
		
		Scanner looping = new Scanner(System.in);
		
		//This for loop will run three times, the forth time the condition will not be true so the loop will end.
		
		for (int number = 1; number < 4; number++)
		{
			System.out.print("Please enter a value #" + number + ": ");
			input = looping.nextLine();
			
			//Converting the string input to an int
			
			int inputNumber = Integer.parseInt(input);
			
			//Adding the users input to the total. This will add the new inputs three times
			
			total = total + inputNumber;
			
		}
		
		System.out.println("Total: " + total);
		
		//If statements to print final line telling the user what category their total falls in.
		
		if (total < 100)
			System.out.println ("It is under 100.");
	
		else if (total >= 100 && total <= 200)
			System.out.println ("It is between 100 and 200.");
		
		else
			System.out.println ("It is above 200.");

	}

}
© 2022 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
