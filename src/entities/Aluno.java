package entities;

public class Aluno extends Usuario {
	private String curso;
	private int periodo;

	public Aluno() {

	}

	public Aluno(String nome, int idade, String cpf, int id, String curso, int periodo) {
		super(nome, idade, cpf, id);
		this.curso = curso;
		this.periodo = periodo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

}
