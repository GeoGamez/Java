import java.util.Scanner;

public class ccc02j2substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(true){
            String S = sc.next();
            if (S.equals("quit!")){
              break;
              if (S.length()>4 && S.endsWith("or") && ! "aeiouy".contains(S.charAt(S.length()-3+""))){
                System.out.println(S.substring(0,S.length()-2)+"our");
                
        }else {
        	System.out.println(S);
        }
	}

}
	}
}
