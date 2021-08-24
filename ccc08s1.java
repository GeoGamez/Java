import java.util.Scanner;

public class ccc08s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String y;
		String coldname = "";
		int coldtemp = 201;
		while (true) {
			y = sc.nextLine();
			x = sc.nextInt();
			if (x < coldtemp) {
				coldtemp = x;
				coldname = y;
			}
			if (y.equals("Waterloo")) {
				break;
			}
		}
		System.out.println(coldname);

	}

}
