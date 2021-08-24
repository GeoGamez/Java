import java.util.Arrays; 
import java.util.LinkedList;

public class bfswholething {

	public static void main(String[] args) {
		// 1 using 2D boolean array to store the graph
		int v= 5;
        boolean[][]map =	new boolean[v][v];
        map[0][1]= map[1][0]=true;
        map[0][2]= map[2][0]=true;
        map[2][4]= map[4][2]=true;
        map[2][3]= map[3][2]=true;
        map[1][2]= map[2][1]=true;
        map[3][4]= map[4][3]=true;
        //2 step array
        int[]step = new int[v];
        Arrays.fill(step,Integer.MAX_VALUE);
        step[0]=0;
        
        //3 Linkedlist to store process order
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        
        //using while loop to check if queue is empty otherwise read first vertex and remove it 
        //find out this vertex's all the unvistited neighbour 
        //update all the unvisted neighbour's step value by 1 add the neigbour into queue
        while(!queue.isEmpty()) {
        	int curV = queue.poll();
        	//find neighbour
        	for (int neighV= 0;neighV<V;neighV++) {
        		if (map[curV][neighV]==true &&step[neighV]>[curvV +1]) {
        			step[neighV]= step[curV]+1;
        			queue.add(neighV);
        		}
        	}
        }
        for(int i=0;i<V;i++) {
        	  System.out.println(step[i]+" ");
        }
	}

}
