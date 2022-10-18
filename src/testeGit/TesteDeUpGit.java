package testeGit;

public class TesteDeUpGit {
	private String nome;
	private String idade;
	private String sexo;
	
	public TesteDeUpGit() {
		// TODO Auto-generated constructor stub
	}

	public TesteDeUpGit(String nome, String idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "TesteDeUpGit [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
}
