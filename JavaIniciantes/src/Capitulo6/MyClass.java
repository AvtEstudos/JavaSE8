package Capitulo6;

public class MyClass {
	int x;
	
	MyClass() {
		System.out.println("Dentro de MyClass().");
		x = 0;
	}
	
	MyClass(int i) {
		System.out.println("Dentro de MyClass(int i).");
		x = i;
	}
	
	MyClass(double d) {
		System.out.println("Dentro de MyClass(double d).");
		x = (int) d;
	}
	
	MyClass(int i, int j) {
		System.out.println("Dentro de MyClass(int i, int j).");
		x = i * j;
	}
}
