import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
public class FinalExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	Task 1
		int N = sc.nextInt();
		if (N%2 == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	//	Task 2
		String S = sc.next();
		String S1 = "";
		S1= S.replaceAll("C","");
		System.out.println(S.length()-S1.length());
		
	//	Task 3
		String S1 = sc.next();
		String S2 = sc.next();
		for(int i = 1;i<=S1.length();i++) {
			System.out.print(S1.charAt(S1.length()-i));
			System.out.print(S2.charAt(S2.length()-i));
		}
	// Task 4
		String S3 = sc.next();
		for(int i = 1;i<=S3.length();i++) {
		System.out.println(S3.charAt(S3.length()-i));
		}
	//	Task 5
		int N1 = sc.nextInt();
		if ( N1>=10) {
		for (int i = 10;i<=N1;i++) {
			if (N1%i == 0) {
				System.out.println(i);
			}
		}
		}else {
			System.out.println("This number is smaller then 10 :(");
		}
 //Task 6
		 int [] A = new int [5];
		 int [] B = new int [5];
		 int [] C = new int [5];
		 for (int i = 0;i<A.length;i++) {
			 A[i]=sc.nextInt();
		 }
		 for (int i = 0;i<B.length;i++) {
			 B[i]=sc.nextInt();
		 }
		 for (int i = 0;i<A.length;i++) {
			 C[i]=A[i]-B[i];
			System.out.println(C[i]);
		 }
	//	Task 8
		 String [] E = new String [3];
		 String [] F = new String [5];
		 for (int i = 0;i<E.length;i++) {
		 E[i]=sc.next();
	 }
		 for (int i = 0;i<F.length;i++) {
			 F[i]=sc.next();
		 }
		 for(int i= 0;i<E.length;i++) {
			 for(int j=0;j<F.length;j++) {
				 	System.out.println(E[i]+""+F[j]);
			 }
		 }
		// Task 9
		String G = "ABCDEFGHHIJ";
		System.out.println(G.substring(4,7));
		//Task 10
		List<Integer> list = new LinkedList<>();
		int X = 0;
		while(true) {
			X = sc.nextInt();
			if (X == 0) {
				break;
			}
			list.add(X);
		}
		for (int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		 //Task 1:
	    //input N as int
	    //if N is even number output YES
	    //else output NO
	    int N = sc.nextInt();
	    if (N%2==0) {
	      System.out.println("YES");
	    }
	    else {
	      System.out.println("NO");
	    }

	    //Task 2:
	    //input String S
	    //count how many "C" inside String S

	    String S = sc.next();
	    String newS = S.replace("C","");  //Removed C
	    System.out.println(S.length()-newS.length());
	  
	    //Task 3:
	    //input String S1
	    //input String S2
	    //output S1 and S2 alternatively backward  

	    String S1 = sc.next();
	    String S2 = sc.next();
	    for (int i = 0; i < S1.length(); i++) {
	      System.out.print (S1.charAt(S1.length()-1-i));
	      System.out.print (S2.charAt(S2.length()-1-i));
	    }
	  
	    for (int i = S1.length()-1; i>=0; i--) {
	      System.out.print(S1.charAt(i));
	      System.out.print(S2.charAt(i));
	    }
	    System.out.println();
	      
	    //Task 4:
	    //input String S3
	    //output char one by one backward
	      
	    String S3 = sc.next();
	    for (int i = 0; i < S3.length(); i++) {
	      System.out.print (S3.charAt(S3.length()-1-i));
	    }


	    //Task 5
	    //input N1 as int
	    //output N1's all the factor which is greater than 10

	    int N1 = sc.nextInt();
	    for (int i = 11; i < N1; i++) {  //start from 11 greater than 10
	      if (N1%i==0){
	        System.out.println(i);
	      }
	    }
	      
	    //Task 6
	    //input 5 numbers and store into array A
	    //input 5 numbers and store into array B
	    //Create array C with 5 elements to store A-B
	    //Using for loop to output element one by one from C
	    //A  3 6 8 11 2 5
	    //B  5 2 1 10 1 6
	    //C -1 4 7 1 1 -1
	    int [] A = new int [5];
	    int [] B = new int [5];
	    int [] C = new int [5];
	    for (int i = 0; i < A.length; i++) {
	      A[i] = sc.nextInt();
	    }
	    for (int i = 0; i < B.length; i++) {
	      B[i] = sc.nextInt();
	    }
	    for (int i = 0; i < C.length; i++) {
	      C[i] = A[i] - B[i];
	    }
	    for (int i = 0; i < C.length; i++) {
	      System.out.println(C[i]);
	    }
	     

	    //Task 7
	    //using for loop to input 7 numbers and store into Array D
	    //using another for loop to find out the sum of the even number from array D
	    //output the sum

	    int [] D = new int [7];
	    int sum = 0;
	    for (int i = 0; i < D.length; i++) {
	      D[i] = sc.nextInt();
	    }
	    for (int i = 0; i < D.length; i++) {
	     if (D[i]%2==0) {
	       sum =+ D[i];
	     }
	    }
	    System.out.println(sum);
	      
	    //Task 8
	    //input 3 String and store into Array E
	    //input 5 String and store into array F
	    //using nested for loop to 
	    //Combine E and F and output the combine
	    String [] E = new String [3];
	    String [] F = new String [5];
	    for (int i = 0; i < 3; i++){
	      E[i] = sc.next();
	    }
	    for (int i = 0; i < 5; i++){
	      F[i] = sc.next();
	    }
	    for (int i = 0; i < 3; i++){
	      for (int j = 0; j < 5; i=j++){
	         System.out.println(E[i]+F[j]);
	      }
	    }

	    //Task 9
	    //String G = "ABCDEFGHIJ";
	    //Using substring to output EFG from String G
	    String G = "ABCDEFGHHIJ";
	    System.out.println(G.substring(4, 7));

	    //Task 10:
	    //using while loop to input numbers
	    //if number equals to 0 end
	    //else add number into LinkedList
	    //output element one by one from the LinkedList
	    LinkedList<Integer>  list = new LinkedList<Integer>();
	    while (true) {
	      int N2 = sc.nextInt();
	      if (N2 == 0) {
	        break;
	      }
	      else {
	        list.add(N2);
	      }
	    }
	    for ( int i = 0; i < list.size(); i++) {
	      System.out.println(list.get(i));
	}

}
