import java.util.Scanner;

public class ccc01j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int M = sc.nextInt();
		int N = 0;
		for (int i = 0; i < M;i++) {
			if((i*X)%M==1){
				System.out.println(i);
				return;
			}
		}
		System.out.println("No such integer exists.");
	}
}
