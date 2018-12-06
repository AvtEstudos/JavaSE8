package Capitulo8.bookpackext;

public class ExtBook extends Capitulo8.bookpack.Book {
	
	private String editora;	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getDataPublic() {
		return dataPublic;
	}

	public void setDataPublic(int dataPublic) {
		this.dataPublic = dataPublic;
	}
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public ExtBook(String t, String a, int d, String e) {
		super(t, a, d);
		editora = e;
	}
	
	public void show() {
		super.show();
		System.out.println(editora);
		System.out.println();
	}
	
	

}
