package Capitulo11;

public class Suspend {

	public static void main(String[] args) {
		MyThreadSuSt ob1 = new MyThreadSuSt("My Thread");
		
		try {
			
			Thread.sleep(1000); //permite que a thread ob1 comece a ser executada
			
			ob1.mysuspend();
			System.out.println("Suspendendo a thread.");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Retomando a thread.");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Suspendendo a thread.");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Retomando a thread.");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Parando a thread.");
			ob1.mystop();
			
		} catch (InterruptedException e) {
			System.out.println("Thread principal interrompida.");
		}
		
		//Espera a thread terminar
		try {
			ob1.thrd.join();
		} catch (InterruptedException e) {
			System.out.println("Thread principal interrompida.");
		}
		
		System.out.println("Saindo da thread principal.");
	}

}
