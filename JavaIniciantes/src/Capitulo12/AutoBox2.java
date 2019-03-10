package Capitulo12;

public class AutoBox2 {
	
	static void m(Integer v) { // Recebe um Integer
		System.out.println("m() recebe " + v);
	}
	
	//Esse m�todo retorna um int.
	static int m2() {
		return 10; // Retorna um int.
	}
	
	//Esse m�todo retorna um Integer.
	static Integer m3() {
		return 99; // Faz o autoboxing de 99 para um Integer.
	}
 
	public static void main(String[] args) {
		
		// Passa um int para m().  J� que m() tem um par�metro Integer,
		// o valor int passado � encapsulado automaticamente.
		m(199);
		
		// Aqui, iOb recebe o valor int retornado por m2().
		// Esse valor � encapsulado automaticamente para
		// poder ser atribu�do a iOb.
		Integer iOb = m2();
		System.out.println("Retorna o valor de m2() � " + iOb);
		
		// Em seguida, m3() � chamado. Ele retorna um valor Integer
		// que � encapsulado automaticamente em um int.
		int i = m3();
		System.out.println("Retorna o valor de m3() � " + i);
		
		// Agora, Math.sqrt() � chamado com iOb como argumento.
		// Nesse caso, iOb sofre autoboxing e seu valor � promovido
		// a double, que � o tipo que sqrt() precisa.
		iOb =  100;
		System.out.println("Raiz quadrada de iOb is " + Math.sqrt(iOb));

	}

}
