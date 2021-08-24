import java.util.Scanner;

public class ccc06j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m =sc.nextInt();
		int n =sc.nextInt();
		int count = 0;
		for(int j = 1; j < m+1; j++) {
            for (int i = 1; i < n+1; i++) {
                if (i + j == 10) {
                    count++;
                }
            }
        }
        if(count == 1) {
            System.out.println("There is 1 way to get the sum 10.");
        }
        else{
            System.out.println("There are " + count + " ways to get the sum 10.");
        }
	}

}
