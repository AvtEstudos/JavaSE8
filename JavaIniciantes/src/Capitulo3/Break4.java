package Capitulo3;

public class Break4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 4; i++) {
	um:		{
	dois:		{
	tres:			{
						System.out.println("\ni é " + i);
						if (i == 1) break um;
						if (i == 2) break dois;
						if (i == 3) break tres;
						
						System.out.println("Depois do bloco três.");
					}
					
					System.out.println("Depois do bloco três.");
				}
		
				System.out.println("Depois do bloco dois.");
			}
		
			System.out.println("Depois do bloco um.");
		}
		
		

	}

}
