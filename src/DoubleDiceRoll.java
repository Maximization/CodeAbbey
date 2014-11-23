import java.util.Scanner;

/**
 * created by Maxim Orlov on 22 Nov 2014
 */

public class DoubleDiceRoll {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int n = 6;

		for (int i = 0; i < cases; i++) {
			int throw1 = in.nextInt();
			int throw2 = in.nextInt();

			throw1 = throw1 % n + 1;
			throw2 = throw2 % n + 1;

			System.out.print(throw1 + throw2 + " ");
		}

		in.close();
	}
}
