package Capitulo5;

public class StrOps {

	public static void main(String[] args) {
		
		String str1 = "Quando se trata de programação Web, java é o 1º.";		
		String str2 = new String(str1);
		String str3 = "Strings em Java são potentes.";
		int result, idx;
		char ch;
		
		System.out.println("Tamanho str1: " + str1.length());
		
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		
		System.out.println();
		
		if(str1.equals(str2))
			System.out.println("str1 igual a str2");
		else
			System.out.println("str1 diferente de str2");
		
		result = str1.compareTo(str3);
		if(result == 0)
			System.out.println("str1 e str3 são iguais");
		else if (result < 0)
			System.out.println("str1 é menor que str3");
		else
			System.out.println("str1 é maior que str3");
		
		str2 = "Um Dois Três Um";
		
		idx = str2.indexOf("Um");
		System.out.println("Indice da primeira ocorrência: " + idx);
		
		idx = str2.lastIndexOf("Um");
		System.out.println("Indice da ultima ocorrência: " + idx);

	}

}
