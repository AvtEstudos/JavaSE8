package Capitulo9;

//Usa um bloco Try aninhado
public class NestTrys {

	public static void main(String[] args) {
		
		int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};
		
		try { // try externo
			
			for (int i = 0; i < numer.length; i++) {
				
				try { // try aninhado
					System.out.println(numer[i] + " / " + denom[i] + " � " + numer[i]/denom[i]);				
				} catch (ArithmeticException exc) {
					System.out.println("Erro de divis�o por zero!");	
				} 
			}
			
		} catch (ArrayIndexOutOfBoundsException exc) {
			//Captura a exce��o
			System.out.println("N�o h� elemento correspondente.");
			System.out.println("Fatal error - programa terminado.");
		}
	}
}
