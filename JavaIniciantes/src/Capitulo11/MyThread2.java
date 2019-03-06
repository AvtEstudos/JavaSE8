package Capitulo11;

public class MyThread2 implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	//Contrói uma nova thread.
	public MyThread2(String name, int nums[]) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start(); //inicia a thread
	}
	
	//Começa a execução da nova thread
	public void run() {
		int sum;
		
		System.out.println(thrd.getName() + " iniciando.");
		
		answer = sa.sumArray(a);
		System.out.println("Soma de " + thrd.getName() + " é " + answer);
		
		System.out.println(thrd.getName() + " terminando.");
	}
}
