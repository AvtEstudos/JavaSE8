package Capitulo2;

public class RelLogOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		
		boolean b1, b2;
		
		i = 10;
		j = 11;
		if(i < j)  System.out.println("i < j");
		if(i <= j) System.out.println("i <= j");
		if(i != j) System.out.println("i != j");
		
		if(i == j) System.out.println("Este n�o ser� executado");
		if(i >= j) System.out.println("Este n�o ser� executado");
		if(i > j) System.out.println("Este n�o ser� executado");
		
		b1 = true;
		b2 = false;
		if(b1 & b2) System.out.println("Este n�o ser� executado");
		if(!(b1 & b2)) System.out.println("!(b1 & b2)) � true");
		if(b1 | b2) System.out.println("b1 | b2 � true");
		if(b1 ^ b2) System.out.println("b1 ^ b2 � true");
		
				

	}

}
