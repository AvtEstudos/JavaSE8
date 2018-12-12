package Capitulo8;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		
		//Note que chamada � realizada sema a necessidade de instanciar um objeto
		System.out.println("ID do usu�rio universal: " + MyIF.getUniversalID());
		
		MyIFImp obj = new MyIFImp();
		
		//Pode chamar o m�todo getUserID(), m�todo implementado diretamente por MyIFImp
		System.out.println("ID do usu�rio: " + obj.getUserID());
		
		//Tamb�m pode chamar getAdminID(), por causa da implementa��o padr�o
		System.out.println("ID do administrador: " + obj.getAdminID());
		
	}

}
