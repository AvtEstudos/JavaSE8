package Capitulo12;

public class EnumDemo3 {

	public static void main(String[] args) {
					
		//Exibe a velocidade de um avião
		System.out.println("A velocidade média de um avião é " + Transport.AIRPLANE.getSpeed() + " milhas por hora.\n");
		
		//Exibe todos os meios de transporte e velocidades.
		System.out.println("Todos os transportes e velocidades: ");
		for(Transport t : Transport.values())
			System.out.println(t + " velocidade média é " + t.getSpeed() + " milhas por hora.");

	}

}
