package Capitulo9;

//Usando os m�todos de throwable

public class UseThrowableMethods {

	public static void main(String[] args) {
		
		try {
			ExcTeste.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			//Captura a exce��o
			System.out.println("A mensagem padr�o �: ");
			System.out.println(exc);
			System.out.println("\nStack trace: ");
			exc.printStackTrace();
		}
		
		System.out.println("Depois do catch.");
	}

}
