import java.util.Scanner;

public class ccc19J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for (int i = 0; i <X;i++) {	
			int Y = sc.nextInt();
			String Z = sc.next();
			for(int j = 0; j< Y ;j++) {
				System.out.print(Z);
			}
			System.out.println();

		}
	}

}
