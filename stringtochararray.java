import java.util.Scanner;

public class stringtochararray {

	public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
		    char C[][] = new char [3][6];
		    String S1[] = new String [3];
		      
		    for(int i = 0; i<3; i++){
		      C[i]=sc.next().toCharArray();
		    }
		      
		    for(int i = 0; i<3; i++){
		      for(int j = 0; j<6; j++){
		        C[i][j]=S1[i].charAt(j); 
		      }
		    }
		    for(int i = 0; i<3; i++){
			      for(int j = 0; j<6; j++){
			        System.out.println(C[i][j]+ " "); 
			      }
			      System.out.println();
			    }
	}

}
