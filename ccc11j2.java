import java.util.Scanner;
import java. lang. Math;
public class ccc11j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int M = sc.nextInt();
		for (int i = 1; i <=M; i++) {
			double i4 =Math.pow(i,4);
			double i3 =Math.pow(i, 3);
			double i2 =Math.pow(i, 2);
			double a=  (-6*i4) + (h*i3) + (2*i2) + i;
		if (a<= 0) {
			System.out.println("The balloon first touches ground at hour:");
			System.out.println( i );
			return;
		}
		}
		System.out.println("The balloon does not touch ground in the given time.");
		
	}

}
