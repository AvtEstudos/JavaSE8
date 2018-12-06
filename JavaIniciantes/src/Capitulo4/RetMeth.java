package Capitulo4;
public class RetMeth {

	public static void main(String[] args) {
		
		Veiculo minivan = new Veiculo(7, 16, 21);
		Veiculo carroEsportivo = new Veiculo(2, 14, 12);
		int range1, range2;		
				
		minivan.passageiro = 7;
		minivan.capacidadeMaxima = 16;
		minivan.mpg = 21;
		
		carroEsportivo.passageiro = 2;
		carroEsportivo.capacidadeMaxima = 14;
		carroEsportivo.mpg = 12;
		
		range1 = minivan.range();
		range2 = carroEsportivo.range();
		
		System.out.println("Minivan pode carregar " + minivan.passageiro + " com a autonomia de " + range1);		
		System.out.println("Carro esportivo pode carregar " + carroEsportivo.passageiro + " com a autonomia de " + range2);		

	}

}
