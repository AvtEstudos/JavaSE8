package Capitulo12;

//Enumera��o de meios de transporte.
//Usa um construtor, uma vari�vel de inst�ncia e um m�todo com a enumera��o.
enum Transport {	
	
	//Declara uma enumera��o.
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); //Observe os valores de inicializa��o.
	
	private int speed; //velocidade t�pica de cada meio de transporte
	//Adiciona uma variavel de inst�ncia
	
	//Construtor
	Transport(int s) {
		speed = s;
	}
	
	//M�todo
	int getSpeed() {
		return speed;
	}
	
}
