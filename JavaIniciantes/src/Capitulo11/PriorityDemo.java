package Capitulo11;

public class PriorityDemo {

	public static void main(String[] args) {
		Priority mt1 = new Priority("Prioridade Alta"); 
		Priority mt2 = new Priority("Prioridade Baixa");
		
		//Define as prioridades
		mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
		mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);
		
		//Inicia as threads
		mt1.thrd.start();
		mt2.thrd.start();
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch (Exception e) {
			System.out.println("Thread principal interrompida.");
		}
		
		System.out.println("\nContagem da thread de prioridade alta " + mt1.count);
		
		System.out.println("\nContagem da thread de prioridade baixa " + mt2.count);

	}

}
