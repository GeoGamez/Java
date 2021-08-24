import java.util.Scanner;

public class ccc13j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int T = sc.nextInt();
		    int N = sc.nextInt();
		    int[] chore =  new int [N];
		    for(int i=0; i<T;i++){
		      chore[i]=sc.nextInt();
		    }
		    Arrays.sort(chore);
		    int time =0;
		    int count =0;
		    for (int i=0;i<c;i++){
		      if (time+chore[i]<= t){
		        time+=chore[i];
		      }
		    }
		    System.out.println(count);
		    
		    
	}

}
