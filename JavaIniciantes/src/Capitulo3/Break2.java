package Capitulo3;

public class Break2 {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		
		char ch;
		
		for ( ; ; ) {
			ch = (char) System.in.read();
			if(ch =='q') break;
		}
		
		System.out.println("You pressed q!");		

	}

}
