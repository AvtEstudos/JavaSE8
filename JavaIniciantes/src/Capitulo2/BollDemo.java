package Capitulo2;

public class BollDemo {

	public static void main(String[] args) {
		boolean b;
		
		b = false;
		System.out.println("b � " + b);		
		b = true;
		System.out.println("b � " + b);		
		
		if (b) System.out.println("Isto � executado");
		
		b = false;
		if (b) System.out.println("Isto n�o � executado");
		
		System.out.println("10 > 9 � " + (10 > 9));

	}

}
