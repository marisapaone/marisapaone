public class BankCD {

	//declaring instance variables
	private String bankName;
	private int initialDeposit;
	private double rate;
	private int numberOfYears;
	double finalValue;
	
	//accessor methods!
	public String getBankName() {
		return bankName;
	}
	public int getInitialDeposit() {
		return initialDeposit;
	}
	public double getRate() {
		return rate;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	//mutator methods!
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setInitialDeposit(int initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	
	//default (no arg) constructor
	public BankCD () {
		
	}
	//constructor that calls the mutator method for bankName
	public BankCD(String bankName) {
		
		this.setBankName(bankName);	
	}
	//this method getFinalValue performs the finalValue equation and then returns the finalValue and rounds it to two decimal spaces.
	public double getFinalValue() {
		finalValue = (initialDeposit * (java.lang.Math.pow((1 + rate),numberOfYears)));
		return Math.round(finalValue*100.0)/100.0;
		
	}
	//this method prints the details of the banks when called on and performs the getFinalValue method to do the math and prints it
	public void printCDDetails() {
		System.out.print(bankName + " " + numberOfYears + "-year CD of $" + initialDeposit + " at " + (rate*100) + "% rate is worth $");
		System.out.println(getFinalValue());
	}
	
}

