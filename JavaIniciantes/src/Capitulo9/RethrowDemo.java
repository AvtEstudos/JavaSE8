package Capitulo9;

public class RethrowDemo {

	public static void main(String[] args) {
		
		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			//Recaptura a exce��o
			System.out.println("Erro fatal - Programa terminado.");
		}

	}

}
