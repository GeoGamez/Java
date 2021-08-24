
import java.util.Scanner;
import java.util.Arrays;

public class arraywork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[4];
		for ( int j = 0;j<A.length;j++){
			A[j]= sc.nextInt();
		}

		System.out.println(A[1]);
		System.out.println(A[1]+A[0]+A[3]+A[2]);
		for ( int i = 0;i<A.length;i++){
			System.out.println(A[i]);
		}
		int [] B = new int[7];
		int Sum = 0;
		for (int i = 0; i<B.length;i++){
			B[i] =sc.nextInt();
		}
		for (int i = 0 ;i<B.length;i++){
			Sum += B[i];
		}
		System.out.println(Sum);
		System.out.println(Sum/B.length);
		Arrays.sort(B);
		System.out.println(B[3]);
		int [] C = new int [5];
		for (int i = 0; i < C.length;i++ ) {
			C[i]= sc.nextInt();
		}
		for ( int i = 0; i< C.length; i++) {
			System.out.println(C[i]);
		}
        int [] KA = new int[5];
        int [] KB = new int[5]; 
        int [] KC= new int[5];
      for (int i = 0; i < KA.length; i++){
        KA[i]=sc.nextInt();
      }
      for (int i = 0; i < KB.length; i++){
        KB[i]=sc.nextInt();
      }
           for (int i = 0; i < KA.length; i++){
         KC[i]= KA[i]+KB[i];
           }
           for (int i = 0; i < KA.length; i++){
          System.out.println(KC[i]);
           }
 	      int []A = new int [7];
 	      int []B = new int [7];
 	      int []C= new int [7];
 	      int D = 0;
 	      for (int i = 0; i<A.length;i++){
 	          A[i]= sc.nextInt();
 	      }
 	      for (int i = 0; i<B.length;i++){
 	          B[i]= sc.nextInt();
 	      }
 	       for (int i = 0; i<A.length;i++){
 	             C[i]= A[i] -B[i];
 	      }
 	      for (int i = 0; i<A.length;i++){
 	         if ( C[i]%2 == 0){
 	               D = D + C[i];
 	      }
 	      }
 	        System.out.println(D);
 		      int [] A = new int [5];
 		      int [] B = new int [5];
 		            for (int i = 0; i < A.length;i++){
 		              A[i]=sc.nextInt();
 		            }
 		                 for (int i = 0; i < B.length;i++){
 		              B[i]=A[i]*3;
 		            }
 		                      for (int i = 0; i < B.length;i++){
 		              System.out.println(B[i]);
 		            }
 		                     int [] A = new int [5];
 		                    int [] B = new int [5];
 		                    int [] C = new int[5];
 		                        for(int i = 0; i< A.length; i++){
 		                          A[i] = sc.nextInt();
 		                        }
 		                              for(int i = 0; i< B.length; i++){
 		                          B[i] = sc.nextInt();
 		                        }
 		                             for(int i = 0; i< A.length; i++){
 		                          C[i] = A[i] * B[i];
 		                        }
 		                    Arrays.sort(C);
 		                    System.out.println(C[4]);
 		                   int[] X = new int [5];
 		                  int[] Y = new int [5];
 		                for (int i = 0; i <X.length; i++){
 		                  X[i] = sc.nextInt();
 		                  Y[i]= sc.nextInt();
 		                }
 		                    Arrays.sort(X);
 		                  Arrays.sort(Y);
 		                  System.out.println(X[0]);
 		                   System.out.println(Y[4]);
	}

}
