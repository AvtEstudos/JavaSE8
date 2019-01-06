package Capitulo10;

import java.io.*;

public class RandomAccessDemo {

	public static void main(String[] args) {
		double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
		double d;
		
		//Abre e usa um arquivo de acesso aleat�rio
		try(RandomAccessFile raf = new RandomAccessFile("C:\\Andre\\randon.txt", "rw"))
		{
			//Grava valores no arquivo.
			for (int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);
			}
			
			//Agora l� os valores espec�ficos
			raf.seek(0); //Busca o primeiro double 
			d = raf.readDouble();
			System.out.println("O primeiro valor � " + d);
			
			raf.seek(8); //busca o segundo double
			d = raf.readDouble();
			System.out.println("O segundo valor � " + d);
			
			raf.seek(8 * 3); //busca o quarto double
			d = raf.readDouble();
			System.out.println("O quarto valor � " + d);
			
			System.out.println();
			
			//Agora l� os valores alternadamente
			System.out.println("Aqui est�o os outros valores: ");
			for (int i = 0; i < data.length; i++) {
				raf.seek(8 * i); //Busca o i-�simo double
				d = raf.readDouble();
				System.out.print(d + " ");
			}			
		}catch (Exception exc) {
			System.out.println("I/O Error: " + exc);
		}

	}

}
