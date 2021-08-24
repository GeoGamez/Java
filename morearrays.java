import java.util.Scanner;

public class morearrays {

	public static void main(String[] args) {
////		//1
Scanner sc = new Scanner(System.in);
//		int [][] A= new int [3][2];
//		for (int i =0;i< 3;i++){
//		      for(int j=0;j<2;j++){
//		        A[i][j]=sc.nextInt();
//		      }
//		}
//		for (int i =0;i< 3;i++){
//		      for(int j=0;j<2;j++){
//		        System.out.print(A[i][j]+ " ");
//		      }
//		      System.out.println();
//		}
//		//2
//		double store =0;
//		double[][] B= new double [2][5];
//		for (int i =0;i< 2;i++){
//		      for(int j=0;j<5;j++){
//		        B[i][j]=sc.nextInt();
//		      }
//		}
//		for (int i =0;i< 2;i++){
//		      for(int j=0;j<5;j++){
//		       if( store <= B[i][j]) {
//		    	   store = B[i][j];
//		      }
//		}
//		}
//		      System.out.println(store);
//		      //3
//				
//				float[][] C= new float [3][4];
//				for (int i =0;i< 3;i++){
//				      for(int j=0;j<4;j++){
//				        C[i][j]=sc.nextInt();
//				      }
//				}
//				float store1 = C[0][0];
//				for (int i =0;i< 3;i++){
//				      for(int j=0;j<4;j++){
//				       if( store1 >= C[i][j]) {
//				    	   store1 = C[i][j];
//				      }
//				}
//				}
				     // System.out.println(store1);
				      //4
				      char[][] D= new char [3][6];
				      for (int i=0;i<3;i++) {
				      String words =sc.next();
				  for (int j=0;j<words.length();j++) {
					  for (int r =0;r< 3;r++){
					      for(int c=0;c<6;c++){
					        D[r][c]=words.charAt(j);
					      }
					}
				  }
				      }
						for (int i =0;i< 3;i++){
						      for(int j=0;j<6;j++){
						        System.out.print(D[i][j]+ " ");
						      }
						      System.out.println();
						}
	}

}
