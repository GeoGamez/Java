import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int [] A = new int [7];
      for (int i = 0; i< A.length;i++){
        A[i] = sc.nextInt();
      }
              for (int i = 0; i< A.length-1;i++){
        A[i] =A[i] + A[i+1];
      }  
              for (int i = 0; i< A.length;i++){
        System.out.println(A[i]);
      }
	}

}
