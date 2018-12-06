package Capitulo3;

public class KbIn {	
	
	public static void main(String[] args) throws java.io.IOException {		
		 
		char ch;
		
		System.out.print("Pressione uma tecla seguida de ENTER");
		
		ch = (char) System.in.read();
		
		System.out.println("Sua tecla é: " + ch);
		

	}

}
