package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informações do funcionário
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		float imposto = 0.00F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleado
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = '\u0010'; // ativo
		char meuStatus = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: "+meuStatus);
		
		
	}

}
