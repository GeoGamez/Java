import java.util.LinkedList;
import java.util.Scanner;

public class hwdec2020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int SUM=0;
        LinkedList<Integer> Lonk = new LinkedList<Integer>();
        for(int i=0;i<7;i++) {
        	Lonk.add(sc.nextInt());
        }
        for(int i=0;i<7;i++) {
        	SUM = SUM+Lonk.poll();
        }
        System.out.println(SUM);
        int [][] a = new int [3][5];
		for(int r=0;r<3;r++) {
			for(int c=0;c<5;c++) {
				a[3][5] =sc.nextInt();
			}
		}
		int R=0;
		int C=0;
		int Small= Integer.MAX_VALUE;
		for(int r=0;r<3;r++) {
			for(int c=0;c<5;c++) {
		if (a[r][c]< Small) {
			Small= a[r][c];
			R=r;
			C=c;
		}
			}
		}
		int sum= 0;
		sum=a[R-1][C]+a[R][C-1]+a[R+1][C]+a[R][C+1];
		System.out.println(sum);
	}

}
