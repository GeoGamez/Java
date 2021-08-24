import java.util.Scanner;

public class wcipega1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1;i<=N+1;i++) {
			String M = sc.nextLine();
			if (M.length()>=2) {
			String sub= M.substring(M.indexOf(" ")+1,(M.length()));
			int number= Integer.valueOf(M.substring(0,M.indexOf(" ")));
			System.out.println(sub.substring(0,number-1)+sub.substring((number)));
			}
		}
	}

}
