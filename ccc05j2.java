import java.util.Scanner;

public class ccc05j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = 0;
		int D = 0;
		double E = 0;
		for (double j = A; j <= B; j++ ) {
			for ( double i = 1; i<=j;i++) {
				E = j/i;
		if ( E%1  == 0 ) {
			C = C + 1;
		}
		}
			if (C== 4) {
				D = D +1;
				C = 0;
			}else {
				C = 0;
			}
		}
		System.out.println("The number of RSA numbers between "+A +" and " +B + " is " +D);
	}

}
