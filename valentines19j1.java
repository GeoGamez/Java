import java.util.Scanner;

public class valentines19j1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		   int S = sc.nextInt();
		   for (int i = 0 ;i<S ;i++) {
			  int I = sc.nextInt();
			  if (I <1000) {
				 System.out.println("Newbie");
			  }
			  if (I >=1000 && I<=1199) {
				 System.out.println("Amateur");
			  }
			  if (I >=1200 && I<=1499) {
				 System.out.println("Expert");
			  }
			  if (I >=1500 && I<=1799) {
				 System.out.println("Candidate Master");
			  }
			  if (I >=1800 && I<=2199) {
				 System.out.println("Master");
			  }
			  if (I >=2200 && I<=2999) {
				 System.out.println("Grandmaster");
			  }
			  if (I >=3000 && I<=3999) {
				 System.out.println("Target");
			  }
			  if (I >=4000) {
				 System.out.println("Rainbow Master");
			  }
		   }
	}

}
