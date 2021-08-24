
		import java.util.Scanner;
public class ccc11j4 {


	public static void main(String[] args) {




		    boolean[][] grid = new boolean[201][401];
		    grid[1][200] = true;
		    grid[2][200] = true;
		    grid[3][200] = true;
		    grid[3][201] = true;
		    grid[3][202] = true;
		    grid[3][203] = true;
		    grid[4][203] = true;
		    grid[5][203] = true;
		    grid[5][204] = true;
		    grid[5][205] = true;
		    grid[4][205] = true;
		    grid[3][205] = true;
		    grid[3][206] = true;
		    grid[3][207] = true;
		    grid[4][207] = true;
		    grid[5][207] = true;
		    grid[6][207] = true;
		    for (int col=199; col<=207; col++) {
		      grid[7][col] = true;
		    }
		    grid[5][199] = true;
		    grid[6][199] = true;
		    
		    int curRow = 5;
		    int curCol = 199;
		    Scanner sc = new Scanner(System.in);

		    
		    while (true) {
		      String direction = sc.next();
		      int step = sc.nextInt();
		      if (direction.equals("q")) {
		        break;
		      }
		      boolean isSafe = true;

		      if (direction.equals("l")) {
		        for (int i=0; i<step; i++) {
		          curCol--;
		          if (grid[curRow][curCol]) {
		            isSafe = false;
		          }
		          grid[curRow][curCol] = true;
		        }
		      }

		      if (direction.equals("r")) {
		        for (int i=0; i<step; i++) {
		          curCol++;
		          if (grid[curRow][curCol]) {
		            isSafe = false;
		          }
		          grid[curRow][curCol] = true;
		        }
		      }

		      if (direction.equals("u")) {
		        for (int i=0; i<step; i++) {
		          curRow--;
		          if (grid[curRow][curCol]) {
		            isSafe = false;
		          }
		          grid[curRow][curCol] = true;
		        }
		      }

		      if (direction.equals("d")) {
		        for (int i=0; i<step; i++) {
		          curRow++;
		          if (grid[curRow][curCol]) {
		            isSafe = false;
		          }
		          grid[curRow][curCol] = true;
		        }
		      }

		      if (isSafe) {
		        System.out.println((curCol-200)+" "+(-curRow)+" safe");
		      } else {
		        System.out.println((curCol-200)+" "+(-curRow)+" DANGER");
		      }
		      
		    }
		      
		    

		  }
		

	}


