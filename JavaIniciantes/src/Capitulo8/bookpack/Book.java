package Capitulo8.bookpack;

public class Book {
	
	protected String titulo;
	protected String autor;
	protected int dataPublic;	

	public Book(String t, String a, int d){
		titulo = t;
		autor = a;
		dataPublic = d;
	}
	
	public void show() {
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(dataPublic);
	}
	
	

}
