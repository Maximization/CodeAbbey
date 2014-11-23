import java.util.Scanner;

/**
 * created by Maxim Orlov on 23 Nov 2014
 */

public class BinarySearch {
	public static double function(double a, double b, double c, double d, double x) {
		return a * x + b * Math.sqrt(Math.pow(x, 3)) - c * Math.exp(-x / 50) - d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double lower = 0;
			double upper = 100;
			double x = (upper + lower) / 2;

			while (upper - lower > 1e-7) {
				double result = function(a, b, c, d, x);
				
				if (result > 0) {
					upper = x;
				} else {
					lower = x;
				}
				
				x = (lower + upper) / 2;
			}
			
			System.out.printf("%.7f ", x);
		}

		sc.close();
	}
}
