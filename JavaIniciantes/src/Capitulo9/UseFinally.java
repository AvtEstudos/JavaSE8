package Capitulo9;

//Usa finally
public class UseFinally {

	public static void genException(int what) {
		
		int t;
		int nums[] = new int[2];
		
		System.out.println("Recebendo " + what);		
		try {
			
			switch (what) {
			case 0:
				t = 10 / what; // gera erro de divis�o por zero
				break;
				
			case 1:	
				nums[4] = 4; // gera erro de indice de array	
				break;
				
			case 2:
				
				return; // retorna do bloco try
			
			}
			
		} catch (ArithmeticException exc) {
			// captura a exce��o
			System.out.println("N�o pode dividir por zero!");
			return; // retorna do catch			
		} catch (ArrayIndexOutOfBoundsException exc) {
			// captura a exce��o
			System.out.println("N�o h� elemento correspondente encontrado!");
		} finally {
			System.out.println("Deixando o try.");
		}		

	}

}
