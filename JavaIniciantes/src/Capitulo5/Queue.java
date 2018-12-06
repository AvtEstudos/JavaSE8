package Capitulo5;

public class Queue {	
		
	char q[];
	int putloc, getloc;
	
	//Aloca memória para a fila
	Queue(int size) {
		q = new char[size];
		putloc = getloc = 0;			
	}
	
	//Insere um caracter na fila
	void put(char ch) {
		
		if(putloc == q.length) {
			System.out.println(" - Fila está cheia.");
			return;
		}	
			
		q[putloc++] = ch;
	}
	
	//Obtém um caracter na fila
	char get() {
		
		if(getloc == putloc) {
			System.out.println(" - Fila está vazia.");
			return (char) 0;
		}
		
		return q[getloc++];
		
	}
	

}
