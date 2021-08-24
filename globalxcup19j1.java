import java.util.Scanner;

public class globalxcup19j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		String S =sc.nextLine();
		S = S.replace(" ", "");
		for ( int k = 0; k <C;k++) {
			int Q = sc.nextInt();
			for (int i = 0; i<N;i++) {
				char Y = S.charAt(i);
				if ( Y == '1') {
					if ( Q == i+1) {
						M = M + A;
					}
				}
				if ( Y == '0') { 
					if ( Q == i+1) {
						M = M - B;
					}

				}
			}
		}
		System.out.println(M);
	    Scanner sc = new Scanner(System.in);
	    
	    // https://dmoj.ca/problem/globexcup19j1 Kevin
	   // int N = sc.nextInt();
	    //int M = sc.nextInt();
	    //int A = sc.nextInt();
	    //int B = sc.nextInt();
	    //int C = sc.nextInt();
	    //sc.nextLine();
	    //String S =sc.nextLine();
	    //S = S.replace(" ", "");   //remove the spaces
	    
	    //101   S,charAt(0)   represent play with alien 1
	    //      S.charAt(1)   represent play with alien 2
	    //      S.charAt(2)   represent play with alien 3
	    
	   // for ( int k = 0; k <C;k++) {
	    //  int Q = sc.nextInt()-1;   //Q -1 is the index  3   S.charAt(2)
	    //  if ( S.charAt(Q) == '1') {
	    //      M+= A;   //you win you earn A points
	     // } else {
	    //      M-=B;    //you lose you lose B points
	   //   }
	 //   }
	//    System.out.println(M);   
	}
}
