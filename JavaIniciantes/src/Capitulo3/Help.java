package Capitulo3;

public class Help {
	
	void helpON (int what) {
		
		switch (what) {
		case '1':
			System.out.println("O if:\n");
			System.out.println("if(condição) declarações;");
			System.out.println("else declarações;");			
			break;
			
		case '2':
			System.out.println("O switch:\n");
			System.out.println("switch(expressão) {");
			System.out.println("	case constante:");
			System.out.println("		declaração sequencia");
			System.out.println("		break;");
			System.out.println("	// ...");
			System.out.println("}");
			break;
			
		case '3':
			System.out.println("O for:\n");
			System.out.println("for(inicio; condição; interação)");
			System.out.println("	declaração;");			
			break;			

		case '4':
			System.out.println("O while:\n");
			System.out.println("while(condição) declaração;");						
			break;
			
		case '5':
			System.out.println("O do-while:\n");
			System.out.println("do {");
			System.out.println("	declaração;");			
			System.out.println("} while (condição);");
			break;			
			
		case '6':
			System.out.println("O break:\n");
			System.out.println("break; or break label;");
			break;
			
		case '7':
			System.out.println("O continue:\n");
			System.out.println("continue; or continue label;");				
			break;				
		
		}			
	
		System.out.println();	
	}		
		
	void showMenu() {

		System.out.println("Ajuda:");
		System.out.println("	1. if");
		System.out.println("	2. switch");
		System.out.println("	3. for");
		System.out.println("	4. while");
		System.out.println("	5. do-while");		
		System.out.println("	6. break");
		System.out.println("	7. continue\n");				
		System.out.print("Escolha uma opção (q para sair): ");		
		
	}
	
	boolean isValid(int choice) {
	
		if (choice < '1' | choice > '7' & choice != 'q') return false;
		else return true;
		
	}
	
}
