package Capitulo11;

//Demonstra as prioridades das threads
public class Priority implements Runnable {

	int count;
	Thread thrd;
	
	static boolean stop = false;
	static String currentName;
	
	/*
	 * Constr�i uma nova thread. Observe que esse construtor n�o inicia
	 * realmente a execu��o das threads.
	 */
	
	Priority(String name){
		thrd = new Thread(this, name);
		count = 0;
		currentName = name;
	}
	
	//Come�a a execu��o na nova thread.
	public void run() {
		System.out.println(thrd.getName() + " iniciando.");
		
		do {
			count++;
			
			if(currentName.compareTo(thrd.getName()) != 0) {
				currentName = thrd.getName();
				System.out.println("Em " + currentName);
			}
			
		} while (stop == false && count < 10000000);
		stop = true;
		
		System.out.println("\n" + thrd.getName() + " finalizando.");
		
	}
}
