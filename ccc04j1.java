import java.util.Scanner;

public class ccc04j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = T; i>0 ;i= i-1) {
		  int b = (int) Math.sqrt(i);
			if (b%1 == 0) {
				System.out.println("The largest square has side length "+b+".");
				return;
			}
			
		}

	}

}
