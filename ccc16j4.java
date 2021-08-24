import java.util.Scanner;

public class ccc16j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
	    String[] A = S.split(":");
	    int hour = Integer.parseInt(A[0]);
	    int minute = Integer.parseInt(A[1]);
				int dep =  hour*60 + minute;
			int	arrival = dep;
				int factor = 0;
				for (int i=dep;i<dep+120;i++) {
				  if (arrival >= 420 && arrival < 600) {
				    arrival += 2;
				  } else if(arrival >= 900 && arrival < 1140){
				    arrival += 2;
				  }  else {
				    arrival += 1;
				  }
				  if( arrival == 1440) {
				    arrival = 0;
				  }
				}
				while( arrival >= 60) {
				  arrival -=60;
				  factor += 1;
				  if (arrival <60) {
				    break;
				  }
				}
				  
				minute = arrival;
				if( factor < 10) {
				  factor = '0'+factor;
				}
				if (minute < 10) {
				  minute = '0'+minute;
				}
				System.out.println (factor+":"+minute);
		
				
				
				import java.util.Scanner;

				public class ccc15j4 {
				  public static void main(String[] args) {
				    Scanner sc= new Scanner(System.in);
				    int[] R = new int[101];  //receiving time
				    int[] S = new int[101];  //reply time
				    int[] W = new int[101];  //total waiting time
				    
				    int M = sc.nextInt(); 
				    int time = 0;
				  }
				}
	}

}

