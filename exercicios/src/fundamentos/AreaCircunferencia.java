package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		System.out.println(2+3);
		
		int raio = 3;
		double raio2 = 3.4;
		final double PI = 3.14159; // a palavra final não permite mudar o valor da variável
		double area = PI*raio*raio;
		
		//pi=1;
		
		System.out.println(area);
		
		raio = 10;
		area = PI*raio*raio;
		
		System.out.println(area);
		System.out.println("Área = " + area);
		
	}

}
