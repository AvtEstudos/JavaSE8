package Capitulo11;

public class JoinThreads {

	public static void main(String[] args) {
		
		System.out.println("Thread principal iniciada.");
		
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");
		
		try {
			mt1.thrd.join();
			System.out.println("Child #1 joined.");
			
			mt2.thrd.join();
			System.out.println("Child #2 joined.");
			
			mt3.thrd.join();
			System.out.println("Child #3 joined.");
			
		} catch (InterruptedException exc) {
			System.out.println("Thread principal interrompida.");
		}
		
		System.out.println("Finalizando thread principal.");

	}

}
