package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		long lm = 100000;
		Integer ii = Integer.parseInt("10000"); // int
		Integer mi= Integer.parseInt(entrada.next());
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(ii);
		System.out.println(mi*3);
		System.out.println(l/3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());
		System.out.println(c + "...");
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 123.5678;
		System.out.println(d);
		
		entrada.close();
		
	}
	
}
