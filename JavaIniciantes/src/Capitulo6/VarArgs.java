package Capitulo6;

public class VarArgs {
	
	static void vaTest(int ...v) {
		System.out.println("N�mero de argumentos: " + v.length);
		System.out.println("Conte�do: ");
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(" arg " + i + ": " + v[i]);
		}
		
		System.out.println(); 
	}
	
	public static void main(String args[]) {
		
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
		
	}
	
}
