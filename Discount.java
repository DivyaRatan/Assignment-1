import java.util.*;

public class Discount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int itemPrice = sc.nextInt();// Taking the input
		int discount = (itemPrice * 35) / 100;// Calculation for discount
		int newItemPrice = itemPrice - discount;// Calculation for price
		System.out.println("Price after discount is" + newItemPrice);
	}
}