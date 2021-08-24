import java.util.Scanner;

public class ccc18j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int [][] a = new int [n][n];
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		a[i][j] =sc.nextInt();
	}
}

int i,j;
if (a[0][0]<a[0][n-1]) {
	j=0;
}else {
	j=n-1;
}
if (a[0][j]<a[n-1][j]) {
	i=0;
}else {
	i=n-1;
}
if(i==0&& j ==0) {
	for (int x=0;x<n;x++) {
		for(int y=0;y<n;y++) {
			System.out.print(a[x][y]);
			System.out.print(" ");
		}
		System.out.println();
	}
}else if ( i ==0 && j>0) {
	for (int y=n-1;y>=0;y--) {
		for(int x=0;x<n;x++) {
			System.out.print(a[x][y]);
			System.out.print(" ");
		}
		System.out.println();
	}
}else if ( i >n && j>n) {
	for (int x=n-1;x>=0;x--) {
		for(int y=n-1;y>=0;y--) {
			System.out.print(a[x][y]);
			System.out.print(" ");
		}
		System.out.println();
	
	}
}else {
		for (int y=0;y<n;y++) {
			for(int x=n-1;x>=0;x--) {
				System.out.print(a[x][y]);
				System.out.print(" ");
			}
			System.out.println();
		
		}
	}
	}
}
	

