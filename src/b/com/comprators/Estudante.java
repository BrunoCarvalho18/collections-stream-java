package b.com.comprators;

public class Estudante implements Comparable<Estudante> {
	
	private final String nome;
	private final Integer idade;
	
	public Estudante(String nome, Integer idade) {
		this.nome=nome;
		this.idade=idade;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", idade=" + idade + "]";
	}
	
	@Override
	public int compareTo(Estudante o) {
		// TODO Auto-generated method stub
		return this.getIdade() -o.getIdade();
	}
	
	

}
