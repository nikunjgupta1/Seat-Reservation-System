/**
 * @ Nikunj Gupta This program asks the user for their action in a loop to create an accurate
 * shopping cart.
 */

import java.util.Scanner;

public class Test {
	public static String command;
	public static int row;
	public static int column;

	public static void main(String[] args) {
		ConcertHall hall = new ConcertHall();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 25; j++) {
				if (i > 0 && i < 6 && j > 1 && j < 23) {
					hall.array[i][j] = "*";
				} else {
					hall.array[i][j] = ".";
				}
			}
		}
		ShoppingCart cart = new ShoppingCart();
		Scanner in = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		command = "";
		cart.display(hall.array);
		while (!command.equals("quit")) {
			System.out.println("Enter Shopping Cart operation: (add, remove, clear, display, quit):");
			command = in.nextLine();
			// act on a command using appropriate methods from the concert hall class
			if (command.equals("add")) {
				System.out.println("What row would you like to reserve: ");
				row = input.nextInt();
				System.out.println("What seat would you like to reserve: ");
				column = input.nextInt();
				cart.add(row, column);
			}

			if (command.equals("remove")) {
				System.out.println("What row would you like to remove: ");
				row = input.nextInt();
				System.out.println("What seat would you like to remove: ");
				column = input.nextInt();
				cart.remove(row, column);
			}

			if (command.equals("display")) {
				cart.display();
			}
			
			if (command.equals("clear")) {
				cart.clear();
			}
		}
	}

}
