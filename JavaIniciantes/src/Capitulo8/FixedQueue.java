package Capitulo8;

// Classe de fila de tamanho fixo para caracteres
public class FixedQueue implements ICharQ {

	private char q[]; //Array que contém a fila
	private int putloc, getloc; // Os indices put e get
	
	//Constrói uma fila vazia dado seu tamanho
	public FixedQueue(int size) {
		
		q = new char[size]; //Aloca memória para a fila
		putloc = getloc = 0;
		
	}
	
	// Insere um caracter na fila
	@Override
	public void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Queue está cheia.");
			return;
		}
		
		q[putloc++] = ch;		
		
	}	

	// Remove um caracter da fila
	@Override
	public char get() {
		
		if(getloc == putloc) {
			System.out.println(" - Queue está vazio.");
			return (char) 0;
		}
		
		return q[getloc++];
	}
	
	

}
