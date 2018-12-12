package Capitulo8;

public class IQDemo {

	public static void main(String[] args) {
		
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);
		
		ICharQ iQ;
		
		char ch;
		int i;
		
		iQ = q1;
		
		// Insere alguns caracteres na fila fixa
		for (i = 0; i < 10; i++) {
			iQ.put((char) ('A' + i));
		}
		
		// Exibe a fila
		System.out.print("Conteudo da fila fixa: ");
		
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch + " - ");
		}
		
		System.out.println();
		
		iQ = q2;		
		
		//Insere alguns caracteres na fila dinâmica
		for (i = 0; i < 10; i++) {
			iQ.put((char) ('Z' - i));
		}
		
		//Exibe a fila
		System.out.print("Conteudo da fila dinamica: ");
		
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch + " - ");
		}
		
		System.out.println();
		
		iQ = q3;		
		//Insere alguns caracteres na fila circular
		for (i = 0; i < 10; i++) {
			iQ.put((char) ('A' + i));
		}
		
		System.out.print("Conteudo da fila circular: ");
		
		//Exibe a fila
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch + " - ");
		}
		
		System.out.println();
		
		//Insere mais caracteres na fila circular
		for (i = 10; i < 20; i++) {
			iQ.put((char) ('A' + i));
		}
		
		System.out.print("Conteudo da fila circular: ");
		
		//Exibe a fila
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch + " - ");
		}
		
		System.out.println();
		
		System.out.println("Armazena e consome da fila circular.");
		//Armazena e consome itens da fila circular
		for (i = 0; i < 20; i++) {
			iQ.put((char) ('A' + i));
			ch = iQ.get();
			System.out.print(ch + " - ");
		}
		
	}

}
