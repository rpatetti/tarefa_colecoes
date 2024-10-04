package exercicio_modulo_11_parte_02;

import java.util.Comparator;

public class Compara_genero implements Comparator<Pessoas> {

	@Override
	public int compare(Pessoas o1, Pessoas o2) {
		return o1.getGenero().compareTo(o2.getGenero());
	}

}
