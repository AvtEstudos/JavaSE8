package Capitulo1;

public class IfDemo {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 2;
		b = 3;
		
		if (a < b) System.out.println("a � menor que b");
		
		if (a == b) System.out.println("voc� n�o ver� isso");
		
		System.out.println("");
		
		c = a - b;
		
        System.out.println("c cont�m -1");
		
		if (c >= 0) System.out.println("c n�o � negativo");
		
		if (c < 0) System.out.println("c � negativo");
		
		System.out.println("");
		
		c = b - a;
		
		System.out.println("c cont�m 1");
		
		if (c >= 0) System.out.println("c n�o � negativo");
		
		if (c < 0) System.out.println("c � negativo");		

	}

}
