import java.util.Scanner;

public class Missing {
	public static void main(String args[]) {
		int i, Totalsum, missingnumber, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of number");
		int n = sc.nextInt();// Taking the amount of number as input
		int array[] = new int[n];
		System.out.print("Enter the numbers to be entered");
		for (i = 0; i < n - 1; i++) {
			array[i] = sc.nextInt();// Storing the elements in array
		}
		for (i = 0; i < n - 1; i++) {
			sum = sum + array[i]; // adding the number given
		}
		Totalsum = (n) * (n - 1) / 2;
		missingnumber = Totalsum - sum;// Finding the missing number
		System.out.println(missingnumber + " is the missing number");

	}

}
