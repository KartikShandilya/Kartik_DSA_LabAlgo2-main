import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		System.out.println("Enter the size of transaction Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int trans[] = new int[size];

		System.out.println("Enter the values of Array");

		for (int i=0;i<size;i++) {

			trans[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int testcases = sc.nextInt(); 
		int targetAmt;
		int sum,j;

		for (int i=0;i<testcases;i++) {

			System.out.println("Enter the value of target");
			targetAmt = sc.nextInt();
			sum=0;

			for (j=0;j<trans.length;j++) {
				sum = sum + trans[j];

				if (sum>=targetAmt) {
					System.out.println("Target achieved after"+" " + (j+1) +" " +"transactions");
					break;
				}
			}

			if (j==trans.length) {
				System.out.println("Given target is not achieved");
			}

		}

	}

}
