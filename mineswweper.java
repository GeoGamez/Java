
public class mineswweper {

	public static void main(String[] args) {
		  int r=sc.nextInt();
		    int c=sc.nextInt();
		    char map = new char[r][c];
		    for(int i=0;i<r;i++){
		      sc.nextLine();
		      for(intj=0;j<c;j++){
		        map[i][j]=sc.nextLine().replace(" ","").toCharArray();
		      }
		    }
		              
		    int[][]step=new int[r][c];
		        for(int i=0;i<r;i++){
		          Arrays.fill(step[i], Integer.MAX_VALUE);
		        }
		      LinkedList<Integer>rQ= new LinkedList<Integer>();
		      LinkedList<Integer>cQ= new LinkedList<Integer>();
		              for(int i=0;i<r;i++){
		                for(int j=0;j<c;j++){
		                  if(map[i][j]=='M') {
		                	  step[i][j]=0;
		                	  rq.add(i);
		                	  cq.add(j);
		                  }else if(map[i][j]=='X') {
		                	  step[i][j]=-1;
		                  }else {
		                	  step[i][j]=Integer.MAX_VALUE;
		                  }
		                  while(!rq.isEmpty()) {
		                	  int rol=rq.poll();
		                	  int col=cq.poll();
		                	  if(rol>=0&&map[rol-1][col]==0 && [rol-1][col]>step[rol][col]+1) {
		                		  step[rol-1][col]=step[row][col]+1;
		                		  rq.add(rol-1);
		                		  cq.add(col);
		                	  }
		                	  if(col-1>=0&&map[rol][col-1]==0 && [rol][col-1]>step[rol][col]+1) {
		                		  step[rol][col-1]=step[rol][col]+1;
		                		  rq.add(rol);
		                		  cq.add(col-1);		                		  
		                	  }
		                	  if(rol+1<r&&map[rol+1][col]==0&&[rol+1][col]>step[rol][col]+1) {
		                		  step[rol+1][col]=step[row][col]+1;
		                		  rq.add(row+1);
		                		  cq.add(col);
		                	  }
		                	  if(col+1<c&&map[rol][col+1]==0&&[rol][col+1]>step[rol][col]+1) {
		                		  step[rol][col+1]=step[row][col]+1;
		                		  rq.add(rol);
		                		  cq.add(col+1);
		                	  }
		                  }
		                
	}

}
		              for (int r=0; r<R; r++) {
		                  for (int c=0; c<C; c++) {
		                    System.out.print(step[r][c]+" ");
		                  }
		                  System.out.println();
		                }
	}
}