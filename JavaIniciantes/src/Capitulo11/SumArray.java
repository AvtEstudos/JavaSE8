package Capitulo11;

public class SumArray {
	
	private int sum;
	
	synchronized int sumArray(int nums[]) {
		sum = 0; //redefine sum
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("Execu��o total " + Thread.currentThread().getName() + " � " + sum);
			
			try {
				Thread.sleep(10); //permite a altern�ncia de tarefas
			}catch (InterruptedException exc) {
				System.out.println("Thread interrompida.");
			}
		}
		
		return sum;
	}

}
