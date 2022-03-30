package toDimensionalArray.opgave2Teater;

import java.util.Scanner;

public class TheaterFloorApp {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TheaterFloor theater = new TheaterFloor();
		
		System.out.println("Hvilken række vil du sidde på? 1-9 ");
		int row = scan.nextInt() -1;
		System.out.println("Hvilken plads? 1-10 ");
		int seat = scan.nextInt() -1;
		if(theater.seats[row][seat] != 0) {
			System.out.println("Pladsen er nu reserveret til dig");
			System.out.println("Prisen for pladsen er: " + theater.seats[row][seat]);
			theater.seats[row][seat] = 0;
		}else {
			System.out.println("Pladsen er allerede reserveret");
		}
//		for(int i = 0; i < theater.seats.length; i++) {
//			for(int j = 0; j < theater.seats[i].length; j++) {
//				
//			}
//		}
		
		
		theater.printTheaterFloor();
		
//		theater.buySeat(2, 2);
//		theater.buySeat(10);
		
//		theater.printTheaterFloor();
		
	}
}
