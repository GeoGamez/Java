import java.util.Scanner;

public class ccc14j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int V = sc.nextInt();
	String Vote = sc.next();
	String VoteB = Vote.replace("A",""); 
	 int VoteBC = V-VoteB.length();
	if ((V - VoteBC) > V/2) {
		System.out.println("B");
	}else if (V/2 == VoteBC) {
		System.out.println("Tie");
	}else {
		System.out.println("A");
	}
	
	}

}
