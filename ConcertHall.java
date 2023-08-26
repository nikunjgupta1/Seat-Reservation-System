/**
 * @ Nikunj Gupta This program creates the concert hall class that creates the array
 * of the seating chart for the theater and prints the introductory lines.
 */

public class ConcertHall {
	String[][] array;

	public ConcertHall() {
		System.out.println("Welcome to the concert hall reservation system");
		System.out.println("Rows are numbered 1-12 and columns are numbered 1-25.");
		System.out.println("     Seating Chart");
		
		array = new String[12][25];
	}
}


