package Capitulo10;

import java.io.PrintWriter;

//Demonstra PrintWriter
public class PrintWriterDemo {

	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);
		int i = 10;
		double d = 123.65;
		
		pw.println("Usando PrintWriter");
		pw.println(i);
		pw.println(d);
		
		pw.println(i + " + " + d + " é " + (i+d));

	}

}
