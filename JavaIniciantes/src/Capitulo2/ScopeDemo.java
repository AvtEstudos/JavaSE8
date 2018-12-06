package Capitulo2;

public class ScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		x = 10;
		
		if(x == 10) {
			int y = 20;
			
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		
		System.out.println("x é " + x);
		

	}

}
