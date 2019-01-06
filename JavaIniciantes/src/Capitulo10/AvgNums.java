package Capitulo10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Calcula a m�dia de uma lista inseridos pelo usu�rio
public class AvgNums {

	public static void main(String[] args) throws IOException {
		
		//Cria um BufferedReader usando System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int n;
		double sum = 0.0;
		double avg, t;
		
		System.out.print("Quantos n�meros ser�o inseridos: ");
		str = br.readLine();
		try {
			n = Integer.parseInt(str);			
		}
		catch(NumberFormatException exc) {
			System.out.println("formato inv�lido");
			n = 0;
		}
		
		System.out.println("Entre " + n + " valores.");
		
		for (int i = 0; i < n; i++) {
			System.out.print(": ");
			str = br.readLine();
			
			try {
				t = Double.parseDouble(str);				
			} catch (NumberFormatException exc) {
				System.out.println("Formato inv�lido");
				t = 0.0;
			}
			
			sum += t;
		}
		
		avg = sum / n;
		System.out.println("A m�dia �: " + avg);
	}

}
