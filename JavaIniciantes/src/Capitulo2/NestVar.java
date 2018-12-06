package Capitulo2;

public class NestVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		
		for (count = 0; count < 10; count = count+1) {
			System.out.println("Este é count: " + count);
			
			//int count; invalido
			
			for (count = 0; count < 10; count = count+1) {
				System.out.println("Este programa está errado");
			}
			
		}

	}

}
