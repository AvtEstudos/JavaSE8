package Capitulo9;

//Usa o recurso multi-catch
public class MultiCatch {

	public static void main(String[] args) {
		
		int a=88, b=0;
		int result;
		char chrs[] = { 'A', 'B', 'C'};
		
		for (int i = 0; i < 2; i++) {
			try {
				if(i == 0)
					result = a / b; // gera uma ArithmeticException
				else
					chrs[5] = 'X'; // gera um ArrayIndexOutOfBoundsException
				
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Captura a Exceção: " + e);
			}
		}
		
		System.out.println("Depois do multi-catch.");

	}

}
