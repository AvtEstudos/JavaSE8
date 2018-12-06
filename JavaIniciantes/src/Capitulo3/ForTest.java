package Capitulo3;

public class ForTest {

	public static void main(String[] args) throws java.io.IOException {
		
		int i;
		
		System.out.println("Pressione S para Parar.");
		
		for (i = 0; (char)System.in.read() != 'S'; i++) {
			System.out.println("Passar #" + i);
			
		}

	}

}
