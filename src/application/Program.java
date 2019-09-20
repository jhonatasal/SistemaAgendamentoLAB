package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import services.InfoLabs;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("BEM VINDO AO PROGRAMA DE AGENDAMENTO DE LABORATORIO!");
		
		System.out.println("Digite o seu nome: ");
		System.out.println("");
		InfoLabs il = new InfoLabs();
		il.obterListaDeLaboratorios();
	}

}
