package Capitulo12;

public class AutoBox2 {
	
	static void m(Integer v) { // Recebe um Integer
		System.out.println("m() recebe " + v);
	}
	
	//Esse método retorna um int.
	static int m2() {
		return 10; // Retorna um int.
	}
	
	//Esse método retorna um Integer.
	static Integer m3() {
		return 99; // Faz o autoboxing de 99 para um Integer.
	}
 
	public static void main(String[] args) {
		
		// Passa um int para m().  Já que m() tem um parâmetro Integer,
		// o valor int passado é encapsulado automaticamente.
		m(199);
		
		// Aqui, iOb recebe o valor int retornado por m2().
		// Esse valor é encapsulado automaticamente para
		// poder ser atribuído a iOb.
		Integer iOb = m2();
		System.out.println("Retorna o valor de m2() é " + iOb);
		
		// Em seguida, m3() é chamado. Ele retorna um valor Integer
		// que é encapsulado automaticamente em um int.
		int i = m3();
		System.out.println("Retorna o valor de m3() é " + i);
		
		// Agora, Math.sqrt() é chamado com iOb como argumento.
		// Nesse caso, iOb sofre autoboxing e seu valor é promovido
		// a double, que é o tipo que sqrt() precisa.
		iOb =  100;
		System.out.println("Raiz quadrada de iOb is " + Math.sqrt(iOb));

	}

}
