import java.util.Scanner;

public class ccc01j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int X = -(H*2-2);
		int Y= 1;
		int HAF= Math.round(H/2);
		for ( int l = 0; l<=HAF;l++ ) {
		for (int j = 0; j<Y;j++) {
			System.out.print("*");	
		}
		for (int i = 0; i>X;i-=1) {
			System.out.print(" ");
		
		}
		for (int k = 0; k<Y;k++) {
			System.out.print("*");
		}
		Y = Y+ 2;
		X = X+4;
		System.out.println();
		}
		Y = Y-4;
	    X = X-8;
		for ( int l = 0; l<HAF;l++ ) {
		for (int j = 0; j<Y;j++) {
			System.out.print("*");	
			
		}
		for (int i = 0; i>X;i-=1) {
			System.out.print(" ");
		
		}
		for (int k = 0; k<Y;k++) {
			System.out.print("*");
		}
		Y = Y- 2;
		X = X-4;
		System.out.println();
		}
	}

}
