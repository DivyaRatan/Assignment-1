import java.util.*;

public class Reverse {
	public static void main(String args[]) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();// Taking String as input
		String[] words = str.split(" "); // Spliting the String by word
		String reverse = "";
		System.out.println("Reversed Sentence is");
		for (i = 0; i < words.length; i++) {// Reversing the word
			for (j = words[i].length() - 1; j >= 0; j--) {
				reverse = reverse + words[i].charAt(j);

			}
			System.out.print(" " + reverse);
			reverse = " ";

		}
	}
}