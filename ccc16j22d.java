import java.util.Scanner;

public class ccc16j22d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total=0;
		int counter =0;
		int loop =0;
		int [][] square= new int [4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				square[i][j] =sc.nextInt();
			}
		}
		 for(int i =0;i<4;i++){
	           for(int j = 0; j<4;j++){
	            total= total+ square[i][j];
	            loop++;
	            if (loop ==4) {
	            	if (total ==34) {
	            		counter++;
	            		total =0;
	            	}
	            	loop=0;
	            }
	             }

	}
		 for(int j =0;j<4;j++){
	           for(int i = 0; i<4;i++){
		            total= total+ square[i][j];
		            loop++;
		            if (loop ==4) {
		            	if (total ==34) {
		            		counter++;
		            		total =0;
		            	}
		            	loop=0;
		            }
	             }
		 }
	           
	           if (counter ==8) {
	        	   System.out.println("magic");
	           }else {
	        	   System.out.println("not magic");
	           }

	}

}

