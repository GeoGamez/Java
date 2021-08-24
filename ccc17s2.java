import java.util.Scanner;
import java.util.Arrays;
public class ccc17s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int n =sc.nextInt();
		  int [] A = new int [n];
		  for (int i = 0; i < n; i++) {
			    	A[i]=sc.nextInt();
	}
		  Arrays.sort(A);
		  for (int i=0;i<A.length/2;i++) {
			  for (int j=A.length/2;j<A.length;j++) {
System.out.print(A[i]);
System.out.print(" ");
System.out.print(A[j]);
System.out.print(" ");
			  }
		  }

	}

}
