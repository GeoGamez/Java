import java.util.Scanner;

public class ccc08j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();		
		float H = sc.nextFloat();
		if( (W/(H*H) >=18.5 ) && (W/(H*H))<=25.0) {
			System.out.println("Normal weight");
		} else if((W/(H*H)) > 25.0) {
			System.out.println("Overweight");
		}else if ( (W/(H*H)) <18.5 ) {
			System.out.println("Underweight");
		}

	}

}
