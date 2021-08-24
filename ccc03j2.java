import java.util.Scanner;

public class ccc03j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = 0;
		int L= 0;
		int P=0;
		int T = 0;
		while (true) {
			int C = sc.nextInt();
			if (C >0) {
			L =  (int) Math.round((Math.sqrt(C)));
			if (C%L != 0) {
			for ( int i = L; i<= C ; i++) {
				if (C%i == 0) {
					L=i;
					break;
				}
			}
			}
			W = C/L;
			P = (2*W)+(2*L);
			if (W >= L) {
				System.out.println("Minimum perimeter is "+P+" with dimensions "+L+" x "+W);
			}else {
				System.out.println("Minimum perimeter is "+P+" with dimensions "+W+" x "+L);
			}
			}else {			
				break;
		}
		}
	}

}
