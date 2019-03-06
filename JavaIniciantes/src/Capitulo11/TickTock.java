package Capitulo11;

public class TickTock {
	
	String state; //contém o estado do relogio
	
	synchronized void tick(boolean running) {
		if(!running) { //interrompe o relógio
			state = "ticked";
			notify(); //notifica qualquer thread que estiver esperando
			return;
		}
		
		System.out.print("Tick ");
		
		state = "ticked"; //define o estado atual com ticked
		
		notify(); //permite que o tock() seja executado - tick() notifica tock().
		
		try {
			while (!state.equals("tocked")) {
				wait(); //espera tock() terminar - tick() espera tock().				
			}			
		} catch (InterruptedException exc) {
			System.out.println("Thread interrompida.");
		}
	}	
	
	synchronized void tock(boolean running) {
		if(!running) { //interrompe o relógio
			state = "tocked";
			notify(); //notifica qualquer thread que estiver esperando
			return;
		}
		
		System.out.println("Tock ");
		
		state = "tocked"; //define o estado atual com tocked
		
		notify(); //permite que o tick() seja executado - tock() notifica tick().
		
		try {
			while (!state.equals("ticked")) {
				wait(); //espera tick() terminar - tock() espera tick().				
			}			
		} catch (InterruptedException exc) {
			System.out.println("Thread interrompida.");
		}
	}
	
	

}
