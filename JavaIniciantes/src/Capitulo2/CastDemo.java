package Capitulo2;

public class CastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		i = (int) (x / y);
		System.out.println("Integer resultado de x / y: " + i);
		
		i = 100;
		b = (byte) i;
		System.out.println("Valor de b " + b);
		
		i = 257;
		b = (byte) i;
		System.out.println("Valor de b " + b);
		
		b = 88;
		ch = (char) b;
		System.out.println("Valor de ch " + ch);
		
		

	}

}
