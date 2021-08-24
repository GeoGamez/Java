
public class ccc09s2 {

	public static void main(String[] args) {
	    String S = "WELCOME TO CCC GOOD LUCK TODAY";
	    String[] A = S.split(" ");
	    Scanner sc = new Scanner(System.in);
	    int w = sc.nextInt();    //letter count
	    LinkedList<String> currentLine = new LinkedList<String>();
	    int total = 0;
	    for (int i=0; i<A.length; i++) {
	      if (total==0 ) {//first word at current line
	        currentLine.add(A[i]);
	        total = A[i].length();
	      } else if (total+A[i].length()+1<=w) {
	        currentLine.add(A[i]);
	        total = total +A[i].length()+1;
	      } else {
	        print(currentLine, w);
	        currentLine = new LinkedList<String>();
	        currentLine.add(A[i]);
	        total = A[i].length();
	      }
	      if (i==A.length-1) {
	        print(currentLine,w);
	      }

	    }

	  }

	  public static void print(LinkedList<String> l, int w) {
	    int size = l.size();
	    if (size==1) {
	      System.out.print(l.get(0));
	      for (int j=0; j<w-l.get(0).length();j++) {
	        System.out.print(".");
	      }
	      System.out.println();
	      return;
	    } 
	    int totalL = 0;
	    for (int j=0; j<l.size(); j++) {
	      totalL = totalL+l.get(j).length();
	    }
	    int totalDot = w-totalL;
	    int[] dot = new int[l.size()-1];
	    for (int j=0; j<totalDot; j++) {
	      dot[j%(l.size()-1)]++;
	    }
//	    int dot1 = dot/(l.size()-1);
//	    int dot2 = dot%(l.size()-1);
	    for (int j=0; j<l.size(); j++) {
	      if (j!=0) {
	        int dotNeed = dot[j-1];
	        for (int k=0; k<dotNeed; k++) {
	          System.out.print(".");
	        }
	        
	      }
	      System.out.print(l.get(j));
	    }
	    System.out.println();
	  }
	}

	}

}
