package Capitulo7;

public class DynShapes {

	public static void main(String[] args) {
		
		TwoDShape shapes[] = new TwoDShape[5];
		
		shapes[0] = new Triangle("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new Triangle(99.0);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("O objeto é " + shapes[i].getNome());
			System.out.println("A area é " + shapes[i].area());
			System.out.println();
		}		

	}

}
