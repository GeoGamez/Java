import java.util.LinkedList;
import java.util.Scanner;

public class cool {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 LinkedList<Integer> A = new LinkedList<Integer>();
	        for(int r =0;r<6;r++){
	        	A.add(sc.nextInt());
	        }
          
	  for(int i=0;i<3;i++) {
		  System.out.println(A.pollFirst()+A.pollLast());
	  }

 	
	        	}
	        


}
