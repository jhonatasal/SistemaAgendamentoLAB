package entities;

public abstract class Usuario {
	private String nome;
	private int idade;
	private String cpf;
	private int id;

	public Usuario() {

	}

	public Usuario(String nome, int idade, String cpf, int id) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.id = id;
	}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
