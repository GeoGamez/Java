import java.util.Scanner;

public class ccc13S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
				 boolean done = false;
				if (Y >= 2) {
				  for(int i=Y+1; i<Y*2 ;i++) {
				  String year = Integer.toString(i);
				   boolean valid = true;
				    for (int j=0;j<year.length();j++) {
				      for(int k=j+1;k<year.length();k++) {
				        if (year.charAt(j) == year.charAt(k) && j != k) {
				          valid = false;
				          break;
				        }
				      }
				      if (valid == false){
				        break;
				      }
				    }
				    if (valid == true) {
				    	System.out.println(i);
				      break;
				    }
				    }
				  }else {
				System.out.println(Y+1);
				  }
	}

}
