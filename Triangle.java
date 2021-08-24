
public class Triangle {
	public double side1;
	public double side2;
	public double side3;
	public Triangle(double s1,double s2,double s3) {
		side1=s1;
		side2 = s2;
		side3 = s3;
	}
	public double calculateArea() {
		double s= (side1+side2+side3)/2;
		return Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));s
	}
	  public double calculatePerimeter(){
		    return side1+side2+side3;
		  }
	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		Triangle
//		side1
//		side2
//		side2 
//		side1, side2 and side3 are data member
//		Heron
	}

}
