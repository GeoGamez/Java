
public class Recurstion {

	
//public static returntype functionname (input parameter) { DON'T PUT IN MAIN FUNCTION
public static int plus(int first, int second) {
	return first+second;
}
public static int factorial(int n) {
	if (n==0) {
		return 1;
	}else {
	return n*factorial(n-1);
	}
public static int nchoosek(int n, int k) {
	public static int choose (int n, int k){
	    if (k==n){
	      return 1;
	    }
	   else if (k ==1){
	      return n;
	   }else{
	        return choose(n-1,k)+choose(n-1,k-1);
	      }
	  }

	
}
public static int TowerofHanoi(int n) {
	if (n==1) {
		return 1;
}else {
	return 2*TowerofHanoi(n-1)+1;
	
}
	
	}
public static int Pieday (int n,int k) {
	if (n ==k) {
		return 1;
		
	}else if (k==1) {
		return 1;
	}else if (n<k) {
		return 0;
	}else {
	return Pieday(n,k)=Pieday(n-k,k)+Pieday(n-1,k-1);	
	}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub

}
}


