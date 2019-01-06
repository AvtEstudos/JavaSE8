package Capitulo9;

public class NonIntResultException extends Exception {
	
	int n;
	int d;
	
	public NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}
	
	public String toString() {
		return "Resultado de " + n + " / " + d + " é não inteiro.";
	}	

}
