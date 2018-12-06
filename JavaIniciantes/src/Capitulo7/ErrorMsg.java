package Capitulo7;

// A palavra final impede a sobreposição
public class ErrorMsg {
	
	final int OUTERR = 0;
	final int INEER = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	
	String msgs[] = {
		"Output Erro",
		"Input Error",
		"Disk Full",
		"Index Out-of-Bounds"		
	};
	
	String getErrorMsg(int i) {
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Codigo de erro invalido";
	}
}
