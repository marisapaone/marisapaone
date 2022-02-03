/**
 * TeamTest.java (Assignment 3, Part 2)
 * @Marisa Paone
 */

package cs520.hw3.part2;

import java.io.File;

import java.util.Scanner;


public class TeamTest {

	public static double createPlayer(String number, String name, String position, String year) {
		
		//converts number to an int
		int numb = Integer.parseInt(number);
		
		//instantiates player as a variable and passing the name value
		Player player = new Player(name);
		
		//sets the number, position and year to player with mutator methods
		player.setNumber(numb);
		player.setPosition(position);
		player.setYear(year);
		
		//calling on the toString method that prints out the line with number, name, position and year 
		player.toString();
		
		//calls the players instance computeScoringAverage method and prints the scoring average after the players info prints
		double scoringAverage = player.computeScoringAverage();
		
		//returns scoringAverage so I can access this in my while loop when I add the totals up
		return scoringAverage;
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = null;
		double totalScoringAverage = 0;
		
		//reading file
		try {
			File file = new File ("team.txt");
			scanner = new Scanner (file);
		
			//reads five lines from team.txt and passes the first four of five strings to createPlayer()
			while (scanner.hasNextLine()) {
			 
				String number = scanner.nextLine();
				String name = scanner.nextLine();
				String position = scanner.nextLine();
				String year = scanner.nextLine();
				double score;
				//fetches the return value of createPlayer
				score = createPlayer(number, name, position, year);
				
				//adds the score of each player to the total
				totalScoringAverage += score;
				scanner.nextLine();
				System.out.println ();		
			}
			
		} catch (Exception e){
			//catches the exceptions if file isnt found
			e.printStackTrace();
			System.out.print("something went terribly wrong");
		
		} finally {
			//test System.out.println (totalScoringAverage);
			//divides the average score by 10 so that it actually is an average
			System.out.println("Average Score: " + (totalScoringAverage/10)); 
			
			//closes scanner
			if (scanner != null) {
				scanner.close();		
			}
		}
}
	
}
