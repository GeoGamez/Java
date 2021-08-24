import java.util.Scanner;

public class wcipega2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ready");
			while(true) {
	String LL= sc.nextLine();
	if (LL.equals("  ")) {
		return;
	}
	if (LL.equals("qp")||LL.equals("db") ||LL.equals("pq")||LL.equals("bd")) {
		System.out.println("Mirrored pair");
	}else {
		System.out.println("Ordinary pair");
	}
}
	}

}
