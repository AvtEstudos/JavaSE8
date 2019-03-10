package Capitulo12;

//Enumeração de meios de transporte.
//Usa um construtor, uma variável de instância e um método com a enumeração.
enum Transport {	
	
	//Declara uma enumeração.
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); //Observe os valores de inicialização.
	
	private int speed; //velocidade típica de cada meio de transporte
	//Adiciona uma variavel de instância
	
	//Construtor
	Transport(int s) {
		speed = s;
	}
	
	//Método
	int getSpeed() {
		return speed;
	}
	
}
