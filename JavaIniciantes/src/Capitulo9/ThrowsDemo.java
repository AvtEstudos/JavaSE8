package Capitulo9;

//Lança manualmente uma exceção
public class ThrowsDemo {

	public static void main(String[] args) {
		
		try {	
			
			System.out.println("Antes do throw.");
			throw new ArithmeticException();
			
		} catch (ArithmeticException exc) {
			//captura a exceção
			System.out.println("Exceção capturada.");
		}
		
		System.out.println("Depois do try/catch.");

	}

}
