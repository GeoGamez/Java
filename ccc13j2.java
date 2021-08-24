import java.util.Scanner;

public class ccc13j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String newS = S.replace("I","");
		newS = newS.replace("O","");
		newS = newS.replace("S","");
		newS = newS.replace("H","");
		newS = newS.replace("Z","");
		newS = newS.replace("X","");
		newS = newS.replace("N","");
if (newS.isEmpty()) {
	System.out.println("YES");
	
}else {System.out.println("NO");

}

	}

}
