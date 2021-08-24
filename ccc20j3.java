import java.util.Scanner;

public class ccc20j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Amount = sc.nextInt();
		String X = "";
		String Y = "";
		int BX = 1;
		int BY = 1;
		int SX = 99;
		int SY = 99;
		for(int i=0; i< Amount;i++) {
			String XY= sc.next();
			for (int j = 0 ;j< XY.length();j++) {
				if (XY.charAt(j) == ',') {
					if (j-1 == 0) {
						X = String.valueOf(XY.charAt(j-1));
					}else if (j-2 == 0) {
							X = String.valueOf(XY.charAt(j-2)) + String.valueOf(XY.charAt(j-1));
					}
					if(XY.length()-2==j) {
						Y = String.valueOf(XY.charAt(XY.length()-1));
					}else if((XY.length()-3==j)) {
						Y = String.valueOf(XY.charAt(XY.length()-2)+String.valueOf(XY.charAt(XY.length()-1)));
					}
				}
			}
			if (BX< Integer.parseInt(X)) {
				BX=Integer.parseInt(X);
			}
			if (BY< Integer.parseInt(Y)) {
				BY=Integer.parseInt(Y);
			}
			if (SX> Integer.parseInt(X)) {
				SX = Integer.parseInt(X);
			}
			if (SY> Integer.parseInt(Y)) {
				SY = Integer.parseInt(Y);
			}
		}
		System.out.println((SX-1)+","+(SY-1));
		System.out.println((BX+1)+","+(BY+1));
	}

}
