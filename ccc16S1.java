import java.util.Scanner;

public class ccc16S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();

		int counter = 0;
		int L = A.length();
		for (int i = 0; i < L; i++){
			String character = String.valueOf(B.charAt(i));
			if (character.equals("*")) {
				counter++;
				continue;
			}
			int hold = A.length();
			A = A.replaceFirst(character, "");
			if (hold == A.length()){
				System.out.println("N");
				break;
			}
		}
		if (counter == A.length()){
			System.out.println("A");
		}
	}

}
