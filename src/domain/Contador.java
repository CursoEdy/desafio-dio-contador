package domain;

import java.util.Locale;
import java.util.Scanner;

import exceptions.ParametroInvalidoException;

public class Contador {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Informe o primeiro valor para a contagem");
		int valorA = scanner.nextInt();
		System.out.println("informe o segundo valor para a contagem");
		int valorB = scanner.nextInt();
			
		try {
			contar(valorA, valorB);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static void contar(int valueA, int valueB) throws ParametroInvalidoException {
		
		if(valueA < valueB) {
			throw new ParametroInvalidoException("Parametros de contagem inválidos");
		}
		
		int contador = valueA - valueB;
		for (int i=0; i <= contador; i++) {
			System.out.println("Contator: " + (i+1));
		}
		
		
	}

}
