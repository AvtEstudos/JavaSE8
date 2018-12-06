package Capitulo6;

public class Queue {	
		
	private char q[];
	private int putloc, getloc;
	
	//Aloca mem�ria para a fila
	Queue(int size) {
		q = new char[size];
		putloc = getloc = 0;			
	}
	
	//Insere um caracter na fila
	void put(char ch) {
		
		if(putloc == q.length) {
			System.out.println(" - Fila est� cheia.");
			return;
		}	
			
		q[putloc++] = ch;
	}
	
	//Obt�m um caracter na fila
	char get() {
		
		if(getloc == putloc) {
			System.out.println(" - Fila est� vazia.");
			return (char) 0;
		}
		
		return q[getloc++];
		
	}
	

}
