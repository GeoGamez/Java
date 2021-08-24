import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	int A= sc.nextInt();
	int [] C= new int [A+1];
	int [] B= new int [A];
	for(int i=0;i<A+1;i++) {
		C[i] =sc.nextInt();
	}
	for(int i=0;i<A;i++) {
		B[i] =sc.nextInt();
	}
	float sum=0;
for (int i=0;i<A;i++) {
sum = (float)sum + B[i]*(C[i]+C[i+1])/(float)2;
}
System.out.println(sum);
	}

}