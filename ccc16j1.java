import java.util.Scanner;

public class ccc16j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String G1 = sc.next();
		String G2 = sc.next();
		String G3 = sc.next();
		String G4 = sc.next();
		String G5 = sc.next();
		String G6 = sc.next();
		int A = 0;
				if (G1.equals("W")) {
					A  =A + 1;
				}if (G2.equals("W")) {
					A = A+ 1;			
				}
				if (G3.equals("W")) {
					A = A+ 1;			
				}
				if (G4.equals("W")) {
					A = A+ 1;
				}
				if (G5.equals("W")) {
					A = A+ 1;
				}
				if (G6.equals("W")) {
					A = A+ 1;
				}
				if (A > 4) {
					System.out.println(1);
				} else if ( A > 2 && A <5) {
					System.out.println(2);
				}else if ( A > 0 && A<3) {
					System.out.println(3);
				} else {
					System.out.println(-1);
				}
				

	}

}
