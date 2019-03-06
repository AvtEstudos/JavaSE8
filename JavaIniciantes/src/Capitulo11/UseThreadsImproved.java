package Capitulo11;

public class UseThreadsImproved {

	public static void main(String[] args) {
		
		System.out.println("Iniciando a thread principal.");
		
		MyThread mt = new MyThread("Filho 1#");
		
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Thread principal interrompida.");
			}
		}
		
		System.out.println("Finalizando thread principal.");

	}

}
