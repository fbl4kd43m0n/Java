package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("Franciny");
		System.out.print(" Salles\n\n");
		
		System.out.println("Bom");
		System.out.println(" dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		System.out.printf("Salário: %.1f\n", 1234.5678 );
		
		//int a = 3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		//entrada.nextDouble();
		
		System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);
		
		entrada.close();
		
	}

}
