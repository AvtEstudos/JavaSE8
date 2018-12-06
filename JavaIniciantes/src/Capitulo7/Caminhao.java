package Capitulo7;

public class Caminhao extends Veiculo {
	
	private int cargocap;
	
	public int getCargocap() {
		return cargocap;
	}

	public void setCargocap(int cargocap) {
		this.cargocap = cargocap;
	}

	public Caminhao(int p, int f, int m, int c) {
		super(p, f, m);
		
		cargocap = c;
	}
	
	

}
