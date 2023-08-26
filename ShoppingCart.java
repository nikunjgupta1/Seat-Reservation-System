/**
 * @ Nikunj Gupta This program creates several methods that will be used in the
 * main tester program to update the shopping cart.
 */

import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<Seat> seats;

	public ShoppingCart() {
		seats = new ArrayList<Seat>();
	}

	public void display(String[][] string) {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 25; j++) {
				System.out.print(string[i][j]);
			}
			System.out.println();
		}
		System.out.println("Legend: .=empty seat, *=empty premium seat, R=reserved seat, P=reserved premium seat");

	}

	public void add(int row, int seat) {
		if (seats.contains(new Seat(row, seat))) {
			System.out.println("This seat alreadys exist in your cart.");
		}
		else {
			seats.add(new Seat(row, seat));
		}
	}

	public void remove(int row, int seat) {
		if (!seats.remove(new Seat(row, seat))) {
			System.out.println("This seat does not exist in your cart.");
		}
	}

	public void clear() {
		seats.clear();
	}

	public void display() {
		double total = 0.0;
		for (Seat seat : seats) {
			System.out.println("Row " + seat.getRow() + " Seat: " + seat.getSeatNumber() + " $" + seat.getPrice());
			total += seat.getPrice();
		}
		System.out.println("Total: $" + total);
	}

}
