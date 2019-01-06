package Capitulo9;

public class ExcDemo2 {

	public static void main(String[] args) {
		
		try {
			ExcTeste.genException();
			
		} catch (ArrayIndexOutOfBoundsException exc) {
			// captura a exceção
			System.out.println("Indice fora do range especificado!");
		}
		
		System.out.println("Depois do catch.");

	}

}
