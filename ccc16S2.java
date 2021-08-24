import java.util.Scanner;
import java.util.Arrays;
public class ccc16S2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		boolean type = (y == 2);
		int n = sc.nextInt();
		int [] DMOJ = new int [n];
		int [] PEG = new int [n];

		for(int i = 0; i < n; i++){
			DMOJ[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			PEG[i] = sc.nextInt();
		}
		Arrays.sort(PEG);
		Arrays.sort(DMOJ);

		int total = 0;

		if(type){
			for(int i = 0; i < n; i++){
				total += Math.max(DMOJ[n - i - 1], PEG[i]);

			}
		}else{
			for(int i = 0; i < n; i++){
				total += Math.max(DMOJ[n - i - 1], PEG[n - i - 1]);
			}
		}
		System.out.println(total);
	}

}
