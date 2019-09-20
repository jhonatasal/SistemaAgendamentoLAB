package entities;

public class Laboratorio {
	private String nome;
	private int andar;
	private int computadores;
	private Usuario locador;
	
	public Laboratorio() {

	}

	public Laboratorio(String nome, int andar, int computadores) {
		this.nome = nome;
		this.andar = andar;
		this.computadores = computadores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getComputadores() {
		return computadores;
	}

	public void setComputadores(int computadores) {
		this.computadores = computadores;
	}
}
