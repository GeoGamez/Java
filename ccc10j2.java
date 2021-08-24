import java.util.Scanner;

public class ccc10j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();
		int Count= 0;
	int Count2= 0;
	int N = 0;
		int B = 0;
		for (int j=0; j<s;j++) {
			for(int i= 0 ;i<a  && Count<s;i++) {
				if (Count == s) {
				break;
				}else {
					N+=1;
				}
				Count = Count +1;
			}
			for(int i= 0 ;i<b ;i++) {
				if (Count == s) {
				break;
				}else {
					N-=1;
				}
				Count = Count +1;
			}
			for(int i= 0 ;i<c  && Count2<s;i++) {
				if (Count2 == s) {
				break;
				}else {
					B+=1;
				}
				Count2 = Count2 +1;
			}
			for(int i= 0 ;i<d ;i++) {
				if (Count2 == s) {
				break;
				}else {
					B-=1;
				}
				Count2 = Count2 +1;
			}
		}

if ( N > B ) {
	System.out.println("Nikky");
}else if ( B > N) {
	System.out.println("Byron");
}else {
	System.out.println("Tied");
}
		
	}

}
