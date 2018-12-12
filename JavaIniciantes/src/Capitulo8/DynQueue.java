package Capitulo8;

//Fila din�mica
public class DynQueue implements ICharQ {
	
	private char q[]; //Esse array cont�m a fila
	private int putloc, getloc; //Os indices put e get
	
	public DynQueue(int size) {
		q = new char[size]; //Aloca mem�ria para a fila
		putloc = getloc = 0;
	}

	// Insere um caracter na fila
	@Override
	public void put(char ch) {
		if(putloc == q.length) {
			//Aumenta o tamanho da fila
			char t[] = new char[q.length * 2];
			
			//copia elementos para a nova fila
			for (int i = 0; i < q.length; i++) {
				t[i] = q[i];
			}
			
			q = t;
		}
		
		q[putloc++] = ch;
		
	}

	//Remove um caracter da fila
	@Override
	public char get() {
		
		if(getloc == putloc) {
			System.out.println(" - Queue est� vazia.");
			return (char) 0;
		}
		
		return q[getloc++];
	}
	

}
