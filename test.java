import java.awt.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int K = sc.nextInt();
		int [][] A= new int [M][N];
		for (int r = 0; r < A.length; r++)
		{
			for (int c = 0; c < A[r].length; c++)
		    {
		    	A[r][c] = 0;
		    }
		}
		String [] H= new String [K];
		for (int i=0;i<K;i++) {
		H[i]=sc.nextLine();
		}
		for (int i=0;i<K;i++) {
		String RC= H[i];
		String [] Q =RC.split("\\s+");
		String paint = Q[Q.length - 1];
		if(!paint.isEmpty()) {
		int SP = Integer.parseInt(paint);
		}
		}
}
}