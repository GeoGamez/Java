import java.util.Scanner;

public class ccc12j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int K = sc.nextInt();
         String word= sc.next();
         for(int i=0;i<word.length();i++) {
        	 char C=word.charAt(i);
        	 int S= 3*(i+1)+K;
        	 char D= (char)(C-S);
        	 if(D<'A') {
        		 D=(char)(D+26);
        	 }
        	 System.out.print(D);
         }
	}

}
