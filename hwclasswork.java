import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class hwclasswork {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int [][] a = new int [3][5];
		for (int r=0;r<3;r++) {
			for(int c=0;c<5;c++) {
			a[r][c]=sc.nextInt();
			}
		}
		for (int r=0;r<3;r++) {
			for(int c=0;c<5;c++) {
if(a[r][c]%2==0) {
	a[r][c]= a[r][c]+5;
}
			}
		}
		int sum=0;
		for (int r=0;r<3;r++) {
			for(int c=0;c<5;c++) {
sum= a[r][c]+sum;
			}
		}
		System.out.println(sum);
		
		//2
		char[][] b = new char [5][4];
		for (int r=0;r<5;r++) {
			b[r]=sc.next().toCharArray();
		}
		
		for (int r=0;r<5;r++) {
			for(int c=0;c<4;c++) {
				if (b[r][c]=='A') {
					b[r][c]='Q';
				}
			}
			}
		for (int r=0;r<5;r++) {
			for(int c=0;c<4;c++) {
			System.out.print(b[r][c]+" ");
			}
			System.out.println();
		}
		//3
		int [][] c1 = new int [4][5];
		for (int r=0;r<4;r++) {
			for(int c=0;c<5;c++) {
			c1[r][c]=sc.nextInt();
			}
		}
		for (int r=0;r<4;r++) {
			for(int c=0;c<5;c++) {
if(c1[r][c]%2==0) {
	c1[r][c]= c1[r][c]+5;
}else {
	c1[r][c]=c1[r][c]+2;
}
			}
		}
int big = c1[1][1];
		for (int r=0;r<4;r++) {
			for(int c=0;c<5;c++) {
if (big<c1[r][c]) {
	big= c1[r][c];
}
			}
		}
		System.out.println(big);
		//4
		 int[][]step = new int[3][3];

		 for(int r=0;r<3;r++) {
	        Arrays.fill(step[r],Integer.MAX_VALUE);a
		 }
	        step[0][0]=0;
	        LinkedList<Integer> row = new LinkedList<Integer>();
	        row.add(0);
	        LinkedList<Integer> col = new LinkedList<Integer>();
	        col.add(0);
	        //
	        int Q=sc.nextInt();
	        int N = sc.nextInt();
	        int[] D new int [N];
	        int[] P new int [N];
	        for(int i=0;i<N;i++) {
	        	D[N] =sc.nextInt();
	        }
	        for(int i=0;i<N;i++) {
	        	P[N] =sc.nextInt();
	        }
Arrays.sort(D);
Arrays.sort(P);
int sum =0;
if (Q==1) {
    for(int i=0; i<N; i++){
      if (D[i]>=P[i]) {
         sum+=D[i];
      } else {
         sum+=P[i];
      }
    }
} else {
     for(int i=0; i<N; i++){
      if (D[i]>=P[N-1-i]) {
         sum+=D[i];
      } else {
         sum+=P[N-1-i];
      }
    }
}

System.out.println(sum);
	}

}
