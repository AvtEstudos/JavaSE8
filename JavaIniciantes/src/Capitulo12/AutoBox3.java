package Capitulo12;

//Autoboxing/unboxing ocorre dentro de express�es.
public class AutoBox3 {

	public static void main(String[] args) {
		
		Integer iOb, iOb2;
		int i;
		
		iOb = 99;
		System.out.println("Valor original de iOb: " + iOb);
		
		// O trecho a seguir faz o unbonxing automatico
		// de iOb, executa o incremento e encapsula
		// o resultado novamente em iOb.
		++iOb;
		System.out.println("Depois de ++iOb: " + iOb);
		
		// Aqui, iOb sofre unboxing, seu valor � aumentado em 10 e o 
		// resultado � encapsulado e armazenado novamente em iOb
		iOb += 10;
		System.out.println("Depois de iOb += 10: " + iOb);
		
		// Agora, iOb sobre unboxing, a express�o �
		// avaliada e o resultado � encapsulado novamente
		// e atrib�do a iOB2.
		iOb2 = iOb + (iOb / 3);
		System.out.println("Depois de iOb2 = iOb + (iOb / 3): " + iOb2);
		
		// A mesma express�o � avaliada, mas o 
		// resultado n�o � encapsulado.
		i = iOb + (iOb /3);
		System.out.println("Depois de i = iOb + (iOb /3): " + i);

	}

}
