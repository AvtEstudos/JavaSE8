package Capitulo7;

public class Rectangle extends TwoDShape {

	Rectangle() {
		super();
	}
	
	Rectangle(double w, double h) {
		super(w, h, "retangulo");
	}
	
	Rectangle(double x) {
		super(x, "retangulo");
	}
	
	Rectangle(Rectangle ob) {
		super(ob);
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		
		return false;
					
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}
