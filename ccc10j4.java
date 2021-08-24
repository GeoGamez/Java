import java.util.Scanner;


public class ccc10j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
while (true) {

	int N= sc.nextInt();
	if(N ==0) {
		break;
	}else {
		int [] A = new int[N];
		int [] D = new int[N-1];
		for (int i =0; i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N-1;i++) {
			D[i]=A[i+1]-A[i];
		}
	}             


 //check how D is repeating
 for (int L=1; L<=N-1; L++) {  //shortest cycle is L
                               //Longest cycle is N-1
      boolean cycle = true;
      for (int i=0; i<N-1-L; i++) {
        if (diff[i]!=diff[i+L]) {
          cycle = false;  //Exception
          break;
        }
      }
      if (cycle) {
        System.out.println(L);
        break;
      }
}
	}

}
