package Capitulo11;

public class MoreThreads {

	public static void main(String[] args) {
		
		System.out.println("Thread principal iniciada.");
		
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");
		
		do {
			
			System.out.print(".");
			try {
				Thread.sleep(100);
			}catch (InterruptedException exc) {
				System.out.println("Thread principal interrompida.");
			}
			
		} while(mt1.thrd.isAlive() ||
				mt2.thrd.isAlive() ||
				mt3.thrd.isAlive());
		
		System.out.println("Finalizando thread principal.");		

	}

}
