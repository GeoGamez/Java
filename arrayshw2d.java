import java.util.Scanner;

public class arrayshw2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1
		int sum =0;
		int [][] A= new int [3][5];
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		        A[i][j]=sc.nextInt();
		      }
		}
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		       if(A[i][j]%2==0) {
		    	   sum =+ A[i][j];
		      }
		}
		}
		//2
		System.out.println(sum);
		int [][] B= new int [4][5];
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		        B[i][j]=sc.nextInt();
		      }
		}
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		        System.out.println(B[i][j]);
		      }
		}
		//3
		int store =0;
		int [][] C= new int [4][2];
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		        C[i][j]=sc.nextInt();
		      }
		}
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		       if( store <= C[i][j]) {
		    	   store = C[i][j];
		      }
		}
		}
		      System.out.println(store);
		      //4

		int [][] D= new int [3][3];
		int store2=D[0][0];
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		        D[i][j]=sc.nextInt();
		      }
		}
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		       if( store2 >= D[i][j]) {
		    	   store2 = D[i][j];
		      }
		}
		}
		      //5
		int [][] E= new int [4][3];
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		        E[i][j]=sc.nextInt();
		      }
	}
		for (int i =0;i< 3;i++){
		      for(int j=0;j<5;j++){
		       if(E[i][j]%2==0) {
		      }else{
		    	  sum =+ E[i][j];
		      }
		}
		}
		}
		
		}
		 

	
