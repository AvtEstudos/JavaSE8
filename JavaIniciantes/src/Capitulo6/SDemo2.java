package Capitulo6;

public class SDemo2 {

	public static void main(String[] args) {
		System.out.println("val � " + StaticMeth.val);
		System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
		
		StaticMeth.val = 4;
		System.out.println("val � " + StaticMeth.val);
		System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
	}

}
