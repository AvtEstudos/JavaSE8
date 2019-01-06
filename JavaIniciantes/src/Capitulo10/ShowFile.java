package Capitulo10;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		
		//teste();
		testeLivro(args);
	}
	
	public static void teste() {
		
		try {
			String str = "C:\\Users\\André\\git\\JavaSE8\\JavaIniciantes\\src\\Capitulo10\\teste.txt";
			
			FileInputStream fin=new FileInputStream(str);    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();			
		} catch (Exception e) {
			System.out.println(e);
		}             
	}
	
	public static void testeLivro(String[] arquivo) {
		
		int i;		
		
		//Primeiro verifica se um arquivo foi especificado
		if(arquivo.length != 1) {
			System.out.println("Uso: ShowFile File");
			return;
		}
		
		//O código a seguir usa try-with-resources para abrir um arquivo
		//e depois fecha-lo automaticamente quando o bloco try é deixado
		try (FileInputStream fin = new FileInputStream(arquivo[0])) {
			
			i = fin.read();
			if(i != -1)
				System.out.println((char)i);			
			
		} catch (IOException exc) {
			System.out.println("I/O Error: " + exc);			
		}		
		
	}
}
