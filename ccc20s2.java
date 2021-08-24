import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class ccc20s2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    
		    int M = sc.nextInt();
		    int N = sc.nextInt();
		    
		    int map[][] = new int[M+1][N+1];
		    
		    for(int r = 1; r<M+1; r++){
		      for(int c = 1; c<N+1; c++){
		        map[r][c]=sc.nextInt();	
		      }
		    }
		    int step[][]=new int [M+1] [N+1];
		    for(int i=0;i<M+1;i++) {
		    	Arrays.fill(step[i],Integer.MAX_VALUE);
		    }
		    step[1][1]=0;
		    LinkedList<Integer> qr	=new LinkedList<Integer>();
		    LinkedList<Integer> qc	=new LinkedList<Integer>();
		    qr.add(1);
		    qc.add(1);
		    boolean[] visited=new boolean[1000001];
		    while(!qr.isEmpty()) {
		    	int Row= qr.poll();
		    	int Col = qc.poll();
		    	
		    	int Number= map[Row][Col];
		    	if (!visited [Number]) {
		    		visited[Number]=true;
		    	}
		    	for(int r=1;r<=Math.sqrt(Number);r++) {
		    		if(Number%r==0) {
		    			int c=(Number/r);
		    			if(r<M+1 && c<N+1 &&step[r][c]>step[Row][Col]+1) {
		    				step[r][c]=step[Row][Col]+1;
		    				step[r][c]=step[Row][Col]+1;
		    				qr.add(r);
		    				qc.add(c);
		    			}
		    			if(c<M+1&&r<N+1 && step[c][r]>step[Row][Col]+1) {
		    				step[c][r]=step[Row][Col]+1;
		    				step[c][r]=step[Row][Col]+1;
		    				qr.add(c);
		    				qc.add(r);
		    			}
		    		}
		    	}
		    }
		 if(step[M][N]!=Integer.MAX_VALUE) {
			 System.out.println("yes");
		    }else{
		      System.out.println("no");
		    }
		 }
	}


