package Capitulo5;

import javax.swing.SwingConstants;

public class StringSwitch {

	public static void main(String[] args) {
		
		String command = "cancel";
		
		switch(command) {
			case "connect":
				System.out.println("Conectando");
				break;
			case "cancel":
				System.out.println("Cancelando");
				break;
			case "disconnect":
				System.out.println("Disconectando");
				break;
			default:
				System.out.println("Comando errando!");
				break;
				
		}

	}

}
