package Capitulo12;

//Usa a importa��o est�tica para tornar sqrt() e pow() vis�veis.
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

//Importa��o est�tica
public class Quadratic {

	public static void main(String[] args) {
		
		// a, b, e c representam os coeficientes da
		// equa��o quadr�tica: ax� + bx + c = 0
		double a, b, c, x;
		
		// Resolve 4x� + x - 3 = 0 para achar x.
		a = 4;
		b = 1;
		c = -3;
		
		/*
		 ****************************************************************
		 ****************** Sem a importa��o estatica *******************
		 ****************************************************************
		 */
		// Encontra a primeira solu��o.
		//x = (-b + Math.sqrt(Math.pow(b, 2) -4 * a * c)) / (2 * a);
		//System.out.println("Primeira solu��o: " + x);
		
		// Encontra a segunda solu��o.
		//x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		//System.out.println("Segunda solu��o: " + x);		
		
		/*
		 ****************************************************************
		 ****************** Com a importa��o estatica *******************
		 ****************************************************************
		 */
		// Encontra a primeira solu��o.
		x = (-b + sqrt(pow(b, 2) -4 * a * c)) / (2 * a);
		System.out.println("Primeira solu��o: " + x);
		
		// Encontra a segunda solu��o.
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Segunda solu��o: " + x);

	}

}
