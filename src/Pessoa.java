
public class Pessoa {
	private String nome;
	private int idade;


	public Pessoa(String umNome, int umaIdade) {
		this.nome = umNome;
		this.idade = umaIdade;
	}

	public int verIdade() {
		return idade;
	}

	public String verNome() {
		return nome;
	}

	public void fazAniversario() {
		idade += 1;
	}

	// Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
