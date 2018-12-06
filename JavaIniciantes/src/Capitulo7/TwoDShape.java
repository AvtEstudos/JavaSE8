package Capitulo7;

abstract class TwoDShape {
	
	private double width;
	private double height;
	private String nome;

	TwoDShape() {
		width = height = 0;
		nome = "vazio";
	}
	
	TwoDShape(double w, double h, String n){
		width = w;
		height = h;
		nome = n;
	}
	
	TwoDShape(double x, String n){
		width = height = x;
		nome = n;
	}
	
	TwoDShape(TwoDShape ob){
		height = ob.height;
		width = ob.width;
		nome = ob.nome;
	}
	
	TwoDShape(double x){
		width = height = x;		
	}
	
	TwoDShape(double w, double h){
		width = w;
		height = h;
	}
	
	void showDim() {
		System.out.println("Largura e altura são: " + width + " e " + height);
	}
	
	abstract double area();

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
