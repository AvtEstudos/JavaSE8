package Capitulo3;

public class DWDemo {

	public static void main(String[] args) throws java.io.IOException {
		
		char ch;
		do {
			System.out.println("Pressione uma tecla seguida de ENTER: ");
			ch = (char) System.in.read();			
		} while(ch != 'q');
	}

}
