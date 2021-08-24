import java.util.Scanner;

public class ccc15s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int j = sc.nextInt();
		int a = sc.nextInt();
		String[] size = new String[j];
		for(int i=0;i<j;i++) {
			size[i] = sc.nextLine();
		}
		int count =0;
		for(int i=0;i<a;i++) {
			String s  = sc.nextLine();
			String[]cmd = s.split(" ");
			String asize = cmd[0];
			int number = Integer.parseInt(cmd[1]);
			if(asize.equals("S")) {
				if(!size[number-1].equals("T")) {
					size[number-1] = "T";
					count++;
				}
			}
			else if(asize.equals("M")) {
				if(size[number-1].equals("L")||size[number-1].equals("M")) {
					size[number-1] = "T";
					count++;
				}
			}
			else if(asize.equals("L")) {
				if(size[number-1].equals("L")) {
					size[number-1] = "T";
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
