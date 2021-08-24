import java.util.HashMap;
import java.util.Scanner;

public class ccc12s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	      map.put('I',1);
	      map.put('V',5);
	      map.put('X',10);
	      map.put('L',50);
	      map.put('C',100);
	      map.put('D',500);
	      map.put('M',1000);
		String input = sc.next();
		int sum=0;
		int pre = 0;
		for(int i=input.length()-1;i>=0;i-=2) {
			int R= map.get(input.charAt(i));
			int A = input.charAt(i-1)-'0';
			if (pre>R) {
				sum-= A*R;
			}else {
				sum+= A*R;
			}
			pre =R;
		}
		System.out.println()sum;
	}

}
