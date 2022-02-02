public class BankingObjectStyle {

	public static void main(String[] args) {
		
		//local variable
		double difference = 0.0;
		
		//creates new banks using default constructor
		BankCD bank1CD = new BankCD();
		BankCD bank2CD = new BankCD();
		
		//using mutator methods to assign the bank values
		bank1CD.setBankName("Bank A");
		bank1CD.setInitialDeposit(5000);
		bank1CD.setNumberOfYears(3);
		bank1CD.setRate(0.04);
		
		bank2CD.setBankName("Bank B");
		bank2CD.setInitialDeposit(5000);
		bank2CD.setNumberOfYears(4);
		bank2CD.setRate(0.03);
		
		//calling the printCDDetails method to print the first two lines of output
		//by calling printCDDetails I am also invoking the getFinalValue method (inside printCDDetails)
		bank1CD.printCDDetails();
		bank2CD.printCDDetails();
		
		
		//if bankA's final value is better it will print Bank A exceeds Bank B, if bank B is greater it will print bank B exceeds bank A
		if (bank1CD.finalValue > bank2CD.finalValue) {
			difference = (bank1CD.finalValue - bank2CD.finalValue);
			System.out.printf ("Bank A's CD exceeds Bank B by $%1.2f", difference);
		}
			
		else if (bank2CD.finalValue > bank1CD.finalValue) {
			difference = (bank2CD.finalValue - bank1CD.finalValue);
			System.out.printf ("Bank B's CD exceeds Bank A's by $%1.2f", difference);
		}
		else {
			System.out.println ("Bank A's CD is the same as Bank B's CD. Pick either bank.");
	
		}
		
		
	}

}

