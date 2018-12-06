package Capitulo7;

public class Triangle extends TwoDShape {
	
	private String style;	
	
	Triangle() {
		super();
		style = "vazio";
	}
	
	Triangle(String s, double w, double h){
		super(w, h, "triangulo");		
		style = s;
	}
	
	Triangle(double x){		
		super(x, "triangulo");
		style = "filled";
	}
	
	Triangle(Triangle ob){
		super(ob);
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;  
	}
	
	void showStyle() {
		System.out.println("O Triangulo é: " + style);
	}
	

}
