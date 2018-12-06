package Capitulo6;

public class SDemo {

	public static void main(String[] args) {
		
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();
		
		//Cada objeto com sua própria variavel
		ob1.x = 10;
		ob2.x = 20;
		
		System.out.println("Com certeza, ob1.x e ob2 são independente.");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
		System.out.println();
		
		//Cada objeto compartilha uma cópia da variavel estatica
		System.out.println("A variavel y é compartilhada.");
		StaticDemo.y = 19;
		System.out.println("Configura StaticDemo.y com 19.");
		
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
		
		StaticDemo.y = 100;
		System.out.println("Alterado StaticDemo.y para 100.");
		
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();

	}

}
