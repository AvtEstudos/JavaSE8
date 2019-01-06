package Capitulo9;

public class ExcDemo1 {

	public static void main(String[] args) {
		
		int nums[] = new int[4];
		
		try {
			System.out.println("Antes da exception ser gerada.");
			nums[7] = 10;
			
			System.out.println("Este display não é exibido");
		} catch (ArrayIndexOutOfBoundsException exc) {
			//Captura da exceção
			System.out.println("Indice fora do range estabelecido.");
		}
		
		System.out.println("Depois do catch.");

	}

}
