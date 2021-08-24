import java.util.Arrays;
import java.util.Scanner;
public class ccc18s1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
        int[] points = new int[N];
        for(int i = 0; i < N; i++) {
        	points[i] = sc.nextInt();;
        }
        Arrays.sort(points);
        double[] dists = new double[N-2];
        for(int i = 0; i < N - 2; i++) {
        	dists[i] = (points[i+2] - points[i+1])/2.0 + (points[i+1] - points[i])/2.0;
        }
        Arrays.sort(dists);
    	System.out.println(String.format("%.1f", dists[0]));
	}

}
