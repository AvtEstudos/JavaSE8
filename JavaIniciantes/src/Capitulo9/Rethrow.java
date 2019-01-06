package Capitulo9;

//Relança uma exceção
public class Rethrow {

	public static void genException() {
		
		int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};	
			
		for (int i = 0; i < numer.length; i++) {
			
			try { // try aninhado
				System.out.println(numer[i] + " / " + denom[i] + " é " + numer[i]/denom[i]);				
			} catch (ArithmeticException exc) {
				System.out.println("Erro de divisão por zero!");	
			} catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("Não encontrou elemento correspondente!");
				throw exc; //relança a exceção
			}
		}	
	}
}
