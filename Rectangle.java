
public class Rectangle {


public Rectangle (double l, double w){
	length = l;
	width = w;
}
//Class has two parts
//Data Member
//What class have
	public double length;
	public double width;
	
	//Method
	// public returtype methodname (input parameter)
	//Create a construtor
	// Construtor has same name as class name
	// Construtor use to set data members value
	public double calculateArea() {
		return length*width;
	}
	public double calculatePerimeter() {
		return 2*(length*width);
	}
	public static void main(String[] args) {;

		
		// Create an object
		//Classname objectname = new Construtor(vaulue);
		Rectangle rect1 = new Rectangle(10,25);
		//how to use object to access data member
		System.out.println(rect1.length);
		System.out.println(rect1.width);
		System.out.println(rect1.calculateArea());
		System.out.println(rect1.calculatePerimeter());
	}

}
