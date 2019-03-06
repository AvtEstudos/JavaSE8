package Capitulo11;

public class MyThread implements Runnable {
	
	Thread thrd;

	//Constroi uma nova thread	
	public MyThread(String name) {
		thrd = new Thread(this, name);
		thrd.start(); //Inicia a thread
	}
	
	//Começa a execução da nova thread
	public void run() {
		System.out.println(thrd.getName() + " iniciando.");
		
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("Na " + thrd.getName() + " , a contagem é " + count);
			}
		}catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrompido.");
		}
		System.out.println(thrd.getName() + " terminando.");
	}
}
