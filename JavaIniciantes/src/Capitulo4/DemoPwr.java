package Capitulo4;
public class DemoPwr {

	public static void main(String[] args) {
		
		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr z = new Pwr(5.7, 0);
		
		System.out.println(x.b + " elevado a " + x.e + " é " + x.get_pwr());
		
		System.out.println(y.b + " elevado a " + y.e + " é " + y.get_pwr());
		
		System.out.println(z.b + " elevado a " + z.e + " é " + z.get_pwr());

	}

}
