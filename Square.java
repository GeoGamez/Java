
public class Square {
	public double length;
	public Square(double l){
		length = l;
	}

	public double calculateArea(){
		return Math.pow(length,2);
	}
	public double calculatePerimeter(){
		return length*4;
	}
	
	public static void main(String[] args) {
		Square square = new Square(10);
		// TODO Auto-generated method stub
		System.out.println((square.calculateArea()));
	}

}
