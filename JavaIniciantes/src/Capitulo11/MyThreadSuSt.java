package Capitulo11;

public class MyThreadSuSt implements Runnable {
	Thread thrd;
	
	boolean suspended; //Suspend a thread quando true
	boolean stopped; //Encerra a thread quando true
	
	MyThreadSuSt(String name){
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	
	//Ponto de entrada da thread.
	public void run() {
		System.out.println(thrd.getName() + " iniciando.");
		try {
			
			for (int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				
				if ((i % 10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}			
			
			//Usa um bloco sincronizado para verificar suspended e stopped
				synchronized(this) {
					while(suspended) {
						wait();
					}
					
					if(stopped) break;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Encerra a thread.
	synchronized void mystop() {
		stopped = true;
		
		//O código a seguir assegura que uma thread suspensa possa ser encerrada.
		suspended = false;
		notify();
	}
	
	//Suspende a thread.
	synchronized void mysuspend() {
		suspended = true;
	}
	
	//Retoma a thread.
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}
