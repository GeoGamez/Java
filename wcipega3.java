import java.util.Scanner;

public class wcipega3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0;i<T;i++) {
			int k = sc.nextInt();
			for (int j=k;j<=20000;j++) {
			String	Number = String.valueOf((j*j*j));
				if(Number.endsWith("888")) {
					System.out.println(j);
					return;
				}
			}
		}
	}

}
