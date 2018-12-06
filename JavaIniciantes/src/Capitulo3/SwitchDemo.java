package Capitulo3;

public class SwitchDemo {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			switch(i) {
				case 0:
					System.out.println("i igual a zero");
					break;
				case 1:
					System.out.println("i igual a um");
					break;
				case 2:
					System.out.println("i igual a dois");
					break;
				case 3:
					System.out.println("i igual a três");
					break;
				case 4:
					System.out.println("i igual a quatro");
					break;
				default:
					System.out.println("i igual a cinco ou mais");
					break;					
									
			}			
		}
	}
}
