import java.util.Scanner;

public class CoinMachine {

	public static void main(String[] args) {
		
		System.out.println ("Welcome to the Coin Machine!");
		
		//Making a scanner coinMachine to ask user for inputs
		
		Scanner coinMachine = new Scanner(System.in);
		
		//Asking user for coin inputs
		
		System.out.println ("Enter the number of pennies you have: ");
		String penniesInput = coinMachine.nextLine();
		System.out.println("Enter the number of nickels you have: ");
		String nickelsInput = coinMachine.nextLine();
		System.out.println("Enter the number of dimes you have: ");
		String dimesInput = coinMachine.nextLine();
		System.out.println("Enter the number of quarters you have: ");
		String quartersInput = coinMachine.nextLine();
		
		System.out.println("You entered: "+ penniesInput + " pennies, " + nickelsInput + " nickels, " + dimesInput + " dimes, and " + quartersInput + " quarters.");
		
		//Converting input variables from string to double
		
		double pennies = Double.parseDouble(penniesInput);
		double nickels = Double.parseDouble(nickelsInput);
		double dimes = Double.parseDouble(dimesInput);
		double quarters = Double.parseDouble(quartersInput);
		
		//Adding up all the users quantity of coins
		
		double coins = pennies + nickels + dimes + quarters;
		
		//Multiplying the coins with their values and adding their values up
		//Initializing doubles for fee calculation
		
		double cents = (1*pennies)+(5*nickels)+(10*dimes)+(25*quarters);
		double dollars = cents/100;
		double fee = dollars*0.12;
		double cash = dollars - fee;
		
		System.out.printf("The total number of coins you deposited is %1.2f totaling $%1.2f. %n",coins, dollars);
		//System.out.printf("The dollar value of your coins is $%1.2f %n", dollars);
		System.out.printf("The processing fee will be $%1.2f %n", fee);
		System.out.printf("You will recieve $%1.2f in cash.%n", cash);
		
		
	}

}
