package Capitulo3;

public class Guess {

	public static void main(String[] args) throws java.io.IOException {
		
		char ch, ignore, answer = 'K';
		
		do {
			
			System.out.println("Estou pensando em uma letra entre A e Z");		
			System.out.println("Você consegue adivinhar: ");
			
			ch = (char) System.in.read();
			
			do {
				ignore = (char) System.in.read();				
			} while(ignore != '\n');			
			
			if(ch == answer) System.out.println("** Certo **");
			else {
				System.out.print("...Desculpe, você errou ");
				if(ch < answer) System.out.println("muito baixo ");
				else System.out.println("muito alto ");
				System.out.println("Tente de novo!\n");
			}
			
		} while (answer != ch);	

	}

}
