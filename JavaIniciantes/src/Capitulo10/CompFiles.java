package Capitulo10;

import java.io.FileInputStream;
import java.io.IOException;

public class CompFiles {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		
		//Confirma se os arquivos foram especificados
		if(args.length != 2) {
			System.out.println("Uso: Compfiles f1 f2");
			return;
		}
		
		//Compara os arquivos
		try(FileInputStream f1 = new FileInputStream(args[0]);
		    FileInputStream f2 = new FileInputStream(args[1]))
		{
			//Verifica o conteúdo de cada arquivo.
			do {
				i = f1.read();
				j = f2.read();
				
				if(i != j) break;
			}while(i != -1 && j != -1);
			
			if(i != j)
				System.out.println("Arquivos diferentes.");
			else
				System.out.println("Arquivos iguais.");
		
		}catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}		
	}
}
