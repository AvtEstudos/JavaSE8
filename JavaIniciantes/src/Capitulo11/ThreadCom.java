package Capitulo11;

public class ThreadCom {

	public static void main(String[] args) {
		TickTock tt = new TickTock();
		MyThreadTickTock mt1 = new MyThreadTickTock("Tick", tt);
		MyThreadTickTock mt2 = new MyThreadTickTock("Tock", tt);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Thread principal interrompida.");
		}
		
	}

}
