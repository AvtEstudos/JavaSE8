package Capitulo12;

public class EnumDemo {

	public static void main(String[] args) {
		
		Transport tp; //Declara uma refer�ncia Transport.
		
		tp = Transport.AIRPLANE; //Atribui a tp a constante AIRPLANE.
		
		//Exibe um valor da enum.
		System.out.println("Valor de tp: " + tp);
		System.out.println();
		
		tp = Transport.TRAIN;
		
		//Compara dois valores da ENUM.
		if(tp == Transport.TRAIN) //Compara dois objetos Transport em busca de igualdade.
			System.out.println("tp cont�m TRAIN.\n");
		
		//Usa uma enum para controlar uma instru��o switch
		switch (tp) { //Usa uma enumera��o para controlar uma instru��o switch
		case CAR:
			System.out.println("Um carro transporta pessoas.");
			break;
			
		case TRUCK:
			System.out.println("Um caminh�o transporta carga..");
			break;
			
		case AIRPLANE:
			System.out.println("Um avi�o vooa.");
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
