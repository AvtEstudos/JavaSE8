package Capitulo8;

public class SeriesDemo2 {

	public static void main(String[] args) {
		
		ByTwos twoOb = new ByTwos();
		ByThrees threesOb = new ByThrees();
		
		Series ob;
		
		for (int i = 0; i < 5; i++) {
			ob = twoOb;
			System.out.println("Pr�ximo ByTwos o valor � " + ob.getNext());
			
			ob = threesOb;
			System.out.println("Pr�ximo ByThrees o valor � " + ob.getNext());
		}

	}

}
