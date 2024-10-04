package exercicio_modulo_11_parte_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parte_2 {
	
	public static void main(String[] args) {
		
		List<Pessoas> lista = new ArrayList<Pessoas>();
		
		Pessoas a = new Pessoas("Jessica Oliveira", "F");
		Pessoas b = new Pessoas("Aline Prado", "F");
		Pessoas c = new Pessoas("Manphins Dpay", "M");
		Pessoas d = new Pessoas("Hugo Souza", "M");
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		
		Compara_genero compara_genero = new Compara_genero();
		Collections.sort(lista, compara_genero);
		
		for (Pessoas pessoa : lista) {
			System.out.println(pessoa);
		}
		
		
	}

}
