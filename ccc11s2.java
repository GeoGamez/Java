import java.util.Scanner;

public class ccc11s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		 int [] answers = new int [2*N];
		 int [] answered = new int [2*N];
				int points = 0;
				for (int i = 0; i<N;i++) {
				 answers[i] = sc.nextInt();
				}
				for (int i = 0; i<N;i++) {
					 answered[i] = sc.nextInt();
				}
				for (int i = 0; i<N;i++) {
				  if (answers[i] == answered[i]) {
				    points += 1;
				}
				}
				System.out.println(points);
	}

}
