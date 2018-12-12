package Capitulo8;

public class SeriesDemo2 {

	public static void main(String[] args) {
		
		ByTwos twoOb = new ByTwos();
		ByThrees threesOb = new ByThrees();
		
		Series ob;
		
		for (int i = 0; i < 5; i++) {
			ob = twoOb;
			System.out.println("Próximo ByTwos o valor é " + ob.getNext());
			
			ob = threesOb;
			System.out.println("Próximo ByThrees o valor é " + ob.getNext());
		}

	}

}
