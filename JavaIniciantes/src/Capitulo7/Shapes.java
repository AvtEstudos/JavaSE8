package Capitulo7;

public class Shapes {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("Outlined", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		
		t1 = t2;
		
		System.out.println("Informações de t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("A area é: " + t1.area());
		
		System.out.println();
		
		System.out.println("Informações de t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("A area é: " + t2.area());		
		
		System.out.println();
		
		System.out.println("Informações de t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("A area é: " + t3.area());		

	}

}
