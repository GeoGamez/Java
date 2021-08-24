import java.util.Scanner;
public class ccc11S1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char letter; 
		int tCount = 0;
		int sCount = 0;
		int numOfLines = in.nextInt();
		String main = "";
		in.nextLine();
		for(int i = 0; i < numOfLines; i++){
			main += in.nextLine();
		} 
		main = main.toLowerCase();
		for(int i = 0; i < main.length(); i++){
			letter = main.charAt(i);
			if(letter == 't'){
				tCount++;
			}else if(letter == 's'){
				sCount++;
			}
		}
		if(tCount > sCount){
			System.out.println("English");
		}else{
			System.out.println("French");
		}
	}
}
