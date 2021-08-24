import java.util.Scanner;

public class ccc09j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TT = sc.nextInt();
		int PE = sc.nextInt();
		int PL = sc.nextInt();
		int T = sc.nextInt();
		int Counter = 0;
		int trout = 0;
		int pike =0;
		int pickerel=0;
		trout = T/TT;
		pike=T/PE;
		pickerel= T/PL;
		for (int i = 0; i<=trout ;i++) {
			for(int j =0;j<=pike;j++) {
				for(int k =0;k<=pickerel;k++) {
					if (i * TT + j *PE + k * PL <= T && i * TT + j *PE + k * PL !=0) {
		                Counter++;
		                System.out.println(i+" Brown Trout, "+j+" Northern Pike, "+k+" Yellow Pickerel");
					}
				}
			}
		}	
		System.out.println("Number of ways to catch fish: "+Counter);
	}

}
