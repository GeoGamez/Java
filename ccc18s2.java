import java.util.Scanner;
import java.util.LinkedList;
public class ccc18s2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.nextLine();
	    boolean [][] data = new boolean[n+1][n+1];
	    for (int i = 1; i <= n; i++) {
	    	String line[] = sc.nextLine().split(" ");
	    	for(int j = 1; j <= Integer.parseInt(line[0]); j++) {
	    		data[i][Integer.parseInt(line[j])] = true;
	    	}
	    }
	    boolean[] visited = new boolean[n+1];
	    int[] dist = new int[n+1];
	    LinkedList<Integer> q = new LinkedList<Integer>();
	    q.addLast(1);
	    dist[1] = 1;
	    int shortestEnding = n+1;
	    while(!q.isEmpty()) {
	    	int x = q.removeFirst();
	    	if(visited[x]) {
	    		continue;
	    	}else {
	    		visited[x] = true;
	    		boolean hasNeighbour = false;
	    		for(int i = 1; i <= n;i++) {
	    			if(data[x][i]) {
	    				hasNeighbour = true;
	    				if(dist[i] == 0) dist[i] = 1 + dist[x];
	    				q.addLast(i);
	    			}
	    		}
	    		if(!hasNeighbour && shortestEnding > dist[x]) {
	    			shortestEnding = dist[x];
	    		}
	    	}
	    }
	    boolean good = true;
	    for(int i = 1; i <=n; i++) {
	    	if(!visited[i]) good  = false;
	    }
	    System.out.println(good ? "Y" : "N");
		System.out.println(shortestEnding);
		sc.close();
	}

}
