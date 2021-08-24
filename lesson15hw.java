import java.util.Scanner;
import java.util.Arrays;
public class lesson15hw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		 for (int i = 0; i <S1.length();i++){
		     System.out.println(S1.charAt(i));
		   }
		String S2 = sc.next();
		 for (int i = S2.length()-1; i >=0;i--){
		     System.out.println(S2.charAt(i));
		   }
		 String A1 = sc.next();
		 String A2 = sc.next();
		 for (int i = 0; i < A1.length();i++){
	          System.out.println(A2.charAt(i));
	          System.out.println(A1.charAt(A1.length()-i-1));
	      }
	      for (int i = 0; i < A2.length();i++){
	          System.out.println(A1.charAt(i));
	          System.out.println(A2.charAt(A2.length()-i-1));
	      }
	      String B = "I like computer coding";
	      System.out.println(B.substring(7,15));
	      String C = sc.next();
	      System.out.println(C.charAt(2)+C.charAt(4));
	      String D = sc.next();
	      if (D.equals("ABC")) {
	    	  System.out.println("Yes");
	      }
	      String E = sc.next();
	      String EE = "";
	      EE = E.replaceAll("H","");
	     System.out.println( E.length()-EE.length());
	    int A[] = new int [5];
	    for (int i = 0;i<A.length;i++) {
	    	A[i] = sc.nextInt();
	    }
	    Arrays.sort(A);
	    System.out.println(A[4]);
	    int BB[] = new int [6];
	    for (int i = 0;i<BB.length;i++) {
	    	BB[i] = sc.nextInt();
	    }
	    Arrays.sort(BB);
	    System.out.println(BB[0]);
	    int y = 0;
	    while(true) {
	    int x= sc.nextInt();
	    
	    	if(x == 0) {
	    		System.out.println(y);
	    		return;
	    	}
	    y = y+x;
	    
	    }
	    
	}

}
