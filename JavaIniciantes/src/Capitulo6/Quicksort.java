package Capitulo6;

public class Quicksort {
	
	private static int numChamada;
	
	//Recebe o array de caracteres com os itens
	static void qsort(char items[]) {
		
		//Faz a primeira chamada de qs
		//Param 1: Lista de itens
		//Param 2: Indica como 0 o items mais extremo a esquerda
		//Param 3: Indica como tamanho da lista menos 1 como o item mais extremo a esquerda
		qs(items, 0, items.length-1);
	}
	
	//Recebe o array com os itens indice mais extremo a esquerda e indice mais extremo a direita
	private static void qs(char items[], int left, int right) {
		int i, j;
		char x, y, w;
		
		numChamada++;
		
		System.out.println("******************************  " + numChamada + "  ******************************");
		
		System.out.print("Array: ");
		for (int aI = 0; aI < items.length; aI++) {
			System.out.print(items[aI] + " ");
		}		
		System.out.println();
		System.out.println("left: " + left);
		System.out.println("right: " + right);
		//Atualiza i com o valor da esquerda
		i = left; 
		
		//Atualiza j com o valor da direita
		j = right;		

		System.out.println("Indice do item: " + (left+right)/2);
		x = items[(left+right)/2];
		
		System.out.println("Item: " + x);
		
		System.out.println("Inicia do-while *i <= j* ");
		int iDoWhile=0;
		System.out.println();
		do {
			
			iDoWhile++;			
			System.out.println("Iteração do doWhile: " + iDoWhile);
			
			System.out.println("Identifica posição onde x (" + x + ") é menor, até right (" + right + "). Com i (" + i + ")");
			while((items[i] < x) && (i < right)) i++;
			System.out.println("i: " + i);
			
			System.out.println("Identifica posição onde x (" + x + ") é maior, partindo de left (" + left + "). Com j (" + j + ")");
			while((x < items[j]) && (j > left)) j--;
			System.out.println("j: " + j);
						
			if(i <= j) {
				System.out.println("i menor ou igual a j.");
				System.out.println("Troca itens da posição j (" + j + ") e i (" + i + ").");
				System.out.println("items[i]: " + items[i]);
				System.out.println("items[j]: " + items[j]);
				
				y = items[i];
				w = items[j];
				items[i] = items[j];
				items[j] = y;
				i++; 
				j--;
				
				System.out.print("Array: ");
				for (int aI = 0; aI < items.length; aI++) {
					
					if (items[aI] == y || items[aI] == w)
						System.out.print( "*" + items[aI] + "* ");
					else
						System.out.print(items[aI] + " ");
					
				}		
				System.out.println();
			}
			
			System.out.println();
			
		}while(i <= j);
		
		System.out.print("Array: ");
		for (int aI = 0; aI < items.length; aI++) {
			System.out.print(items[aI] + " ");
		}
		
		System.out.println();
		
		if (left < j) {
			System.out.println("left (" + left + ") menor que j (" + j + "), faz uma nova chamada ao qs.");			
			qs(items, left, j);
		}
		
		if (i < right) {
			System.out.println("i (" + i + ") menor que right (" + right + "), faz uma nova chamada ao qs.");
			qs(items, i, right);
		}
		
	}

}
