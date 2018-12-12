package Capitulo8;

//Fila circular
public class CircularQueue implements ICharQ {
	
	private char q[]; //Esse array contém a fila
	private int putloc, getloc; //Os indices put e get	
	
	public CircularQueue(int size) {
		q = new char[size+1]; //Aloca memória para a fila
		putloc = getloc = 0;
	}
	
	//Insere um caracter na fila
	@Override
	public void put(char ch) {
		/* A fila estará cheia se putloc for uma unidade menor do que getloc ou se putloc estiver no fim 
		 * do array e getloc estiver no inicio.
		 */
		
		if ( putloc+1 == getloc | 
		     ((putloc == q.length-1) & (getloc == 0))) {
			
			System.out.println(" - Queue está cheia.");
			return;
		}
		
		q[putloc++] = ch;
		if(putloc == q.length) putloc = 0; //Retrocede
		
	}
	
	//Remove um caracter da fila
	@Override
	public char get() {
		
		if(getloc == putloc) {
			System.out.println(" - Queue está vazia.");
			return (char) 0;
		}
		
		char ch = q[getloc++];
		
		if (getloc == q.length) getloc = 0; // iniciando o loop
		
		return ch;
		
	}
	
	

}
