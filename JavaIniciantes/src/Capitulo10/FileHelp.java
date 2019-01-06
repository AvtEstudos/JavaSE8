package Capitulo10;

public class FileHelp {

	public static void main(String[] args) {
		
		Help hlpObj = new Help("C:\\Andre\\helpfile.txt");
		String topic;
		
		System.out.println("Sistema de Ajuda. Digite 'stop' para finalizar."); 
		
		do {
			topic = hlpObj.getSelection();
			
			if(!hlpObj.helpOn(topic))
				System.out.println("Tópico não encontrado.\n");
		}while(topic.compareTo("stop") != 0);

	}

}
