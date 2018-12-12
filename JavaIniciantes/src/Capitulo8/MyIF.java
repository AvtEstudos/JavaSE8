package Capitulo8;

//Método padrão
public interface MyIF {
	
	//Declaração comum de uma interface
	int getUserID();
	
	//Este é um método padrão. Observe que ele fornece uma implementação padrão
	default int getAdminID() {
		return 1;
	}
	
	//Este é um método de interface estático, ele poderá ser chamado sem a necessidade de instanciar um objeto
	static int getUniversalID() {
		return 0;
	}

}
