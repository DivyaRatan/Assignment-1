
import java.util.Scanner;

public class Palin {
	public static void main(String args[]) {
		int j, i;
		int count[] = new int[10];
		Scanner sc = new Scanner(System.in);
		String string[] = new String[10];
		System.out.println("Enter ten input");
		for (i = 0; i < 10; i++) {
			string[i] = sc.nextLine();// Taking String as input in array
		}
		String reverse = " ";
		for (i = 0; i < 10; i++) {
			for (j = string[i].length() - 1; j >= 0; j--) {// Loop for checking Palindrome
				reverse = reverse + string[i].charAt(j);
			}
			if (string[i] == reverse) {
				System.out.println(string[i] + "is Palindrome");
				count[i] = string[i].length() - 1;// Counting the length of Name
				System.out.println("Length of string is" + count);
			}
		}
		for (i = 0; i < 9; i++) {// Replacing the spaces
			int compare = string[i].compareTo(string[i + 1]);
			if (compare < 0) {
				String temp = string[i];
				string[i] = string[i + 1];
				string[i + 1] = temp;

			}
		}
		System.out.println(string);
	}
}