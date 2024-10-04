package exercicio_modulo_11_parte_02;

public class Pessoas implements Comparable<Pessoas> {

	private String nome;
	private String genero;
	
	public Pessoas() {
		
	}
	
	public Pessoas(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "[Nome:" + nome + ", Genero:" + genero + "]";
	}

	@Override
	public int compareTo(Pessoas o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
		
	
}
