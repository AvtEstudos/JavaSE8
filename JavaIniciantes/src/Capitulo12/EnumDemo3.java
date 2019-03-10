package Capitulo12;

public class EnumDemo3 {

	public static void main(String[] args) {
					
		//Exibe a velocidade de um avi�o
		System.out.println("A velocidade m�dia de um avi�o � " + Transport.AIRPLANE.getSpeed() + " milhas por hora.\n");
		
		//Exibe todos os meios de transporte e velocidades.
		System.out.println("Todos os transportes e velocidades: ");
		for(Transport t : Transport.values())
			System.out.println(t + " velocidade m�dia � " + t.getSpeed() + " milhas por hora.");

	}

}
