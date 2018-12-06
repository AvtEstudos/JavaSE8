package Capitulo7;

public class Shapes6 {

	public static void main(String[] args) {
		ColorTriangle t1 = new ColorTriangle("Blue", "Outline", 8.0, 12.0);
		ColorTriangle t2 = new ColorTriangle("Red", "Filled", 2.0, 2.0);
				
		System.out.println("Informações de t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("A area é: " + t1.area());
		
		System.out.println();
		
		System.out.println("Informações de t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("A area é: " + t2.area());		
		
				

	}

}
