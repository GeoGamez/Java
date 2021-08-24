import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
public class bfstest {
/*XXOMOO
XOOXOO
OOOOOO*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 char[][]map = new char [3][6];
	        for(int i =0;i<3;i++){
	          map[i] = sc.next().toCharArray();
	        }
	      int [][] step=new int [3][6];
	      for(int i=0;i<3;i++){
	        Arrays.fill(step[i],Integer.MAX_VALUE);
	      }
	      LinkedList<Integer> rQ = new LinkedList<Integer>();
	      LinkedList<Integer> cQ = new LinkedList<Integer>();

	      for(int r=0;r<3;r++) {
	    	  for(int c=0;c<6;c++) {
	    		  if (map[r][c]=='M') {
	    			  step[r][c]=0;
	    			  rQ.add(r);
	    			  cQ.add(c);
	    		  }
	    	  }
	      }
	      while (!rQ.isEmpty()){
	          while (!cQ.isEmpty()){
	        	  int r = rQ.poll();
	              int c = cQ.poll();
	              if(map[r][c]=='M'||map[r][c]=='O') {
	              if (r-1>=0 &&step[r-1][c]>step[r][c]+1){
	            		step[r-1][c] = step[r][c]+1;
	            		rQ.add(r-1);
	            		cQ.add(c);
	            	}
	              if (r+1<3 &&step[r+1][c]>step[r][c]+1){
	            		step[r+1][c] = step[r][c]+1;
	            		rQ.add(r+1);
	            		cQ.add(c);
	            	}
	              if (c+1<6 &&step[r][c+1]>step[r][c]+1){
	            		step[r][c+1] = step[r][c]+1;
	            		rQ.add(r);
	            		cQ.add(c+1);
	            	}
	              if (c-1>=0 &&step[r][c-1]>step[r][c]+1){
	            		step[r][c-1] = step[r][c]+1;
	            		rQ.add(r);
	            		cQ.add(c-1);
	              }
	              }
	              if(map[r][c]=='X') {
	            if (r-1>=0 &&c-1>=0 && step [r-1][c-1]>step[r][c]+1) {
	            	step[r-1][c-1]= step[r][c]+1;
	            	rQ.add(r-1);
	            	cQ.add(c-1);
	            }
	            if (r-1>=0 &&c+1<6 && step [r-1][c+1]>step[r][c]+1) {
	            	step[r-1][c+1]= step[r][c]+1;
	            	rQ.add(r-1);
	            	cQ.add(c+1);
	            }
	            if (r+1<3 &&c-1>=0  && step [r+1][c-1]>step[r][c]+1) {
	            	step[r+1][c-1]= step[r][c]+1;
	            	rQ.add(r+1);
	            	cQ.add(c-1);
	            }
	            if (r+1<3 &&c+1<6  && step [r+1][c+1]>step[r][c]+1) {
	            	step[r+1][c+1]= step[r][c]+1;
	            	rQ.add(r+1);
	            	cQ.add(c+1);
	            }
	            	}
	          
	              }
	          }       
	      System.out.println(step[2][5]);
	}

}
