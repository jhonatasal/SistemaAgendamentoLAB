package services;

import java.util.Date;

import entities.Laboratorio;
import entities.Usuario;

public class ReservaLab {
	private Laboratorio lab;
	private Usuario usuario;
	private Date data;

	public ReservaLab() {

	}

	public ReservaLab(Laboratorio lab, Usuario usuario, Date data) {
		this.lab = lab;
		this.usuario = usuario;
		this.data = data;
	}

	public Laboratorio getLab() {
		return lab;
	}

	public void setLab(Laboratorio lab) {
		this.lab = lab;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public static void reservarLaboratorio(Laboratorio lab, Usuario usuario, Date data) {
		
	}

	private boolean verificaLabDisponivel(Laboratorio lab) {
		if (lab.isStatus() == true) { // Disponivel
			return true;
		} else {
			return false;// Indisponivel
		}
	}

	private void ocupaLaboratorio(Laboratorio lab) {
		if (verificaLabDisponivel(lab) == true) {
			lab.setStatus(true);
		} else {
			System.out.println("Esse Laboratorio não esta disponivel!");
		}
	}
}
