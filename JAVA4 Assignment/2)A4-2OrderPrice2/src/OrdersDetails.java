

import java.util.Scanner;
import java.util.function.Consumer;

public class OrdersDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order the value :");
		Integer ace= sc.nextInt();
		//int ace = 1000;
		
		Consumer<Integer> action = b-> {
			if (ace>1000) {
				System.out.println("Accepted the number"+ace);}
			else
				{System.out.println("Rejected the number" +ace);}
				
		};
	action.accept(ace);
	}
}