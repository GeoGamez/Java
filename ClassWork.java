import java.util.Scanner;

public class ClassWork {

	public static void main(String[] args) {
		//2.1
		int age = 14;
		if (age < 13){
			System.out.println ("Less than 13");
		} else { 
			System.out.println ("Older than 13");
		}
		// if (condition 1) {
		//	     statement 1;
		// } else if (condition 2) {
		//	     statement 2;
		// } else {
		//	     statement last;
		// }
		int KA = 11;
		if (KA < 10) {
			System.out.println ( "Single Digit");
		} else if (KA >=10  && KA <100){
			System.out.println("DOuble digit");
		} else {
			System.out.println ("Big number");
		}   
		//Create variable number store 11
		//if number less than 10 output "Single digit"
		//else if number greater equals to 10 and less than 100 output "Double digit"
		//else output "Big number"

		//if (condition 1) {
		//    statement 1;
		//} else if (condition 2) {
		//    statement 2;
		//} else {
		//    statement last;
		//}


		//condition

		//variable compare with value

		//compare:
		//> greater than
		//< less than
		//>= greater equals to
		//<= less equals to 
		//!= not equals to
		//&& and
		//|| or
		//
		int KC = 100;
		if (KC>99){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		//
		int KE = 11;
		int KF = 12;
		if (KE +KF < 10){
			System.out.println ("YES");
		} else {
			System.out.println("NO");
		}
		
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A+B);
	}
}
