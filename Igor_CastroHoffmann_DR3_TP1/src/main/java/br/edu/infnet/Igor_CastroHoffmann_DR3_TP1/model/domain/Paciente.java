package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paciente extends Pessoa {
	
	Scanner in = new Scanner(System.in);
	
	String cpf;
	
	public List<Paciente> listaPaciente = new ArrayList<Paciente>();

	private String planoSaude;
	
	public String getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	public boolean consultarCpf() {
		
		System.out.println("Digite o CPF do paciente: ");
		cpf = in.nextLine();
		
		for(Paciente p : listaPaciente) {
			if(p.getCpf().equals(cpf)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean consultarCpf(String cpfPaciente) {
		
		for(Paciente p : listaPaciente) {
			if(p.getCpf().equals(cpfPaciente)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void cadastrarPaciente() {
		
		boolean pessoaCadastrada = consultarCpf();
		
		if(pessoaCadastrada) {
			System.out.println("Paciente já cadastrado! Informe a especialidade? ");
		} else {
			System.out.println("O paciente não possui cadastro. Cadastre-o para prosseguir o agendamento!");
			System.out.println("Qual o nome do paciente? ");
			setNome(in.next());
			
			System.out.println("Qual o CPF do paciente? ");
			setCpf(in.next());
			
			System.out.println("Qual a data de nascimento?");
			setDataNascimento(in.next());
			
			System.out.println("Qual o CEP? ");
			setCep(in.nextInt());
			
			System.out.println("Qual o número da casa? ");
			setNumeroCasa(in.nextInt());
			
			listaPaciente.add(this);
		}

	}
	
}