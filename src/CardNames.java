import java.util.Scanner;

/**
 * created by Maxim Orlov on 23 Nov 2014
 */

public class CardNames {
	public static void main(String[] args) {
		String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for (int i = 0; i < cases; i++) {
			int card_value = sc.nextInt();
			int suit_value = (int) Math.floor(card_value / 13);
			int rank_value = card_value % 13;
			String suit = suits[suit_value];
			String rank = ranks[rank_value];
			
			System.out.print(rank + "-of-" + suit + " ");
		}
		
		sc.close();
	}
}
