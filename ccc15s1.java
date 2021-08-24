
import java.util.ArrayList;
import java.util.Scanner;
public class ccc15s1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x == 0)
				list.remove(list.size() - 1);
			else
				list.add(x);
		}
		int sum = 0;
		for (int i = 0; i < list.size(); i++)
			sum += list.get(i);
		System.out.println(sum);

	}

}
