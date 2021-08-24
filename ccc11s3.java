import java.util.Scanner;
public class ccc11s3 {
	public static boolean alice (int m,int x, int y) {
		 int x0 = (int) (x / Math.pow(5, m - 1));
		  int y0 =(int) (y / Math.pow(5, m - 1));
		  if (x0==0&&y0==0) return false;
		    if (x0 > 0 && x0 < 4 && y0 == 0) return true;
		    if (x0 == 2 && y0 == 1) return true;
		    if (((x0==1||x0==3)&&y0==1) || (x0==2&&y0==2))
		        return alice(m - 1, x % (int)Math.pow(5, m - 1), y % (int)Math.pow(5, m - 1));
		    return false;

		}
	public static void main(String[] args) {
		sc.nextint();
		int mm=0;
		int xx =0;
		int yy=0 ;
	    while (T--) {
	        sc.nextint("%d%d%d", mm, xx, yy);
	       System.out.printf("%s\n", alice(mm, xx, yy)? "crystal":"empty");
	    }
	}

}
