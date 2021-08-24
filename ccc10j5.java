import java.util.LinkedList;

public class ccc10j5 {

	public static void main(String[] args) {
		int br = sc.nextInt()-1;
		int bc=sc.nextInt()-1;
		int er=sc.nextInt()-1;
		int ec =sc.nextInt()-1;
		int[][] step =new int[8][8];
		for(int i=0;i<8;i++) {
			Arrays.fill(step[i],Integer.MAX_VALUE);
		}
		step[br][bc]=0;
		LinkedList<Integer> rQ = new LinkedList<Integer>();
		LinkedList<Integer> cQ = new LinkedList<Integer>();
		rQ.add(br);
		cQ.add(bc);
		
		
	    while (!rQ.isEmpty()) {
	        int r = rQ.poll();   //read current position's row value
	        int c = cQ.poll();   //read curren0t position's col value
	       
	        //How many neighbor
	        //1  r-2, c+1
	        //1.1 check if neighbor is valid neighbor
	        //    if neighbor index not go outside the boundary
	        //    if neighbor step value bigger than current step value + 1 
	        if (r-2>=0 && c+1<8 && step[r-2][c+1]>step[r][c]+1) {
	            step[r-2][c+1] = step[r][c]+1;
	            rQ.add(r-2);
	            cQ.add (c+1);
	        }
	       
	        //2. Felix
	        // r-1,c+2  
	       if (r-1>=0 && c+2<8 && step[r-1][c+2]>step[r][c]+1) {
	         step[r-1][c+2]=step[r][c]+1;
	         rQ.add(r-1);
	         cQ.add(c+2);
	       }
	   
	       
	        //3  Ben
	        // r+1, c+2
	       if(r+1<8 && c+2<8 && step[r+1][c+2]>step[r][c]+1){
	         step[r+1][c+2] = step[r][c]+1;
	         rQ.add(r+1);
	         cQ.add(c+2);
	       }
	       
	        //4  Kevin
	        // r+2,c+1 
	       if (r+2<8 && c+1<8 && step[r+2][c+1]>step[r][c]+1){
	          step[r+2][c+1]=step[r][c]+1;
	          rQ.add(r+2);
	          cQ.add(c+1);
	       }
	       
	        //5  Eric    r+2, c-1
	        if (r+2<8 && c-1>=0 && step[r+2][c-1]>step[r][c]){
	          step[r+2][c-1] = step[r][c];
	          rQ.add(r+2);
	          cQ.add(c-1);
	       }
	        //6  Justin
	        //r+1, c-2
	       if(r+1<8 &&c-2>=0 &&step[r+1][c-2]>step[r][c]){
	           step[r+1][c-2] = step[r][c]+1;
	         rQ.add(r+1);
	         cQ.add(c-2);
	       }
	       
	        //7  Garret
	        //r-1, c-2
	          if(r-1>=0 && c-2>=0 && step[r-1][c-2]>step[r][c]+1){
	           step[r-1][c-2]=step[r][c]+1;
	            rQ.add(r-1);
	            cQ.add(c-2);
	          }
	       
	       
	        //8  Nicholas
	       
	       
	       
	        //r-2, c-1
	         if (r-2>=0 && c-1>=0 && step[r-2][c-1]>step[r][c]+1) {
	           step[r-2][c-1]=step[r][c]+1;
	           rQ.add(r-2);
	           cQ.add(c-1);
	         }
	     
	      }
	         
	      // for (int r=0; r<8; r++) {
	      //    for (int c=0; c<8; c++) {
	      //       System.out.print(step[r][c]+" ");
	      //    }
	      //    System.out.println();

	     
	      System.out.println(step[er][ec]);
	   }
	 }
		
	}

}
