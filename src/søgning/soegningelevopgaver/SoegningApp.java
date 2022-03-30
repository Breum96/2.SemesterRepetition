package søgning.soegningelevopgaver;

import java.util.ArrayList;

public class SoegningApp {

	 
	
	public static void main(String[] args) {
		Soegning s = new Soegning();
		
		// Kode til afprøvning af opgave 1
		int[] talArray = {2,4,8,2};
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));
		talArray[2] = 15;
		System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));

		// opgave 2
		int[] talArray2 = {7,56,34,3,4,14,13,4};
		System.out.println("er der tal i intervallet 10-15: " + s.findInterval(talArray2));

		//opgave 3
		int[] talArray3 = {7,9,13,7,9,13};
		int[] talArray4 = {7,9,13,13,9,7};
		System.out.println("Er der 2 ens efter hinanden? " + s.findToEns(talArray3));
		System.out.println("Er der 2 ens efter hinanden? " + s.findToEns(talArray4));

		// opgave 5 lineær
		System.out.println(s.størsteHeltal(0));

		// opgave 5 binær
		System.out.println(s.størsteHeltal2(30));

		// opgave 6 find og byt
		ArrayList talList = new ArrayList();
		talList.add(6);
		talList.add(4);
		talList.add(8);
		talList.add(13);
		talList.add(2);
		System.out.println(s.find(talList, 2));
		System.out.println(talList);
	}

}
