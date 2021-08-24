import java.util.Scanner;

public class ccc17s1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			  int n =sc.nextInt();
			  

			  int [] swifts = new int [n];
			  int [] semaphores = new int [n];
			  
			  int a = 0;
			  int b = 0;
			  int k =0;
			  
			  for (int i = 0; i < n*2; i++) {
			    if (i < n) {
			    	swifts[i]=sc.nextInt();
			  }else{
				  semaphores[i % n]=sc.nextInt();
			  }
	}
	
			  
			  for (int i = 0; i < n; i ++)
			  {
			    if ((swifts[i] + a) == (semaphores[i] + b))
			    {
			      k = i + 1;
			    }
			  
			    a += swifts[i];
			    b += semaphores[i];
			  }
			  
			  System.out.println(k);
			}
	}


