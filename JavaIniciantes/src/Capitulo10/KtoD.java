package Capitulo10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
//Teclado para o arquivo
public class KtoD {

	public static void main(String[] args) {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Entre um texto ('stop' para fechar).");
		
		try (FileWriter fw = new FileWriter("C:\\Andre\\teste.txt")){
			
			do {
				System.out.print(": ");
				str = br.readLine();
				
				if(str.compareTo("stop") == 0) 
					break;
				
				str = str + "\r\n"; //adiciona a nova linha
				
				fw.write(str);
			} while (str.compareTo("stop") != 0);
			
		} catch (Exception exc) {
			System.out.println("I/O Error: " + exc);
		}

	}

}
