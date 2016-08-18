package stackTestingLab;

import java.util.Scanner;
import java.util.Stack;

public class stackTestingLab {

	public static void main(String[] args) {

		int i;
		int x = 0;
		int y = 0;
		int z = 0;
		String userInputCalc = " ";
		Scanner scan1 = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		String choice = "yes";

		System.out.println("Let me solve a problem for you!");

		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Please enter in a problem you wish to solve: ");
			userInputCalc = scan1.nextLine();

			for (i = 0; i < userInputCalc.length(); i++) {
				char value = userInputCalc.charAt(i);

				if (value >= '0' && value <= '9') {

					int item = Character.getNumericValue(value);
					// System.out.println(item);
					s.push(item);
				}

				else {
					switch (value) {
					case '*':
					case '/':
					case '-':
					case '+':
						x = s.pop();
						y = s.pop();

						if (value == '*') {
							z = x * y;
						} else if (value == '/') {
							z =  y/x ;
						} else if (value == '-') {
							z = y - x;
						} else {
							z = x + y;
						}

						s.push(z);
						break;
					// System.out.println(z);

					}

				}

			}
			System.out.println(s.pop());

			// System.out.println(s.pop());
			// System.out.println(userInputCalc);
			System.out.println("Would you like to enter another numbers?");
			choice = scan1.nextLine();

		}
		System.out.println("Goodbye");

	}
}