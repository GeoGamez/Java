import java.util.Scanner;

public class ccc17j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int StartX = 0;
		int StartY = 0;
		int EndX = 0;
		int EndY = 0;
		int Fuel = 0;
		int DifferenceX = 0;
		int DifferenceY = 0;
		DifferenceX=Math.abs(EndX - StartX);
		DifferenceY=Math.abs(EndY - StartY);
		int TDifference = DifferenceX + DifferenceY;
		if (Fuel>= TDifference &&(Fuel-TDifference)%2==0){
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
			
	}

}
