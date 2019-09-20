package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import entities.Aluno;
import entities.Professor;
import entities.Usuario;

public class CadastroUsuario {
	private List<Usuario> usuariosCadastrados = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);

	public CadastroUsuario() {

	}

	public CadastroUsuario(List<Usuario> usuariosCadastrados) {
		super();
		this.usuariosCadastrados = usuariosCadastrados;
	}

	public List<Usuario> getUsuariosCadastrados() {
		return usuariosCadastrados;
	}

	public void setUsuariosCadastrados(List<Usuario> usuariosCadastrados) {
		this.usuariosCadastrados = usuariosCadastrados;
	}

	public void cadastrarUsuario(CadastroUsuario cadastroUsuario) {
		System.out.print("Já tem cadastro: S/N");
		char cadastro = sc.nextLine().toUpperCase().charAt(0);
		if (cadastro == 'N' ) {
			System.out.print("Digite o seu nome: ");
			String nome = sc.nextLine().toUpperCase();
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Qual o seu CPF: ");
			String cpf = sc.nextLine();
			System.out.print("Você é aluno ou Professor: 1/2");
			int opcao = sc.nextInt();
			sc.nextLine();
			if (opcao == 1) {
				System.out.println("Qual o seu curso:");
				String curso = sc.nextLine();
				System.out.println("Qual o periodo: ");
				int periodo = sc.nextInt();
				int id = gerarIdUsuario();
				Usuario usuario = new Aluno(nome, idade, cpf, id, curso, periodo);
				mensagemSucessoCadastro(usuario);
			} else {
				System.out.print("Qual a sua Materia:");
				String materia = sc.nextLine();
				System.out.print("Qual a sua Matricula: ");
				int matricula = sc.nextInt();
				sc.nextLine();
				int id = gerarIdUsuario();
				Usuario usuario = new Professor(nome, idade, cpf, id, materia, matricula);
				cadastroUsuario.getUsuariosCadastrados().add(usuario);
				mensagemSucessoCadastro(usuario);
			}

		}
	}

	private static int gerarIdUsuario() {
		Random random = new Random();
		int x = random.nextInt(101);
		return x;
	}

	private void mensagemSucessoCadastro(Usuario usuario) {
		System.out.println(usuario.getNome() + " você foi cadastrado com sucesso!\nAnote o seu ID: " + usuario.getId());
	}
}
