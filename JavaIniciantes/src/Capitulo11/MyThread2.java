package Capitulo11;

public class MyThread2 implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	//Contr�i uma nova thread.
	public MyThread2(String name, int nums[]) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start(); //inicia a thread
	}
	
	//Come�a a execu��o da nova thread
	public void run() {
		int sum;
		
		System.out.println(thrd.getName() + " iniciando.");
		
		answer = sa.sumArray(a);
		System.out.println("Soma de " + thrd.getName() + " � " + answer);
		
		System.out.println(thrd.getName() + " terminando.");
	}
}
