package Capitulo10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Calcula a média de uma lista inseridos pelo usuário
public class AvgNums {

	public static void main(String[] args) throws IOException {
		
		//Cria um BufferedReader usando System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int n;
		double sum = 0.0;
		double avg, t;
		
		System.out.print("Quantos números serão inseridos: ");
		str = br.readLine();
		try {
			n = Integer.parseInt(str);			
		}
		catch(NumberFormatException exc) {
			System.out.println("formato inválido");
			n = 0;
		}
		
		System.out.println("Entre " + n + " valores.");
		
		for (int i = 0; i < n; i++) {
			System.out.print(": ");
			str = br.readLine();
			
			try {
				t = Double.parseDouble(str);				
			} catch (NumberFormatException exc) {
				System.out.println("Formato inválido");
				t = 0.0;
			}
			
			sum += t;
		}
		
		avg = sum / n;
		System.out.println("A média é: " + avg);
	}

}
