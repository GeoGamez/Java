
public class cindyloop {

	public static void main(String[] args) {
		for (int i = 0; i<100 ; i++) {
			System.out.println("Cindy");
		}
		for (int b =0; b<=19; b+=3) {
			System.out.print(b);
		}
		for (int c =7 ;c<=49;c+=3 ) {
			System.out.print(c);
		}
	      //Kevin 
	      String S = sc.next();
	      S = S.replace("A","");
	      S = S.replace("B","");
	      S = S.replace("C","");
	      S = S.replace("D","");
	      if (S.length()==0){
	        System.out.println("YES");
	        }else{
	        System.out.println("NO");
	      } 
	      for (int i = 0; i < 2; i++){  
	          System.out.print("*");
	      }
	      System.out.println();
	      for (int i = 0; i < 3; i++){  
	          System.out.print("*");
	      }
	      for (int i = 0; i < 3; i++){  
	          System.out.print(" ");
	      }
	      for (int i = 0; i < 3; i++){  
	          System.out.print("*");
	      }
	      System.out.println();
	      for (int i = 0; i < 5; i++){  
	          System.out.print("&");
	      }
	      for (int i = 0; i < 2; i++){  
	          System.out.print("^");
	      }
	      for (int i = 0; i < 3; i++){  
	          System.out.print("$");
	      }
	      System.out.println();
	      
	      
	      for(int j = 0; j<3;j++){
              for (int i = 0; i<3;i++){
                System.out.print("*");
              }
               for (int i = 0; i<2;i++){
                System.out.print("$");
              }
               for (int i = 0; i<3;i++){
                System.out.print("@");
              }
               for (int i = 0; i<6;i++){
                System.out.print("#");
              }
              System.out.println();
    }  
		}

	}


