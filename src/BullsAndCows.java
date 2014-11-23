import java.util.ArrayList;
import java.util.Scanner;

/**
 * created by Maxim Orlov on 23 Nov 2014
 */

public class BullsAndCows {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		int cases = in.nextInt();
		ArrayList<Integer> valueArray = new ArrayList<Integer>();
		int valueTemp = value;

		// Store all 4 digits in an arraylist in their order
		while (valueArray.size() != 4) {
			valueArray.add(0, valueTemp % 10);
			valueTemp /= 10;
		}

		for (int i = 0; i < cases; i++) {
			int guess = in.nextInt();
			ArrayList<Integer> guessArray = new ArrayList<Integer>();
			int guessTemp = guess;

			// Do the same for the guess value
			while (guessArray.size() != 4) {
				guessArray.add(0, guessTemp % 10);
				guessTemp /= 10;
			}

			int countX = 0;
			int countY = 0;

			for (int j = 0; j < guessArray.size(); j++) {
				if (guessArray.get(j) == valueArray.get(j)) {
					countX++;
				}

				if (valueArray.contains(guessArray.get(j))) {
					countY++;
				}
			}

			countY -= countX;

			System.out.print(countX + "-" + countY + " ");
		}

		in.close();
	}
}
