package Capitulo10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {

	public static void main(String[] args) throws IOException {
		
		//Cria um BufferedReader usando System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		System.out.println("Entre linhas do texto.");
		System.out.println("Entre stop para fechar.");
		
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));

	}

}
