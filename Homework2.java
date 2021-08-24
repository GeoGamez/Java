import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		//1
		int Kday = 1;
		if (Kday == 1) {
			System.out.println( "Monday");
		}else if (Kday == 2) {
			System.out.println ("Tuesday");
		}else if (Kday == 3) {
			System.out.println ("Wednesday");
		}else if (Kday == 4) {
			System.out.println ("Thusday");
		}else if (Kday == 5) {
			System.out.println ("Friday");
		}else if (Kday == 6) {
			System.out.println ("Saturday");
		}else if (Kday == 7){
			System.out.println ("Sunday");}
		//2
		double KA  = 31.36;
		double KB = 42.44;
		if (KA-KB> 100) {
			System.out.println ("Good Enough");
		}else {
			System.out.println ("Not good enough");
		}
		//3
		int KN = 62;
		if (KN >60) {
			System.out.println ("E");
		}else if (KN > 60 && KN<70){
			System.out.println ("D");
		} else if (KN > 70 && KN<80){
			System.out.println ("C");
		}else if (KN > 80 && KN<90){
			System.out.println ("B");
		}		else if (KN>90){
			System.out.println ("A");			
		}
		//4
		byte KM = 100;
		if (KM<100) {
			System.out.println ("No perfect");
		}else {
			System.out.println ("Perfect");
		}

		Scanner sc = new Scanner(System.in);
		int D1 = sc.nextInt();
		int D2 = sc.nextInt();
		int D3 = sc.nextInt();
		int D4 = sc.nextInt();
		if (D1 < D2 && D2< D3 && D3< D4){
			System.out.println ("Fish Rising");
		}else if (D1> D2 && D2>D3 && D3 > D4){
			System.out.println ("Fish Diving");
		} else if (D1 == D2 && D2 == D3 && D3 == D4){
			System.out.println ("Fish at Constant Depth");
		}else {System.out.println ("No fish");
		}

		int KE = sc.nextInt();
		int KF = sc.nextInt();
		int KG = sc.nextInt();
		if (KE + KF + KG == 180 && KE == KF && KF == KG) {
			System.out.println ("Equilateral");
		}else if (KE + KF + KG == 180 && KE == KF || KF== KG ||KG == KE ) {
			System.out.println ("Isosceles");	 
		}else if (KE + KF + KG == 180 && KE != KF && KF != KG && KG !=KE) {
		System.out.println ("Scalene");
	}else {
		System.out.println ("Error");
	}

		int KH = sc.nextInt();
		int KJ = sc.nextInt();
		if (KH >= KJ) {
			System.out.println ("Congratulations, you are within the speed limit!");
		} else if (KJ-20 <= KH && KH < KJ) {
			System.out.println ("You are speeding and your fine is $100.");
		}else if (KJ-30 <= KH && KH<KJ-20) {
			System.out.println ("You are speeding and your fine is $270.");
		}else {	
			System.out.println ("You are speeding and your fine is $500.");
		}
		int KQ = 0;
		int KK = sc.nextInt();
		int KO = sc.nextInt();
		int KL = sc.nextInt();
		int KP = sc.nextInt();
		if (KK == 1) {
			KQ = KQ + 461;
		}else if (KK == 2) {
			KQ = KQ+ 431;
		}else if (KK == 3) {
			KQ = KQ+ 420;
		}else {
			KQ = KQ+ 0;
		}
		if (KL == 1) {
			KQ = KQ +130;
		}else if (KL == 2) {
			KQ = KQ+ 160;
		} else if (KL == 3) {
			KQ = KQ + 118;
		} else {
			KQ = KQ+ 0;
		} 
		if (KO == 1) {
			KQ = KQ +100;
		}else if (KO == 2) {
			KQ = KQ+ 57;
		} else if (KO == 3) {
		KQ = KQ + 70;
		}else {
			KQ = KQ+ 0;
		}
		if (KP == 1) {
			System.out.println("Your total Calorie count is " + (KQ+167)+".");

		}else if (KP == 2) {
			System.out.println ("Your total Calorie count is " +(KQ + 266)+".");
			} else if (KP == 3) {
				System.out.println ("Your total Calorie count is " +(KQ + 75)+".");
			}else if (KP == 4) {
				System.out.println ("Your total Calorie count is " +KQ+".");

			}
}

}
