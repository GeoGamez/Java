import java.util.Scanner;

public class ccc03j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int S = sc.nextInt();
		int H = sc.nextInt();
		for(int k = 0; k <T;k++) {
			for (int i = 0; i<2;i++) {
				System.out.print("*");
				for (int j = 0; j <S; j++) {
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println();	
		}
		for (int i = 0; i< (3+S*2); i++){
			System.out.print("*");
		}
		System.out.println();	
		for (int i = 0;i<H;i++) {
			for(int j = 0; j < S+1; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
