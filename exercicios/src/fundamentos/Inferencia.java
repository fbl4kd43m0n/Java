package fundamentos;

public class Inferencia {
	
	//double a = 4.5;
	
	public static void main(String[] args) {
		
		double a = 4.5; // Declaração e inicialização
		System.out.println(a);
		
		a=12.57;
		System.out.println(a);
		
		var b = 5.5;
		System.out.println(b);
		
		var c = "Franciny";
		System.out.println(c);
		
		c="Molestitas";
		System.out.println(c);
		
		double d; // Variável foi declarada
		d=123.65; // Variável foi inicializada
		System.out.println(d); // Variável foi usada
		
		
		// Gera um erro
		//var e;
		//e=123.45;
		//var e=123.45;
		
		
		var f = 12; // valor inteiro
		//f=12.01; //gera erro
		
	}

}
