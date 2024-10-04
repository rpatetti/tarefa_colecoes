package exercicio_modulo_11_parte_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parte_01 {
	
	public static void main(String[] args) {
		
		List<String> pessoas = new ArrayList<String>();
		pessoas.add("Jessica Oliveira");
		pessoas.add("Aline Aguiar");
		pessoas.add("Hugo Souza");
		pessoas.add("Memphis Dpay");
		

		Collections.sort(pessoas);
		System.out.println(pessoas);
		
	}

}
