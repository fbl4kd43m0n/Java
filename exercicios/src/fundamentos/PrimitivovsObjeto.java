package fundamentos;

public class PrimitivovsObjeto {
	
	public static void main(String[] args) {
		
		String s = "texto"; // String é uma classe, s é um objeto e tem atributos e comportamentos
		s.toUpperCase();
		
		String f = new String("texto");
		
		int a = 123; // Tipo primitivo, não tem atributos e comportamentos.
		
		// Wrappers são a versão objeto dos tipos primitivos
		System.out.println(a);
		
		// Tudo em Java é objeto, menos os tipos primitivos
		
	}

}
