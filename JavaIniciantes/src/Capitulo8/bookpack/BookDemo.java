package Capitulo8.bookpack;

public class BookDemo {

	public static void main(String[] args) {
		Book books[] = new Book[5];
		
		books[0] = new Book("Java: Guia do Iniciante", "Schildt", 2014);
		books[1] = new Book("Java: Referencia Completa", "Schildt", 2014);
		books[2] = new Book("A arte do Java", "Schildt e Holmes", 2003);
		books[3] = new Book("A crescente da tempestade vermelha", "Clancy", 1986);
		books[4] = new Book("Na estrada", "Kerouac", 1955);
		
		for (int i = 0; i < books.length; i++) {
			books[i].show();
		}

	}

}
