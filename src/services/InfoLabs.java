package services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Laboratorio;
import entities.Usuario;

public class InfoLabs {
	private List<Laboratorio> laboratorios = new ArrayList<>();

	public InfoLabs() {

	}

	public InfoLabs(List<Laboratorio> laboratorios) {
		this.laboratorios = laboratorios;
	}

	private List<Laboratorio> obterListaDeLaboratorios() throws FileNotFoundException, IOException {
		String path = "C:\\Users\\jhona\\Desktop\\Projetos\\Ambiente Curso\\SistemaAgendamentoLAB\\ARQUIVOINFOLABS\\infoLabs.txt";
		File file = new File(path);
		Scanner sc = null;
		sc = new Scanner(file);
		List<Laboratorio> laboratorios = new ArrayList<>();
		while (sc.hasNextLine()) {
			Laboratorio lab = new Laboratorio();
			String line = sc.nextLine();
			if (line != null) {
				String vetor[] = line.split(",");
				lab.setNome(vetor[0]);
				lab.setAndar(Integer.parseInt(vetor[1]));
				lab.setComputadores(Integer.parseInt(vetor[2]));
				laboratorios.add(lab);
			}
		}
		sc.close();
		return laboratorios;
	}

	public void mostraLabs(InfoLabs il) throws FileNotFoundException, IOException {
		int qtd = il.obterListaDeLaboratorios().size();
		for (int i = 0; i < qtd; i++) {
			Laboratorio lab = il.obterListaDeLaboratorios().get(i);
			System.out.println(lab);
		}

	}

	
}
