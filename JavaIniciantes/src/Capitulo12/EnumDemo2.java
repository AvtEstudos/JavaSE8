package Capitulo12;




public class EnumDemo2 {

	public static void main(String[] args) {
		
		Transport tp; //Declara uma refer�ncia Transport.
		
		System.out.println("Todos os itens da constante de TRANSPORT.");
		
		//Usa values()
		Transport allTransports[] = Transport.values(); //Obt�m um array de constantes
		
		for(Transport t : allTransports)
			System.out.println(t);
		
		System.out.println();
		
		//usa valueOf()
		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp cont�m " + tp);				

	}

}
