package Capitulo3;

public class Break6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0, y=0;
		
		Parada1:
		for (x = 0; x < 5; x++) {
			for (y = 0; y < 5; y++) {
				if(y == 2) break Parada1;
				System.out.println("X e Y: " + x + " " + y);
			}
		}
		System.out.println();
		
		for (x = 0; x < 5; x++) 
		Parada2: 
		{
			for (y = 0; y < 5; y++) {
				if(y == 2) break Parada2;
				System.out.println("X e Y: " + x + " " + y);
			}
		}
	
	}

}
