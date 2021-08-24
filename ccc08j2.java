import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class ccc08j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> CD = new LinkedList<>();
		CD.add("A");
		CD.add("B");
		CD.add("C");
		CD.add("D");
		CD.add("E");
		String F = "";
		while(true) {
			int N = sc.nextInt();
			int C = sc.nextInt();
			if (N == 1) {
				for( int i = 0; i< C; i++) {
					F = CD.remove(0);
					CD.add(F);
				}
			}
			if (N == 2) {
				for( int i = 0; i< C; i++) {
					F = CD.remove(4);
					CD.add(0,F);
				}
			}
			if (N == 3) {
				for( int i = 0; i< C; i++) {
					F = CD.remove(0);
					CD.add(1,F);
				}
			}
			if (N == 4) {
				break;
			}
		}
		   for (int i = 0; i<5;i++){
			    System.out.print(CD.get(i)+" ");
			    
			             }
	}

}
