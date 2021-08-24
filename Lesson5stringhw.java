import java.util.Scanner;

public class Lesson5stringhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(S.length());
		System.out.println(S.charAt(2));
		if (S.equals("Cindy")) {
		System.out.println("Teacher");
		}else {
		System.out.println("Student");
		}
		if (S.startsWith("C")) {
			System.out.println("Carrot");

		}else {
			System.out.println("Never mind");
		}

		// Q2
		String A= "AAABB";
		A = A.replace("A","C");
		System.out.println(A);
		//Q3
		String B = "I like reading book";
		System.out.println(B.substring(15,19));
		
		//  String S  = "AAAAAAAAABB";
		     //output how many A inside String S
		  //   String newS = S.replace("A","");    //from S remove A
		     //int countA = S.length()-newS.length();
		    // System.out.println(countA);
	}

}


