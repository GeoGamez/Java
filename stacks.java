	import java.util.LinkedList;
	import java.util.*;

public class stacks {

	  public static void main(String[] args) {
	       int[] A = {1,2,3,4,5,6,7};
	       //LinkedList   first in first out
	       System.out.println("This is LinkedList");
	       LinkedList<Integer> list  = new LinkedList<Integer>();
	       for (int i:A) {
	          list.add(i);
	       }
	       while (!list.isEmpty()) {
	          System.out.println(list.poll());
	       }
	         
	    
	       //Stack
	       //Stack first in last out
	       System.out.println("This is Stack");
	       Stack<Integer> st  = new Stack<Integer>();
	       for (int i:A) {
	          st.add(i);
	       }
	       while (!st.isEmpty()) {
	          System.out.println(st.pop());
	       }
	        
	  }      
	} 