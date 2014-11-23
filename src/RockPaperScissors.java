import java.util.Scanner;

/**
 * created by Maxim Orlov on 23 Nov 2014
 */

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < cases; i++) {
			String play = sc.nextLine();
			String[] playArray = play.split(" ");
			int score1 = 0;
			int score2 = 0;
			
			for (int j = 0; j < playArray.length; j++) {
				if (playArray[j].charAt(0) == 'R' && playArray[j].charAt(1) == 'S'
						|| playArray[j].charAt(0) == 'S' && playArray[j].charAt(1) == 'P'
						|| playArray[j].charAt(0) == 'P' && playArray[j].charAt(1) == 'R') {
					score1++;
				} else if (playArray[j].charAt(1) == 'R' && playArray[j].charAt(0) == 'S'
						|| playArray[j].charAt(1) == 'S' && playArray[j].charAt(0) == 'P'
						|| playArray[j].charAt(1) == 'P' && playArray[j].charAt(0) == 'R') {
					score2++;
				}
			}
			
			if (score1 > score2) {
				System.out.print(1 + " ");
			} else {
				System.out.print(2 + " ");
			}
		}
		
		sc.close();
	}
}
