package Capitulo7;

public class CaminhaoDemo {

	public static void main(String[] args) {
		Caminhao semi = new Caminhao(2, 200, 7, 44000);
		Caminhao pickUp = new Caminhao(3, 28, 15, 2000);
		
		double galoes;
		int dist = 252;
		
		galoes = semi.combustivelNecessario(dist);
		
		System.out.println("Semi pode carregar " + semi.getCargocap());
		
		System.out.println("Para ir " + dist + " milhar são necessárias " + galoes + " galões de combustivel.");
		
		galoes = pickUp.combustivelNecessario(dist);
		
		System.out.println("Pickup pode carregar " + pickUp.getCargocap());
		
		System.out.println("Para ir " + dist + " milhar são necessárias " + galoes + " galões de combustivel.");

	}

}
