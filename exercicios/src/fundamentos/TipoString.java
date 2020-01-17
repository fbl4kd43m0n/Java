package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá gente".charAt(2));
		
		String s = "Boa noite";
		s = s.toUpperCase();
		s="Bom dia";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.startsWith("bom"));
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.length());
		System.out.println(s.endsWith("dia"));
		System.out.println(s.equals("bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));
		
		var nome="Andres";
		var sobrenome="Rojas";
		var idade = 3;
		var salario = 1234.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + 
				"\nIdade " + idade + "\nSalario: " + salario);
		System.out.printf("O menino %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome,idade,salario);
		
		String frase = String.format("\nO menino %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome,idade,salario);
		System.out.println(frase);
	}

}
