package entities;

public class Professor extends Usuario {
	private String materia;
	private int matricula;

	public Professor() {

	}

	public Professor(String nome, int idade, String cpf, int id, String materia, int matricula) {
		super(nome, idade, cpf, id);
		this.materia = materia;
		this.matricula = matricula;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}	
