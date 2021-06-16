import java.util.Scanner; // Program uses Scanner

public class Calculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please input the first number");

		int a = input.nextInt();
		System.out.println("Please input the second number");
		int b = input.nextInt();

		int c = (a + b);
		int d = (a - b);
		int e = (a / b);
		int f = (a * b);
		int average = (c / 2);
		int remainder = (a % b);

		int notA = b;
		int notB = a;

		int c1 = (notA + notB);
		int d1 = (notA - notB);
		int e1 = (notA / notB);
		int f1 = (notA * notB);
		int average1 = (c1 / 2);
		int remainder1 = (notA % notB);

		System.out.print("\n Sum:" + c + "\n Difference:" + d + "\n Division:" + e + "\n Multiplication:" + f
				+ "\n Average:" + average + "\n Modulo: " + remainder);

		System.out.print("\n Would you like to see the inverse of those opertions?\n\n 1 = Yes, 2 = No");
		int answer = input.nextInt();

		if (answer == 1) {
			System.out.print("\n Sum:" + c1 + "\n Difference:" + d1 + "\n Division:" + e1 + "\n Multiplication:" + f1
					+ "\n Average:" + average1 + "\n Modulo: " + remainder1);
		}
		input.close();

	}
}
