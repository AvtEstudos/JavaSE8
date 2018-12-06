package Capitulo8.bookpackext;

public class ProtectDemo {

	public static void main(String[] args) {
		
		ExtBook books[] = new ExtBook[5];
		
		books[0] = new ExtBook("Java: Guia do Iniciante", "Schildt", 2014, "McGraw-Hill Professional");
		books[1] = new ExtBook("Java: Referencia Completa", "Schildt", 2014, "McGraw-Hill Professional");
		books[2] = new ExtBook("A arte do Java", "Schildt e Holmes", 2003, "McGraw-Hill Professional");
		books[3] = new ExtBook("A crescente da tempestade vermelha", "Clancy", 1986, "Putnam");
		books[4] = new ExtBook("Na estrada", "Kerouac", 1955, "Viking");
		
		for (int i = 0; i < books.length; i++) {
			books[i].show();
		}
		
		System.out.println("Procurando todos os livros por Schildt");
		
		for (int i = 0; i < books.length; i++) {
			if(books[i].getAutor() == "Schildt") {
				System.out.println(books[i].getTitulo());
			}
		}
		
	}

}
