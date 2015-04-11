
public class Triangle extends GeometricObject {

	//create three double data feilds for each side of the triangle and set default values
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	//default no arg constructor
	public Triangle(){
		
	}
	//creates a triangle with specified side values.
	public Triangle(double side1, double side2, double side3){
		
	//accessors and mutators for all three sides.	
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	//calculating area using Heron's formula.
	public double getArea(double side1, double side2, double side3){
		double s = (side1 + side2 + side3)/2;
	    double x = ((s) * (s-side1) * (s-side2) * (s-side3));
	    double Area = Math.sqrt(x);
	    return Area;
	}
	
	//calculating perimeter
	public double getPerimeter(double side1, double side2, double side3){
		double p = (side1 + side2 + side3);
		double Perimeter = p;
		return Perimeter;				
	}
	
	//return the description of the triangle
	public String toString(){
		return null string " Triangle: "
			   " Side 1 = " side1
			   " Side 2 = " side2
		       " Side 3 = " side3
		       " Perimeter = " Perimeter
		       " Area = " Area;
	}
}
	
