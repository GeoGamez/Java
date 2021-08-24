import java.util.List;
import java.util.Scanner;

public class ccc14s2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int count = 0;
	    String[] arr1 = new String[a];
	    String[] arr2 = new String[a];
	    List<String> list1 = Arrays.asList(arr1);
	    List<String> list2 = Arrays.asList(arr2);
	    for(int i=0;i<a;i++){
	      arr1[i] = sc.next();
	    }
	    for(int i=0;i<a;i++){
	      arr2[i] = sc.next();
	    }
	    
	    for(int i=0;i<a;i++){
	      String temp = list1[i]; 
	      String temp2 = list2[i];
	      boolean cont = list1.contains(say.getText());
	      if(count = a) {
	    	  System.out.println("good");
	      }else {
	    	  System.out.prinln("bad");
	      }
	    }
	}

}
