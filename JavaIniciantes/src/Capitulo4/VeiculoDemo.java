package Capitulo4;

public class VeiculoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo minivan = new Veiculo(7, 16, 21);
		int range;
		
		minivan.passageiro = 7;
		minivan.capacidadeMaxima = 16;
		minivan.mpg = 21;
		
		range = minivan.capacidadeMaxima * minivan.mpg;
		System.out.println("Minivan pode carregar " + minivan.passageiro + " com a autonomia de " + range);		

	}

}
