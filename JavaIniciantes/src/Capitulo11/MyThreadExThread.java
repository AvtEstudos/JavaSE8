package Capitulo11;

public class MyThreadExThread extends Thread {
	
	public MyThreadExThread(String name) {
		super(name); //nomeia a thread
		start(); // inicia a thread
	}
	
	public void run() {
		System.out.println(getName() + " iniciando.");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("Em " + getName() + ", a contagem é " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(getName() + " terminando."); 
		}
	}

}
