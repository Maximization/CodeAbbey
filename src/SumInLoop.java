/**
 * created by Maxim Orlov on 20 Nov 2014
 */
import java.util.*;

public class SumInLoop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int value = in.nextInt();
			sum = sum + value;
		}

		System.out.println(sum);
		
		in.close();
	}
}