package Capitulo6;

public class VarArgs2 {

	static void vaTest(String msg, int ...v) {
		System.out.println(msg + v.length);
		System.out.println("Conteúdo: ");
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(" arg " + i + ": " + v[i]);
		}
		
		System.out.println(); 
	}
	
	public static void main(String args[]) {
		
		vaTest("Um argumento: ", 10);
		vaTest("Três argumentos: ", 1, 2, 3);
		vaTest("Sem argumentos");
		
	}
}
