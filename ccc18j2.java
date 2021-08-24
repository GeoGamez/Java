import java.util.Scanner;

public class ccc18j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		String YP =sc.next();
		String TP = sc.next();
		int A = 0;
		for (int C = 0; C < P; C++ ) {
		if (YP.charAt(C) == 'C' && YP.charAt(C) == TP.charAt(C)) {
			A = A + 1;
		}
		}
		System.out.println(A);
	}
		
}
