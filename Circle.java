
public class Circle {
	public double radius;
	public Circle(double r) {
		radius=r;
	}
	public double calculateArea() {
		return Math.PI*(Math.pow(radius,2));
	}
	  public double calculateCircumference(){
		    return 2*Math.PI*radius;
		  }
	public static void main(String[] args) {

	}

}
