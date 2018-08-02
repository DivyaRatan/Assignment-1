import java.util.Scanner;

public class Duplicate {
	public static void main(String args[]) {
		int i, j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();// Taking string as input

		char[] name = string.toCharArray();// converting string to character array
		for (i = 0; i < name.length; i++) {// loop for replacing duplicate by space
			char a = name[i];
			for (j = i + 1; j < name.length; j++) {
				if (a == name[j]) {
					name[j] = ' ';
				}
			}
		}
		String string1 = new String(name);
		string = string1.replaceAll(" ", "");// removing space
		System.out.println("Output: " + string);
	}
}
