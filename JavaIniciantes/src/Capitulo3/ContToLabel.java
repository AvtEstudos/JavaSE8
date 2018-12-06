package Capitulo3;

public class ContToLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loopExterior:
			for (int i = 0; i < 10; i++) {
				System.out.print("\nPassagem do loop externo " + i + ", loop interno: ");
				for (int j = 0; j < 10; j++) {
					if(j == 5) continue loopExterior;
					System.out.print(j);					
				}
			}
	}

}
