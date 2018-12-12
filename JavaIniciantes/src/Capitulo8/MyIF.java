package Capitulo8;

//M�todo padr�o
public interface MyIF {
	
	//Declara��o comum de uma interface
	int getUserID();
	
	//Este � um m�todo padr�o. Observe que ele fornece uma implementa��o padr�o
	default int getAdminID() {
		return 1;
	}
	
	//Este � um m�todo de interface est�tico, ele poder� ser chamado sem a necessidade de instanciar um objeto
	static int getUniversalID() {
		return 0;
	}

}
