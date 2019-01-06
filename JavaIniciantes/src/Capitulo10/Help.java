package Capitulo10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Programa de ajuda que usa um arquivo em disco para armazenar informa��es de ajuda
 * 
 */
public class Help {

	String helpFile; //Nome do arquivo de ajuda
	
	Help(String fName){
		helpFile = fName;
	}
	
	//Exibe ajuda sobre um t�pico
	boolean helpOn(String what) {
		int ch;
		String topic, info;
		
		//Abre o arquivo de ajuda
		try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpFile))) {
			do {
				//l� caracteres at� um # ser encontrado
				ch = helpRdr.read();
				
				//agora, v� se os t�picos coincidem
				if(ch == '#') {
					topic = helpRdr.readLine();
					if(what.compareTo(topic) == 0) { // t�pico encontrado
						do {
							info = helpRdr.readLine();
							if(info != null) 
								System.out.println(info);
						} while ((info != null) && (info.compareTo("") != 0));
						
						return true;
					}
				}
			} while (ch != -1);
			
		} catch (IOException exc) {
			System.out.println("Erro acessando o arquivo help.");
			return false;
		}
		return false; //t�pico n�o encontrado
	}
	
	//Acessa um t�pico de ajuda
	String getSelection() {
		String topic = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entre um t�pico:");
		
		try {
			topic = br.readLine();			
		} catch (IOException exc) {
			System.out.println("Erro lendo o console.");
		}
		
		return topic;
	}
}
