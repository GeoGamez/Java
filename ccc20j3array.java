import java.util.Arrays;
import java.util.Scanner;

public class ccc20j3array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int Number = sc.nextInt();
	      int [] X = new int[Number];
	        int [] Y = new int [Number];
	      for (int i = 0; i< Number; i++){
	        String XY=  sc.next();
	        String [] A = XY.split(",");
	      X[i] = Integer.parseInt(A[0]);
	      Y[i] = Integer.parseInt(A[1]);
	      }
	      Arrays.sort(X);
	      Arrays.sort(Y);
	      System.out.println(( X[0]-1)+","+ (Y[0]-1));
	       System.out.println( (X[Number-1]+1)+","+(Y[Number-1]+1));
	}

}
