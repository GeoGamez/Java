import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

public class inclasswrok {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R= sc.nextInt();
		int C=sc.nextInt();
		char [][] map= new char [R][C];
		for(int i=0;i<R;i++) {
			map[i]= sc.next().toCharArray();
		}
		int[][]step =new int[R][C];
		for (int r =0;r<R;r++) {
			Arrays.fill(step[r],Integer.MAX_VALUE);
		}
		LinkedList<Integer> RQ= new LinkedList<>();
		LinkedList<Integer> CQ= new LinkedList<>();
		 int sR =0;
	      int sC =0;
		for(int r=0;r<R;r++) {
			for(int c=0;c<C;c++) {
			if(map[r][c]=='E') {
				step[r][c]=0;
				RQ.add(r);
				CQ.add(c);
			}else if (map[r][c] =='S') {   
	            sR = r;
	            sC = c;
	          }
			}
			}
		while(!RQ.isEmpty() &&!CQ.isEmpty() ) {
			int r= RQ.poll();
			int c= CQ.poll();
				 if (r-1>=0 &&step[r-1][c]>step[r][c]+1&&!(map[r-1][c]=='T')){
	            		step[r-1][c] = step[r][c]+1;
	            		RQ.add(r-1);
	            		CQ.add(c);
	            	}
	              if (r+1<R &&step[r+1][c]>step[r][c]+1&&!(map[r+1][c]=='T')){
	            		step[r+1][c] = step[r][c]+1;
	            		RQ.add(r+1);
	            		CQ.add(c);
	            	}
	              if (c+1<C &&step[r][c+1]>step[r][c]+1&&!(map[r][c+1]=='T')){
	            		step[r][c+1] = step[r][c]+1;
	            		RQ.add(r);
	            		CQ.add(c+1);
	            	}
	              if (c-1>=0 &&step[r][c-1]>step[r][c]+1&&!(map[r][c-1]=='T')){
	            		step[r][c-1] = step[r][c]+1;
	            		RQ.add(r);
	            		CQ.add(c-1);
	              }
	              }
		int sum=0;
		  for (int r=0; r<R; r++) {
		      for (int c=0; c<C; c++) {  
		         if(map[r][c]>='1'&&map[r][c]<='9'&&step[r][c]<=step[sR][sC]) {
		        	 sum+=map[r][c]-'0'; // using char number - char 0 makes an integer
		         }
		                            }
		                            }
		  System.out.println(sum);
			 }
		}
	
	

