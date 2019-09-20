package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Laboratorio;

public class InfoLabs {
	private List<Laboratorio> laboratorios = new ArrayList<>();

	public InfoLabs() {

	}

	public InfoLabs(List<Laboratorio> laboratorios) {
		this.laboratorios = laboratorios;
	}

	public List<Laboratorio> getLaboratorios() {
		return laboratorios;
	}

	public void setLaboratorios(List<Laboratorio> laboratorios) {
		this.laboratorios = laboratorios;
	}

	public List<Laboratorio> obterListaDeLaboratorios() throws FileNotFoundException, IOException {
		String path = "C:\\Users\\jhona\\OneDrive\\Curso Java\\WS-Eclipse\\SistemaAgendamentoLAB\\ARQUIVOINFOLABS\\infoLabs.txt";
		Scanner sc = new Scanner(path);
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Laboratorio> laboratorios = new ArrayList<>();
			while (!(br.readLine() == null)) {
				Laboratorio lab = new Laboratorio();
				String line = br.readLine();
				if (line != null) {
					String vetor[] = line.split(",");
					lab.setNome(vetor[0]);
					lab.setAndar(Integer.parseInt(vetor[1]));
					lab.setComputadores(Integer.parseInt(vetor[2]));
					laboratorios.add(lab);
				}
			}
			return laboratorios;
		} catch (IOException e) {
			e.getMessage();
		}
		return null;
	}
	
}
