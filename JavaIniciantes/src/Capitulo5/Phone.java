package Capitulo5;

public class Phone {

	public static void main(String[] args) {
		
		String numbers[][] = {
			{"Tom", "555-3322"},
			{"Mary", "555-8976"},
			{"Jon", "555-1037"},
			{"Rachel", "555-1400"}
		};
		
		int i=0;
		
		if(args.length != 1) {
			System.out.println("Uso: java Phone <name>");
		}			
		else {
			for (i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i][0] + ": " + numbers[i][1]);
				break;
			}
		}
		
		if(i == numbers.length)
			System.out.println("Nome não encontrado.");

	}

}
