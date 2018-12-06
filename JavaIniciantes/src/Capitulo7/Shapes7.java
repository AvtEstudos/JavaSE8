package Capitulo7;

public class Shapes7 {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle("outlined", 8.0, 12.0);
		
		Triangle t2 = new Triangle(t1);
		
		System.out.println("Info de t1");
		t1.showStyle();
		t1.showDim();		
		System.out.println("A area é " + t1.area());
		
		System.out.println();
		
		System.out.println("Info de t2");
		t2.showStyle();
		t2.showDim();		
		System.out.println("A area é " + t2.area());
		

	}

}
