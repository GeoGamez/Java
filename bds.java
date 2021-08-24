import java.util.LinkedList;

public class bds {

	public static void main(String[] args) {
		  boolean[][]map = new boolean [5][5];
		    map[0][1]=map[1][0]=true;
		    map[0][4]=map[4][0]=true;
		    map[0][2]=map[2][0]=true;
		    map[1][2]=map[2][1]=true;
		    map[2][3]=map[3][2]=true;
		    map[2][4]=map[4][2]=true;
		    map[3][4]=map[3][4]=true;
		    
		    
		    
		    boolean [][]map=new boolean[5][5];
		    map[0][1]=map[1][0]=true;
		    map[0][4]=map[4][0]=true;
		    map[2][1]=map[1][2]=true;
		    map[1][4]=map[1][4]=true;
		    map[4][2]=map[2][4]=true;
		    map[4][3]=map[3][4]=true;
		    map[2][3]=map[3][2]=true;
		    //Create a step array
		    int[] step = new int[5];
		    step[0]=Arrays.fill(Integer);
		    //Create a queue
		    LinkedList<Integer> queue = new LinkedList<Integer>();
		    queue.add(0);
		    
		    while (!queue.isEmpty()) {
		        int curV = queue.poll();   //read one vertice from queue and remove it
		        
		        //get the neighbors
		        //update neighbor step value equals to curV step value + 1
		        //Add neighbor into queue
		      
		        for (int neighbor = 0; neighbor<5; neighbor++) {
		          if (map[curV][neighbor]==true) {
		              step[neighbor] = step[curV]+10;
		          }
		        }
		        
		      //create 2D boolean array for the map
		        //Create a step array
		        //Create LinkedList queue
		        //find neighbours and update the step value and store neighbor into queue
		       
		        
		        
		        
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
		              if (r-1>=0 &&map[r-1][c]!='X'&&step[r-1][c]>step[r][c]+1){
		            		step[r-1][c] = step[r][c]+1;
		            		rQ.add(r-1);
		            		cQ.add(c);
		            	}
		              if (r+1<3 &&map[r+1][c]!='X'&&step[r+1][c]>step[r][c]+1){
		            		step[r-1][c] = step[r][c]+1;
		            		rQ.add(r+1);
		            		cQ.add(c);
		            	}
		              if (c+1<6 &&map[r][c+1]!='X'&&step[r][c+1]>step[r][c]+1){
		            		step[r-1][c] = step[r][c]+1;
		            		rQ.add(r);
		            		cQ.add(c+1);
		            	}
		              if (c-1>=0 &&map[r][c-1]!='X'&&step[r][c-1]>step[r][c]+1){
		            		step[r-1][c] = step[r][c]+1;
		            		rQ.add(r);
		            		cQ.add(c-1);
		            	}
		              }
		          }
	}

}
