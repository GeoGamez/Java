import java.util.Scanner;

public class arrays2d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// type [][] name = new type [rowsize][colsize]
//A[row][colume];
		
		double [][] C= new double [3][4];
		C[0][0]= 3.1;
		C[2][1]= 5;
		C[1][2]=2.8;
		
		String [][] D= new String [3][4];
		D[0][1]= "kevin";
		D[1][0]= "Ray";
		D[2][0]="Eric";
		D[0][3]= "Jessica";
		D[2][2]= "Ryan";

	    int [] [] KA = new int [3][5];
	    for (int i =0;i< 3;i++){
	      for(int j=0;j<5;j++){
	        KA[i][j]=sc.nextInt();
	      }
	    }
	    double KSUM= 0;
	    double [] [] KB=new double [5][2];
	      for (int i=0;i<5;i++){
	        for (int j=0;j<2;j++){
	          KB[i][j]=sc.nextDouble();
	        }
	      }
	         for (int i=0;i<5;i++){
	        for (int j=0;j<2;j++){
	         KSUM += KB[i][j];
	        }
	      }
	         char [] [] Kmap = {{'A','B','C','D'},
             {'E','F','G','H'},
             {'I','J','K','L'}};
	         //Kevin
	         int br =0;
	         int kbc =0;
	         int ker = 0;
	         int kec = 0;
	         char [] [] Kmap = {{'A','B','C','D'},
	                           {'E','F','G','H'},
	                           {'I','J','K','L'}};
	          
	         for(int i =0;i<3;i++){
	           for(int j = 0; j<4;j++){
	             if(Ja[i][j]=='A'){
	             br = i;
	             bc = j;
	             }
	             if(Ja[i][j]=='G'){
	             er = i;
	             ec = j;
	             }
	           }
	         }
	         System.out.println(Math.abs(br-er)+Math.abs(bc-ec));
	        // This 2d array does row to collum 
	         char[][]map = new char [3][6];
	         for(int i =0;i<2;i++){
	           map[i] = sc.next().toCharArray();
	         }
	}

}
