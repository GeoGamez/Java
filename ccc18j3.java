import java.util.Scanner;

public class ccc18j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int City1 = sc.nextInt();
		int City2 = sc.nextInt();
		int City3 = sc.nextInt();
		int City4 = sc.nextInt();
		int a1 = 0;
		int b1 = City1;
		int c1 =City1 +City2;
		int d1 =City1 +City2+ City3;
		int e1 =City1 + City2+ City3 + City4;
		int f1 = City2+City3+City4;
		System.out.println(a1+" "+b1+" "+c1+" "+d1+" "+e1);
		System.out.println(b1+" "+a1+" "+City2+" "+(City2+City3)+" "+f1);
		System.out.println(c1+" "+City2+" "+a1+" "+City3+" "+(City3 + City4));
		System.out.println(d1+" "+(City2+City3)+" "+City3+" "+a1+" "+City4);
		System.out.println(e1+" "+f1+" "+(City3 + City4)+" "+City4+" "+a1);
	}

}
