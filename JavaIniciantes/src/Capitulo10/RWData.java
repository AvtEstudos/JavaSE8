package Capitulo10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RWData {

	public static void main(String[] args) {
		
		int i = 10;
		double d = 1023.56;
		boolean b = true;
		
		//Grava alguns valores
		try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("C:\\Andre\\testdata.txt"))) 
		{
			System.out.println("Escrevendo " + i);
			dataOut.writeInt(i);
			
			System.out.println("Escrevendo " + d);
			dataOut.writeDouble(d);
			
			System.out.println("Escrevendo " + b);
			dataOut.writeBoolean(b);
			
			System.out.println("Escrevendo " + 12.2 * 7.4);
			dataOut.writeDouble(12.2 * 7.4);
			
		} catch (IOException exc) {
			System.out.println("Erro ao escrever.");
			return;
		}
		
		System.out.println();
		
		//Agora os lê
		try(DataInputStream dataIn = new DataInputStream(new FileInputStream("C:\\Andre\\testdata.txt")))
		{
			i = dataIn.readInt();
			System.out.println("Lendo " + i);
			
			d = dataIn.readDouble();
			System.out.println("Lendo " + d);
			
			b = dataIn.readBoolean();
			System.out.println("Lendo " + b);
			
			d = dataIn.readDouble();
			System.out.println("Lendo " + d);
									
		}catch (IOException exc) {
			System.out.println("Erro na leitura");
		}
		

	}

}
