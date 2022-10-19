
import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");

		int size = sc.nextInt();
		int currency[] = new int[size];
		System.out.println("Enter the currency denominations value");

		for(int i=0;i<size;i++) {

			currency[i] = sc.nextInt();
		}

		BubbleSort bs = new BubbleSort();
		bs.sort(currency);

		System.out.println("Enter the amount you want to pay");
		int amt = sc.nextInt();

		CountNotes cn = new CountNotes();
		cn.counting(currency,amt);

	}

}
