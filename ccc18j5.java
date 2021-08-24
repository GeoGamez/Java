import java.util.LinkedList;
import java.util.Scanner;

public class ccc18j5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 boolean[] ending = new boolean[N];
int v = sc.nextInt();
boolean[][]map =	new boolean[v][v];
for(int i=0;i<N;i++) {
	int M = sc.nextInt();
	if(M==0) {
		ending[i]=true;
	}
	for(int j=0;j<M;j++) {
		int nextPage=sc.nextInt()-1;
		map[i][nextPage]=true;
	}
}
int [] step = new int[N];
Arrays.fill(step, Integer.MAX_VALUE);
step[0] = 1;

LinkedList<Integer> queue = new LinkedList<Integer>();
queue.add(0);  


while (!queue.isEmpty()) {   
    int curV = queue.poll();

    for (int neighV = 0; neighV<N; neighV++) {
        if (map[curV][neighV] == true && step[neighV]>step[curV]+1) {
            step[neighV] = step[curV]+1;
            queue.add(neighV);
        }
    } 
}

int min = Integer.MAX_VALUE;
boolean isReachable = true;
for (int i=0; i<N; i++) {
    if (step[i] == Integer.MAX_VALUE) {
        isReachable = false;
    }
    if (ending[i]==true && step[i]<min) {
       min = step[i];
    }
}

if (isReachable == true) {
   System.out.println("Y");
} else {
   System.out.println("N");
}

System.out.println(min);

}
} 
	}

}
