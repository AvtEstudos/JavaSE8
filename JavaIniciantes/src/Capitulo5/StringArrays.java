package Capitulo5;

public class StringArrays {

	public static void main(String[] args) {
		
		String strs[] = {"Este", "�", "um", "teste."};
		
		System.out.println("Array origional: ");
		for (String s : strs) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//Altera um string
		strs[1] = "era";
		strs[3] = "teste, tamb�m!";
		
		System.out.println("Modificando array: ");
		for (String s : strs) {
			System.out.print(s + " ");
		}
		
	}

}
