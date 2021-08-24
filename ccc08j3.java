import java.util.Scanner;

public class ccc08j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 int X=0;
	 int Y=0;
        char [] [] Key = {{'A','B','C','D','E','F'},
                {'G','H','I','J','K','L'},
                {'M','N','O','P','Q','R'},
                {'S','T','U','V','W','X'},
                {'Y','Z',' ','-','.','1'}};
        String Word =sc.nextLine();
    String NewWord= Word.substring(0, Word.length()) + '1';
        int moves =0;
        for (int i =0;i<NewWord.length();i++) {     
        for(int x =0;x<5;x++){
	           for(int y = 0; y<6;y++){
	             if(Key[x][y]==NewWord.charAt(i)){	            	
	            	 moves=moves+Math.abs(X-x)+Math.abs(Y-y);
X = x;
Y=y;
	             }

	             
	}
        }

}
        System.out.println(moves);
	}
}
