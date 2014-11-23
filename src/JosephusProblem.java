import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * created by Maxim Orlov on 23 Nov 2014
 */

public class JosephusProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> people = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			people.add(i + 1);
		}
		
		int position = k - 1;
		
		while (people.size() > 1) {
			if (position < people.size()) {
				people.set(position, 0);
				position += k;
			} else {
				position -= people.size();
				people.removeAll(Arrays.asList(0));
			}
		}
		
		System.out.println(people.get(0));
		
		sc.close();
	}
}
