package Capitulo4;
class Veiculo {

	int passageiro;       //numero de passageiros
	int capacidadeMaxima; //capacidade de combustivel
	int mpg;              //consumo de combustivel em milhas por galao
	
	public Veiculo(int p, int c, int m) {
		passageiro = p;
		capacidadeMaxima = c;
		mpg = m;
	}
	
	int range() {
		return capacidadeMaxima * mpg;
	}	
	
	double combustivelNecessario(int milhas)
	{
		return (double) milhas / mpg;
	}

}