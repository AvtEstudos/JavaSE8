package Capitulo7;
class Veiculo {

	private int passageiro;       //numero de passageiros
	private int capacidadeMaxima; //capacidade de combustivel
	private int mpg;              //consumo de combustivel em milhas por galao
	
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

	public int getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

}