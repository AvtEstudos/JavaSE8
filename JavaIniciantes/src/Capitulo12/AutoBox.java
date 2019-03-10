package Capitulo12;

public class AutoBox {

	//Demonstra o autoboxing/unboxing
	public static void main(String[] args) {
		
		Integer iOb = 100; // faz o autobox de um int
		
		int i = iOb; // autounbox
		
		System.out.println(i + " " + iOb); //exibe 100 100		

	}

}
