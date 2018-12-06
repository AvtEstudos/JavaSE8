package Capitulo7;

public class ColorTriangle extends Triangle{
	
	private String color;
	
	public String getColor() {
		return color;
	}

	public ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h);
		
		color = c;
	}
	
	void showColor() {
		System.out.println("A cor é " + color);
	}
	

}
