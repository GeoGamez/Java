import java.util.Scanner;

public class testinggrounds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input 3*5 number and store into 2D array
	       //output the sum of numbers which can be divided by 3
		  int [] [] KA = new int [3][5];
		    for (int r =0;r< 3;r++){
		      for(int c=0;c<5;c++){
		        KA[r][c]=sc.nextInt();
		      }
		    }
		    int sum =0;
		    for (int r =0;r<3;r++){
			      for(int c=0;c<5;c++){
			        if(KA[r][c]%3==0) {
			        	sum = sum + KA[r][c];
			        }
			      }
			    }
		    System.out.println(sum);
		       //input 4 Strings and each String has 5 letters
		       //store the 4 Strings into 2D char array
		       //find out all the position for letter "A"
	         char[][]map = new char [4][5];
	         for (int r =0;r<4;r++){
	        	 map[r] = sc.next().toCharArray();
	}
	         for (int r =0;r<4;r++){
			      for(int c=0;c<5;c++){
			        if(map[r][c]=='A') {
			        	System.out.println("Row "+ r + "Col "+ c);
			        }
			      }
			    }
	         
}
}