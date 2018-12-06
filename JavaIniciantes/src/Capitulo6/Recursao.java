package Capitulo6;

public class Recursao {

	public static void main(String[] args) {
		
		Fatorial f = new Fatorial();
		System.out.println("Fatorial usando o método recursivo.");
		System.out.println("Fatorial de 3 é " + f.factR(3));
		System.out.println("Fatorial de 4 é " + f.factR(4));
		System.out.println("Fatorial de 5 é " + f.factR(5));
		System.out.println();
		
		System.out.println("Fatorial usando o método iterativo.");		
		System.out.println("Fatorial de 3 é " + f.factI(3));
		System.out.println("Fatorial de 4 é " + f.factI(4));		
		System.out.println("Fatorial de 5 é " + f.factI(5));				
	}

}
