/**
 * @ Nikunj Gupta This program creates the Seat class and getter methods that will be used in the
 * shopping cart class to update the cart.
 */

import java.util.ArrayList;

public class Seat {
	private int row;
	private int seatNumber;
	private String seatType;

	public Seat(int row, int seatNumber) {
		this.row = row;
		this.seatNumber = seatNumber;

		if (this.row >= 2 && this.row <= 6 && this.seatNumber >= 3 && this.seatNumber <= 23) {
			seatType = "P";
		} else {
			seatType = "R";
		}
	}
	
	public boolean equals(Object obj) {
		Seat seat = (Seat) obj;
		return (this.row == seat.row && this.seatNumber == seat.seatNumber);
	}

	public int getRow() {
		return row;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public String getSeatType() {
		return seatType;
	}

	public double getPrice() {
		if (seatType.equals("P")) {
			return 14.50;
		}
		return 10.00;
	}
}
