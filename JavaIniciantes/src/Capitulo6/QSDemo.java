package Capitulo6;

public class QSDemo {

	public static void main(String[] args) {
		
		char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
		int i;
		
//		System.out.println("Array original: ");		
//		for (i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		
		System.out.println();
		
		Quicksort.qsort(a);
		
		System.out.println("Array ordenado: ");		
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
