package Capitulo4;

public class VehConsDemo {

	public static void main(String[] args) {
		
		Veiculo minivan = new Veiculo(7, 16, 21);
		
		Veiculo sportscar = new Veiculo(2, 14, 12);
		
		double galoes;		
		int dist = 252;
		
		galoes = minivan.combustivelNecessario(dist);
		
		System.out.println("Para rodar " + dist + " milhas são necessários " + galoes + " galoes de combustivel.");
		
		galoes = sportscar.combustivelNecessario(dist);
		
		System.out.println("Para rodar " + dist + " milhas são necessários " + galoes + " galoes de combustivel.");

	}

}
