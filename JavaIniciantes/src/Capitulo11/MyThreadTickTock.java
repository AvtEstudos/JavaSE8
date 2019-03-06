package Capitulo11;

public class MyThreadTickTock implements Runnable {
	Thread thrd;
	TickTock ttOb;
	
	//Constr�i uma nova thread.
	MyThreadTickTock(String name, TickTock tt){
		thrd = new Thread(this, name);
		ttOb = tt;
		thrd.start(); //inicia a thread.
	}
	
	//Come�a a execu��o da nova thread.
	@Override
	public void run() {
		
		if(thrd.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++) {
				ttOb.tick(true);
			}
			ttOb.tick(false);
		}
		else {
			for (int i = 0; i < 5; i++) {
				ttOb.tock(true);
			}
			ttOb.tock(false);
		}		
	}
}
