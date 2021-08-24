import java.util.Scanner;

public class ccc02j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String W = sc.next();
			if(W.equals("quit!")) {
				return;
			}
			if ( W.length() >4) {
			if (W.charAt(W.length()-1) =='r') {
				if (W.charAt(W.length()-2) =='o') {
				if (W.charAt(W.length()-3)!='a' && W.charAt(W.length()-3)!='e'&&W.charAt(W.length()-3)!='i'&&W.charAt(W.length()-3)!='o'&&W.charAt(W.length()-3)!='u'&&W.charAt(W.length()-3)!='y') {
				W = W.replace("or", "our");
				System.out.println(W);
				}else {
					System.out.println(W);
				}
				}else {
					System.out.println(W);
				}
			}else {
				System.out.println(W);
			}
			}else {
			System.out.println(W);
			}
		}
	}

}
