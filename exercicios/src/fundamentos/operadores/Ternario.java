package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 2.6;
		
		String resultadoParcial = media >= 5.0 ? "em Recuperação" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		System.out.println("O aluno está "+resultadoFinal);
		
		double nota = 1.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não";
		
		System.out.printf("Tem desconto? %s", resultado);
		
	}
	
}
