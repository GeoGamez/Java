
public class ccc07s1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i=0; i<x; i++) {
			int year=sc.nextInt();
			int month=sc.nextInt();
			int day=sc.nextInt();
			boolean adult = false;
			if (year<1989)
				adult = true;
			if (year==1989 && month<2)	
				adult = true;
			if (year==1989 && month==2 && day<=27)	
				adult = true;
			if (adult)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
