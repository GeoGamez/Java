import java.util.Scanner;

public class ccc20j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int N = sc.nextInt();
		int R = sc.nextInt();
		int T = N;
		for(int i =0;i<P;i++) {
			N= N*R;
			T= T+N;
			if (T>P) {
				System.out.println(i+1);
				return;
			}
		}
	}

}
