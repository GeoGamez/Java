import java.util.Scanner;

public class ccc13j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D1 = sc.nextInt();
		int D2 = sc.nextInt();
		int D3 = 0;
		if (D2 > D1) {
			D3 = D2 - D1;
			System.out.println(D3 + D2);
		}else if (D1 > D2) {
			D3 = D1 - D2;
			System.out.println( D3 + D2);
				
			}else {
				System.out.println( D2);
			}
		
		}
	}


