/**
 * created by Maxim Orlov on 20 Nov 2014
 */
import java.util.*;

public class SumsInLoop {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	
	int n = in.nextInt();
	
	for (int i = 0; i < n; i++) {
	  int a = in.nextInt();
	  int b = in.nextInt();
	  System.out.print(a + b + " ");
	}
	
	in.close();
  }
}