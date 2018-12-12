package Capitulo8;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		
		//Note que chamada é realizada sema a necessidade de instanciar um objeto
		System.out.println("ID do usuário universal: " + MyIF.getUniversalID());
		
		MyIFImp obj = new MyIFImp();
		
		//Pode chamar o método getUserID(), método implementado diretamente por MyIFImp
		System.out.println("ID do usuário: " + obj.getUserID());
		
		//Também pode chamar getAdminID(), por causa da implementação padrão
		System.out.println("ID do administrador: " + obj.getAdminID());
		
	}

}
