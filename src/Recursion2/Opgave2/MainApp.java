package Recursion2.Opgave2;

public class MainApp {

	public static void main(String[] args) {

		String string = "anna";
		char[] pal = new char[10];

		for (int i = 0; i < string.length(); i++) {
			pal[i] = string.charAt(i);
		}
		System.out.println(palindrom(pal, 0, 3));

	}
	
	public static boolean palindrom(char[] tekst, int left, int right) {
		if (right - left <= 1) {
			return true;
		}
		else if (tekst[left] != tekst[right]) {
			return false;
		}
		return palindrom(tekst, left + 1, right - 1);
	}

}
