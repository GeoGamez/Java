import java.util.Scanner;

public class ccc07s2 {

	public static void main(String[] args) {
		
		 public static int n;
		  public static int m;
		Scanner sc = new Scanner(System.in); 
	    n = sc.nextInt();
	    int[][] a = new int[n][3];
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < 3; j++) {
	        a[i][j] = sc.nextInt();
	      }
	      Arrays.sort(a[i]);
	    }

	    m = sc.nextInt();
	    int[] b = new int[3];
	    for (int i = 0; i < m; i++) {
	        b[0] = sc.nextInt();
	        b[1] = sc.nextInt();
	        b[2] = sc.nextInt();
	        Arrays.sort(b);
	        compareBox(a, b);
	    }
	  }
	  public static void compareBox(int[][] stand, int[] box){
	    long max = 999999999999999999L; 
	   for(int i=0; i<stand.length; i++){
	     if(stand[i][0] >= box[0] && stand[i][1] >= box[1] && stand[i][2] >= box[2]){
	        if( max > 1L*stand[i][0]*stand[i][1] * stand[i][2]){
	          max = stand[i][0]*stand[i][1] * stand[i][2];
	        }
	     }
	   }
	   if(max != 999999999999999999L){
	     System.out.println(max);
	   }
	   else{
	     System.out.println("Item does not fit.");
	   }
	   return;
	}

}
