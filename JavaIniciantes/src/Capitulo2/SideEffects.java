package Capitulo2;

public class SideEffects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		i = 0;
		/*
		 * Incrementada mesmo que a instru��o seja falsa
		 */
		if(false & (++i < 100))
			System.out.println("Este n�o ser� mostrado");
		
		System.out.println("if executado: " + i);
		
		/*
		 * i n�o � incrementado porque o operador ignora o incremento
		 */
		
		if(false && (++i < 100))
			System.out.println("Este n�o ser� mostrado");
		
		System.out.println("if executado: " + i);
		
		

	}

}
