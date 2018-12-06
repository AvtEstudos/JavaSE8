package Capitulo3;

public class SqrRoot {

	public static void main(String[] args) {
		double num, sroot, rerr;
		
		for (num = 1.0; num < 100.0; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Raiz quadrado de " + num + " é " + sroot);
			
			rerr = num - (sroot * sroot);
			System.out.println("Erro de arredondamento " + rerr);
			System.out.println("");
		}

	}

}
