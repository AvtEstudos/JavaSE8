package Capitulo4;

public class FDemo {

	int x;
	
	FDemo(int i) {
		x = i;
	}
	
	protected void finalize() {
		System.out.println("Finalizando " + x);		
	}
	
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}
