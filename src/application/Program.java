package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
		} catch (InputMismatchException b) {
			System.out.println("Input Error");
		}
		System.out.println("End Of Program");
		sc.close();
	}

}
