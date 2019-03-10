package Capitulo12;

//Autoboxing/unboxing ocorre dentro de expressões.
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
		
		// Aqui, iOb sofre unboxing, seu valor é aumentado em 10 e o 
		// resultado é encapsulado e armazenado novamente em iOb
		iOb += 10;
		System.out.println("Depois de iOb += 10: " + iOb);
		
		// Agora, iOb sobre unboxing, a expressão é
		// avaliada e o resultado é encapsulado novamente
		// e atribído a iOB2.
		iOb2 = iOb + (iOb / 3);
		System.out.println("Depois de iOb2 = iOb + (iOb / 3): " + iOb2);
		
		// A mesma expressão é avaliada, mas o 
		// resultado não é encapsulado.
		i = iOb + (iOb /3);
		System.out.println("Depois de i = iOb + (iOb /3): " + i);

	}

}
