import java.util.Scanner;

public class ccc18j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if ((A == 8 || A == 9) && B == C && (D == 8 || D == 9)) {
			System.out.println("ignore");
		}else {
			System.out.println("answer");
		}
		
	}

}
