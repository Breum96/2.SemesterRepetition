package toDimensionalArray.opgave2Teater;

public class TheaterFloor {

	private boolean ticket = false;
	int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	int række = 9;
	String[] rækker = { "Række 1 |", "Række 2 |", "Række 3 |", "Række 4 |", "Række 5 |", "Række 6 |", "Række 7 |",
			"Række 8 |", "Række 9 |" };

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og prisen på pladsen
	 * returneres. Der returneres 0 hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public int buySeat(int row, int seat) {
		int række = row - 1;
		int sæde = row - 1;
		int price = 0;
		if (seats[række][sæde] != 0) {
			price = seats[række][sæde];
			seats[række][sæde] = 0;
			System.out.println("plads på række: " + row + " sæde: " + seat + " er nu reseveret");

		} else {
			System.out.println("Pladsen er allerede reserveret");
		}
		return price;
	}

	/**
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * prisen returneres. Der returneres 0, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */
	public int buySeat(int price) {

		while (ticket == false) {
			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < seats[i].length; j++) {
					if (seats[i][j] <= price && seats[i][j] != 0) {
						seats[i][j] = 0;
						ticket = true;

					}
				}
			}
		}

		return price;

	}

	public void printTheaterFloor() {

		System.out.println("Sæde :     1  2  3  4  5  6  7  8  9  10 ");
		System.out.println("         ______________________________");

		for (int i = 0; i < række; i++) {
			System.out.printf("%5s", rækker[i]);

			for (int j = 0; j < seats[i].length; j++) {
				System.out.printf("%3d", seats[i][j]);
			}
			System.out.println();
		}

//		for(int i = 0; i < seats.length; i++) {
//			for(int j = 0; j < seats[i].length; j++) {
//				System.out.print(seats[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
