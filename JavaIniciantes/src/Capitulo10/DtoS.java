package Capitulo10;

import java.io.BufferedReader;
import java.io.FileReader;

//Disco para tela
public class DtoS {

	public static void main(String[] args) {
		
		String s;
		
		//Cria e usa um FileReader encapsulado em um Bufferdreader
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Andre\\teste.txt"))) {
			while ((s = br.readLine()) != null) { //Le no arquivo e exibe na tela
				System.out.println(s);
				
			}
		} catch (Exception exc) {
			System.out.println("I/O Error: " + exc);
		}

	}

}
