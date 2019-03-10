package Capitulo12;

//Demonstra ordinal() e compareTo().
public class EnumDemo4 {

	public static void main(String[] args) {
		Transport tp, tp2, tp3;
		
		//Obtém todos os valores ordinais usando ordinal().
		System.out.println("Aqui estão todos os transportes da constante TRANSPORT e seu valor ordinal.");
		
		for(Transport t : Transport.values())
			System.out.println(t + " " + t.ordinal()); //Obtém os valores ordinais.
		
		tp = Transport.AIRPLANE;
		tp2 = Transport.TRAIN;
		tp3 = Transport.AIRPLANE;
		
		System.out.println();
		
		//Demonstra compareTo()
		
		if(tp.compareTo(tp2) < 0)
			System.out.println(tp + " vem antes de " + tp2);
		
		if(tp.compareTo(tp2) > 0)
			System.out.println(tp2 + " vem antes de " + tp);
		
		if(tp.compareTo(tp3) == 0)
			System.out.println(tp + " igual " + tp3);

	}

}
