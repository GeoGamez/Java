import java.util.Scanner;

public class ccc14s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int friend_no = sc.nextInt();

		int rounds = sc.nextInt();
		 int [] removal_values = new int [rounds];

		for(int i=0; i<rounds;i++) {
		int  temp_removal_value = sc.nextInt();
		  removal_values.append(temp_removal_value);
		}
		int [] invitees = new int [friend_no];
		for( int i=0;i<friend_no;i++) {
		  invitees[i+1];
		}
		for i in removal_values: 
		  for j in invitees:
		    invitees.pop(j);
		for i in invitees:
		  print(invitees[i]);
	}

}
