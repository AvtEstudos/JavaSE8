package Capitulo9;

//Usando os métodos de throwable

public class UseThrowableMethods {

	public static void main(String[] args) {
		
		try {
			ExcTeste.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			//Captura a exceção
			System.out.println("A mensagem padrão é: ");
			System.out.println(exc);
			System.out.println("\nStack trace: ");
			exc.printStackTrace();
		}
		
		System.out.println("Depois do catch.");
	}

}
