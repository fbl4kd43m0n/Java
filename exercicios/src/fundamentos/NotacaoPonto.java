package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		s = s.replace("X","Franciny");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Fran".toUpperCase());
		
		String y = "Bom dia X".replace("X", "Patty");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int b = 3;
		System.out.println(b);
		
	}

}
