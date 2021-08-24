import java.util.Scanner;

public class ccc20j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		int X = 0;
		int Y = 0;
		X = M *2;
		Y = L * 3;
		if ( X + Y + S >= 10) {
			System.out.println("happy");
			
		}else {
			System.out.println("sad");
		}
	}

}
