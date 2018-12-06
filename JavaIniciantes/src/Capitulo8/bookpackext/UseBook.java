package Capitulo8.bookpackext;

public class UseBook {

	public static void main(String[] args) {
		Capitulo8.bookpack.Book books[] = new Capitulo8.bookpack.Book[5];
		
		books[0] = new Capitulo8.bookpack.Book("Java: Guia do Iniciante", "Schildt", 2014);
		books[1] = new Capitulo8.bookpack.Book("Java: Referencia Completa", "Schildt", 2014);
		books[2] = new Capitulo8.bookpack.Book("A arte do Java", "Schildt e Holmes", 2003);
		books[3] = new Capitulo8.bookpack.Book("A crescente da tempestade vermelha", "Clancy", 1986);
		books[4] = new Capitulo8.bookpack.Book("Na estrada", "Kerouac", 1955);
		
		for (int i = 0; i < books.length; i++) {
			books[i].show();
		}


	}

}
