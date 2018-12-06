package Capitulo4;
public class DoisVeiculos {

	public static void main(String[] args) {

		Veiculo minivan = new Veiculo(7, 16, 21);
		Veiculo carroEsportivo = new Veiculo(2, 14, 12);
		int range1, range2;		
		double galoes;
		int dist = 252;
				
		minivan.passageiro = 7;
		minivan.capacidadeMaxima = 16;
		minivan.mpg = 21;
		
		carroEsportivo.passageiro = 2;
		carroEsportivo.capacidadeMaxima = 14;
		carroEsportivo.mpg = 12;
		
		galoes = minivan.combustivelNecessario(dist);
		System.out.println("Para rodar " + dist + " milhas, em uma minivan, são necessários " + galoes + " galoes de combustivel.");
		
		galoes = carroEsportivo.combustivelNecessario(dist);
		System.out.println("Para rodar " + dist + " milhas, em um carro esportivo, são necessários " + galoes + " galoes de combustivel.");
					
		range1 = minivan.capacidadeMaxima * minivan.mpg;
		range2 = carroEsportivo.capacidadeMaxima * carroEsportivo.mpg;
				
		System.out.println("Minivan pode carregar " + minivan.passageiro + " com a autonomia de " + range1);		
		System.out.println("Carro esportivo pode carregar " + carroEsportivo.passageiro + " com a autonomia de " + range2);		

	}

}
