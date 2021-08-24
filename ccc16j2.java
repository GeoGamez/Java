import java.util.Scanner;

public class ccc16j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  A1 =sc.nextInt();
		int  A2 =sc.nextInt();
		int A3 =sc.nextInt();
		int A4 =sc.nextInt();
		int A5 =sc.nextInt();
		int A6 =sc.nextInt();
		int A7 =sc.nextInt();
		int A8 =sc.nextInt();
		int A9 =sc.nextInt();
		int A10 =sc.nextInt();
		int A11=sc.nextInt();
		int A12=sc.nextInt();
		int A13=sc.nextInt();
		int A14=sc.nextInt();
		int A15=sc.nextInt();
		int A16 =sc.nextInt();
		
		if (A1+A2+A3+A4 ==A5+ A6 + A7+A8  && A5+ A6 + A7+A8 == A9+ A10 + A11+A12&& A9+ A10 + A11+A12 ==  A13+ A14 + A15+A16&& A13+ A14 + A15+A16 ==  A1+ A2 + A3+A4) {
			System.out.println("magic");
		}else {
			System.out.println("not magic");
		}
	}

}
