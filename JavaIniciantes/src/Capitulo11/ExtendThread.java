package Capitulo11;

public class ExtendThread {

	public static void main(String[] args) {
		System.out.println("Iniciando thread principal.");
		
		MyThreadExThread mt = new MyThreadExThread("Filho #1");
		
		for (int i = 0; i < 50; i++) {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Thread principal interrompida.");
			}
		}

		System.out.println("Finalizando thread principal.");
	}

}
