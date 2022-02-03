/**
 * StringTest.java 
 * @MarisaPaone
 */


import java.util.Scanner;


public class StringTest {
	public static void main(String[] args) {
	try {
		//asks for users input
		System.out.print("Please enter your name,age,city: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.trim();
		//removes any spaces the user might have entered
		
		//finds the first position of the ,
		int index1 = input.indexOf(',');
		
		//extracting name
		String name = input.substring(0,index1);
		System.out.print("Name: " + name); 
		System.out.println(" (length: " + name.length()+ ")");
		
		//finds the second position of the ,
		int index2 = input.indexOf(',', index1 + 1);
		
		//extracting age
		String ageString = input.substring(index1+1,index2);
		ageString = ageString.trim();
		
		//converts age from string to int
		int age = Integer.parseInt(ageString);
		System.out.println ("Age: " + ageString);
		System.out.println ("Age in 10 years: " + (age+10));
		
		//extracting city
		String city = input.substring(index2 + 1);
		city = city.trim();
	
		System.out.print("City: " + city); 
		System.out.println(" (length: " + city.length()+ ")");
		scanner.close(); 
	}
	catch (Exception e) {
		e.printStackTrace();
		System.out.println("ERROR: You did not enter your name, age, and city correctly!");
	}

	}
}
