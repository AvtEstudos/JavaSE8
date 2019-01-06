package Capitulo9;

public class CustomExceptDemo {

	public static void main(String[] args) {
		
		int numer[] = {4, 8, 15, 32, 64, 127, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};
		
		for (int i = 0; i < numer.length; i++) {
			try {
				if((numer[i] % 2) != 0)
					throw new NonIntResultException(numer[i], denom[i]);
				
				System.out.println(numer[i] + " / " + denom[i] + " � " + numer[i]/denom[i]);
			} catch (ArithmeticException exc) {
				System.out.println("N�o pode dividir por zero.");
			} catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("N�o encontrou elemento correspondente.");
			} catch (NonIntResultException exc) {
				System.out.println(exc);
			}
		}

	}

}
