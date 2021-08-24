import java.util.Scanner;

public class stringflipping {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		   String S = sc.nextLine();
	    String S2 = sc.nextLine();
   for (int i = 0; i <S.length();i++){
     System.out.println(S.charAt(i));
   }
     for (int i = 0; i < S2.length();i++){
         System.out.println(S2.charAt(S2.length()-i-1));
       }
      for (int i = 0; i <S.length();i++){
          System.out.println(S.charAt(i));
          System.out.println(S2.charAt(i));
        }
      for (int i =S2.length()-1;i>=0;i--){
          System.out.println(S2.charAt(i));
        }
      for (int i=0; i<S1.length(); i++) {
          System.out.print(S1.charAt(i));    //i forward 0 1 2 3 4
          System.out.print(S2.charAt(S1.length()-1-i));   //4-0    4-1   4-2  4-3 4-4
        }
   // 9 8 7 6
   // if backward middle comparison is >=
   // for (int i=9; i>=6; i--) {
//        System.out.println(i);
   // }

   // 6 7 8 9
   // if forward middle comparision is <
   // for (int i=6; i<=9; i++) {
//        System.out.println(i);
   // }
      for (int i = 0; i < S2.length();i++){
          System.out.println(S2.charAt(S2.length()-i-1));
          System.out.println(S.charAt(S.length()-i-1));
      }
      for (int i = 0; i < S2.length();i++){
          System.out.println(S2.charAt(i));
          System.out.println(S.charAt(S.length()-i-1));
      }
      for (int i = 0; i < S2.length();i++){
          System.out.println(S.charAt(i));
          System.out.println(S2.charAt(S2.length()-i-1));
      }
	}

}
