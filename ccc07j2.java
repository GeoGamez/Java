import java.util.Scanner;

public class ccc07j2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int b = 1;
		 for (int i = 0 ; i < b;i++) {
			 String S = sc.next();
			 if ( S.equals( "CU")) {
				 System.out.println("see you");
				 b = b+1;
			 }
			 if ( S.equals( ":-(")) {
				 System.out.println("I'm unhappy");
				 b = b+1;
			 }
			 if ( S.equals( ":-)")) {
				 System.out.println("I'm happy");
				 b = b+1;
			 }
			 if ( S.equals( ";-)")) {
				 System.out.println("wink");
				 b = b+1;
			 }
			 if ( S.equals( ":-P")) {
				 System.out.println("stick out my tongue");
				 b = b+1;
			 }
			 if ( S.equals( "(~.~)")) {
				 System.out.println("sleepy");
				 b = b+1;
			 }
			 if ( S.equals( "CCC")) {
				 System.out.println("Canadian Computing Competition");
				 b = b+1;
			 }
			 if ( S.equals( "CUZ")) {
				 System.out.println("because");
				 b = b+1;
			 }
			 if ( S.equals( "TY")) {
				 System.out.println("thank-you");
				 b = b+1;
			 }
			 if ( S.equals( "TA")) {
				 System.out.println("totally awesome");
				 b = b+1;
			 }
			 if ( S.equals( "YW")) {
				 System.out.println("you're welcome");
				 b = b+1;
			 }
			 if ( S.equals( "TA")||S.equals( "TTYL")||S.equals( "YW")||S.equals( "YW")||S.equals( "CUZ")||S.equals( "CCC")|| S.equals( "(~.~)")||S.equals( ";-)")|| S.equals( ":-)")|| S.equals( ":-(")|| S.equals( "CU")) {	 
			 }else {
				 System.out.println(S);
				 b = b+1;
			 }
			 if ( S.equals( "TTYL")) {
				 System.out.println("talk to you later");
				 
			 }
			 
		 }

	}

}
