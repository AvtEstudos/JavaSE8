package Capitulo11;

public class UseThreads {

	public static void main(String[] args) {
		
		System.out.println("Thread principal iniciada.");
		
		//Primeiro, constroi um objeto MyThread.
		MyThread mt = new MyThread("Filho #1");
		
		//Em seguida, constroi uma thread a partir desse objeto.
		Thread newThrd = new Thread(mt);
		
		//Para concluir, começa a execução da thread.
		newThrd.start();
		
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Thread principal interrompida.");
			}
		}
		
		System.out.println("Finalizando a thread principal.");

	}

}
