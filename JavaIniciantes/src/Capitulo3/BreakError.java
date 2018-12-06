package Capitulo3;

public class BreakError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		um: for (int i = 0; i < 3; i++) {
			System.out.println("Passagem " + i + ": ");
		}
	
		for (int j = 0; j < 100; j++) {
			//if(j == 10) break um;
			System.out.print(j + " ");
		}

	}

}
