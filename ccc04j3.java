import java.util.Scanner;

public class ccc04j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W1 = sc.nextInt();
		int W2 = sc.nextInt();
		String[] A = new String[W1];
		String[] B = new String[W2];
		for (int i = 0; i<W1;i++) {
			A[i] = sc.next();
		}
			for( int i = 0; i<W2;i++) {
				B[i]= sc.next();

			}
			for (int i = 0; i<W1;i++) {
				for (int j = 0; j<W2;j++) {
					System.out.println(A[i]+" as "+B[j]);
				}
			}
		}

	}


