package Capitulo8;

// Classe de fila de tamanho fixo para caracteres
public class FixedQueue implements ICharQ {

	private char q[]; //Array que cont�m a fila
	private int putloc, getloc; // Os indices put e get
	
	//Constr�i uma fila vazia dado seu tamanho
	public FixedQueue(int size) {
		
		q = new char[size]; //Aloca mem�ria para a fila
		putloc = getloc = 0;
		
	}
	
	// Insere um caracter na fila
	@Override
	public void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Queue est� cheia.");
			return;
		}
		
		q[putloc++] = ch;		
		
	}	

	// Remove um caracter da fila
	@Override
	public char get() {
		
		if(getloc == putloc) {
			System.out.println(" - Queue est� vazio.");
			return (char) 0;
		}
		
		return q[getloc++];
	}
	
	

}
