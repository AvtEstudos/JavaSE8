package Capitulo10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		
		int i;
				
		//Verifica se os dois arquivos foram especificados
		if(args.length != 2) {
			System.out.println("Uso: CopyFile from to");
			return;
		}
		
		//Copia um arquivo
		try (FileInputStream fin = new FileInputStream(args[0]);
			 FileOutputStream fout = new FileOutputStream(args[1])) 
		{
						
			do {
				i = fin.read();
				if(i != -1) 
					fout.write(i);
				
			} while (i != -1);
			
		} catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		} 

	}

}
