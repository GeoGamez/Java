import java.util.Scanner;

public class ccc19j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D1 = sc.nextInt();
		int D2 = sc.nextInt();
		int D3 = sc.nextInt();
		int D4 = sc.nextInt();
		int D5 = sc.nextInt();
		int D6 = sc.nextInt();
		int D7 = 0;
		int D8 = 0;
		D1 = D1 * 3;
		D2 = D2 * 2;
		D4 = D4 * 3;
		D5 = D5 * 2;
		D7 = D1 + D2 + D3;
		D8 = D4 + D5 + D6;
		if (D7> D8) {
			System.out.println("A");
		}else if (D8 == D7) {
			System.out.println("T");
		}else {
			System.out.println("B");
		}
		}
	}

}
