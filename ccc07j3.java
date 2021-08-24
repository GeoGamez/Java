import java.util.Scanner;

public class ccc07j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Amount = sc.nextInt();
		int Money = 0;
		for (int i = 0; i< Amount;i++){
			int Bag = sc.nextInt();
			if( Bag == 1) {
				Money = Money + 100;
			}
			if( Bag == 2) {
				Money = Money + 500;
			}
			if( Bag == 3) {
				Money = Money + 1000;
			}
			if( Bag == 4) {
				Money = Money + 5000;
			}
			if( Bag == 5) {
				Money = Money + 10000;
			}
			if( Bag == 6) {
				Money = Money + 25000;
			}
			if( Bag == 7) {
				Money = Money + 50000;
			}
			if( Bag == 8) {
				Money = Money + 100000;
			}
			if( Bag == 9) {
				Money = Money + 500000;
			}
			if( Bag == 10) {
				Money = Money + 1000000;
			}
		}
		int Bank = sc.nextInt();
		if (Math.round((1691600-Money)/Amount)<= Bank) {
			System.out.println("deal");
		}else {
			System.out.println("no deal");
		}

	}

}
