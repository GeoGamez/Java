import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1
		int D1 = sc.nextInt();
		int D2 = sc.nextInt();
		int D3 = sc.nextInt();
		double D4 = 0;
		double D5 = 0;
		if (D1>100){
			D4 = D4 + (D1 -100) * 0.25;
		}
		if (D1 > 250) {
			D5 = D5 +(D1-250)*0.45;
		}
		D4 = D4 +D2*0.15;
		D5 = D5 + D2*0.35;
		D4 = D4 + D3*0.20;
		D5 =D5+D3*0.25;
		D4= Math.round(D4*100.0)/100.0;
		D5=Math.round(D5*100.0)/100.0;
		System.out.println("Plan A costs "+ D4);
	    System.out.println("Plan B costs "+ D5);
		if (D4<D5) {
			System.out.println("Plan A is cheapest.");
		}else if (D4 == D5) {
			System.out.println("Plan A and B are the same price.");
		}else {
			System.out.println("Plan B is cheapest.");
		}
		
		//2
		int D6 = sc.nextInt();
	if (D6 == 1){
	System.out.println("      *");
	System.out.println("      *");
	System.out.println("      *");
	System.out.println("       ");
	System.out.println("      *");
	System.out.println("      *");
	System.out.println("      *");
	} else if (D6 == 2) {
		System.out.println(" * * *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println(" * * *");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("  * * *");
	}else if (D6 == 3) {
		System.out.println(" * * *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println(" * * *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println(" * * *");

	}else if (D6 == 4) {
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println(" * * *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println("      *");
	}else if (D6 == 5) {
		System.out.println(" * * *");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println(" * * *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println(" * * *");
	}else if (D6 == 6) {
		System.out.println(" * * *");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println(" * * *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println(" * * *");
		
	}else if (D6 == 7) {
		System.out.println(" * * *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println("       ");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println("      *");
	
	}else if (D6 == 8) {
		System.out.println(" * * *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println(" * * *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println(" * * *");
	}else if (D6 == 9) {
		System.out.println(" * * *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println(" * * *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println("      *");
		System.out.println(" * * *");

	}else if (D6 == 0) {	
	System.out.println(" * * *");
	System.out.println("*     *");
	System.out.println("*     *");
	System.out.println("*     *");
	System.out.println("");
	System.out.println("*     *");
	System.out.println("*     *");
	System.out.println("*     *");
	System.out.println(" * * *");
	}
	
	
	//3
	int D7 = sc.nextInt();
	int D8 = sc.nextInt();
	int D9 = sc.nextInt();

	if (D7 > D8 && D7>D9 && D8 > D9) {
		System.out.println(D8);
	}else if (D7 > D8 && D7>D9 && D8<D9)
			System.out.println(D9);
	else if ( D7 < D8 && D8 < D9 && D9>D7 ) {
		System.out.println(D8);
	}else if (D7 <D8 && D8 > D9 && D9 > D7) {
		System.out.println(D9);
	}else {
		System.out.println(D7);
	}
	//4

	int D10 = sc.nextInt();
	int D0 = sc.nextInt();
	
	if (D10 > 0 && D0 > 0) {
		System.out.println(1);
	}else if ( D10 > 0 && D0 <0) {
		System.out.println(4);
	}else if (D10< 0 && D0 < 0) {
		System.out.println(3);
	}else {
		System.out.println(2);
	}


	}

	}


