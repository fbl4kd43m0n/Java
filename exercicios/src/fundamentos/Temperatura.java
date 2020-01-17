package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (F - 32) * 5/9 = C
		
		// Definindo as constantes
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE)*FATOR;
		System.out.println("86 Fahrenheit é " + celsius + "˚C.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE)*FATOR;
		System.out.println("86 Fahrenheit é " + celsius + "˚C.");
		
		
		
	}

}
