package Capitulo5;

public class Encode {

	public static void main(String[] args) {
		String msg = "Isto é um teste";
		String encmsg = "";
		String decmsg = "";
		int key = 88;
		
		System.out.print("Messagem origional: ");
		System.out.println(msg);
		
		for (int i = 0; i < msg.length(); i++) {
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);
		}
		
		System.out.print("Mensagem codificada: ");
		System.out.println(encmsg);
		
		for (int i = 0; i < msg.length(); i++) {
			decmsg = decmsg + (char)(encmsg.charAt(i) ^ key);			
		}
		
		System.out.print("Mensagem decodificada: ");
		System.out.println(decmsg);

	}

}
