package Capitulo6;

public class Recursao {

	public static void main(String[] args) {
		
		Fatorial f = new Fatorial();
		System.out.println("Fatorial usando o m�todo recursivo.");
		System.out.println("Fatorial de 3 � " + f.factR(3));
		System.out.println("Fatorial de 4 � " + f.factR(4));
		System.out.println("Fatorial de 5 � " + f.factR(5));
		System.out.println();
		
		System.out.println("Fatorial usando o m�todo iterativo.");		
		System.out.println("Fatorial de 3 � " + f.factI(3));
		System.out.println("Fatorial de 4 � " + f.factI(4));		
		System.out.println("Fatorial de 5 � " + f.factI(5));				
	}

}
