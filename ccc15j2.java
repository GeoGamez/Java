import java.util.Scanner;

public class ccc15j2 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	String S  = sc.nextLine(); 
	     String newS = S.replace(":-)",""); 
	     int countHappy = (S.length()-newS.length())/3;
	     String newS2 = S.replace(":-(",""); 
	     int countSad = (S.length()-newS2.length())/3;
	     if (countHappy > countSad) {
	    	 System.out.println("happy");
	     } else if (countSad > countHappy) {
	    	 System.out.println("sad");
	     } else if (countSad == 0 && countHappy == 0) {
	    	 System.out.println("none");
	     }else if (countSad == countHappy && countHappy != 0) {
	    	 System.out.println("unsure");
	     }
	   
	}

}
