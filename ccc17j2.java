import java.util.Scanner;

public class ccc17j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int X = N;
		for (int i = 0; i<T;i++) {
		N=N*10;
		X = X+N;		
		}
		System.out.println(X);
	}

}
