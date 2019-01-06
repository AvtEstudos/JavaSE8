package Capitulo9;

//Lan�a manualmente uma exce��o
public class ThrowsDemo {

	public static void main(String[] args) {
		
		try {	
			
			System.out.println("Antes do throw.");
			throw new ArithmeticException();
			
		} catch (ArithmeticException exc) {
			//captura a exce��o
			System.out.println("Exce��o capturada.");
		}
		
		System.out.println("Depois do try/catch.");

	}

}
