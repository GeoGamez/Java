import java.util.Scanner;

public class ccc07j3array {

	public static void main(String[] args) {
		int[] box = {100 , 500, 1000, 5000, 10000, 25000,50000, 100000, 500000, 1000000};
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double Money = 0;
		for (int i = 0 ; i<N; i++) {
			int BN = sc.nextInt()-1;
			box[BN]=0;
		}
		for ( int i = 0; i< box.length; i++) {
			Money +=box[i];
		}
		int offer = sc.nextInt();
		double A = Money/(10-N);
		if (offer>A) {
			System.out.println("deal");
		}else {
			System.out.println("no deal");
		}
	}

}
