package Capitulo12;

public class EnumDemo {

	public static void main(String[] args) {
		
		Transport tp; //Declara uma referência Transport.
		
		tp = Transport.AIRPLANE; //Atribui a tp a constante AIRPLANE.
		
		//Exibe um valor da enum.
		System.out.println("Valor de tp: " + tp);
		System.out.println();
		
		tp = Transport.TRAIN;
		
		//Compara dois valores da ENUM.
		if(tp == Transport.TRAIN) //Compara dois objetos Transport em busca de igualdade.
			System.out.println("tp contém TRAIN.\n");
		
		//Usa uma enum para controlar uma instrução switch
		switch (tp) { //Usa uma enumeração para controlar uma instrução switch
		case CAR:
			System.out.println("Um carro transporta pessoas.");
			break;
			
		case TRUCK:
			System.out.println("Um caminhão transporta carga..");
			break;
			
		case AIRPLANE:
			System.out.println("Um avião vooa.");
			break;
			
		case TRAIN:
			System.out.println("Um trem corre nos trilhos.");
			break;
			
		case BOAT:
			System.out.println("Um barco boa na agua.");
			break;			

		default:
			break;
		}
		

	}

}
