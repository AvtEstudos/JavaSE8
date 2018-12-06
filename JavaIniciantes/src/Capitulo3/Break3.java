package Capitulo3;

public class Break3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Contagem do loop exterior: " + i);
			System.out.println("	Contagem do loop interno: ");
			
			int t = 0;
			while (t < 100) {
				if(t == 10) break;
				System.out.print(t + " ");
				t++;				
			}
			System.out.println();			
		}
		System.out.println("Loops completados.");
	}

}
