package application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import services.CadastroUsuario;
import services.InfoLabs;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		InfoLabs il = new InfoLabs();
		CadastroUsuario ca = new CadastroUsuario();
		System.out.println("BEM VINDO AO PROGRAMA DE AGENDAMENTO DE LABORATORIO!");
		ca.cadastrarUsuario(ca);

		sc.close();
	}

}
