import java.util.Scanner;

public class Occurence {
	public static void main(String args[]) {
		int i;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of names");
		int n = scanner.nextInt();// Taking the number of name as input

		String string[] = new String[n + 1];
		int count = 0;
		System.out.println("Enter the names");
		for (i = 0; i < n + 1; i++) {
			string[i] = scanner.nextLine();// Taking the names in an array
		}

		System.out.println("Enter the name to be searched");
		String name = scanner.nextLine();

		for (i = 0; i <= n; i++) {// Loop for searching the name
			if (string[i].equals(name)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
