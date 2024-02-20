package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain;

import java.util.Scanner;

public class Consulta {
	
	Paciente p = new Paciente();
	Medico m = new Medico();
	
	Scanner in = new Scanner (System.in);
 	
	public void agendarConsulta() {
	    int tagEspecialista = 0;

	    String cpfPaciente;

	    System.out.println("Qual o CPF do paciente? ");
	    cpfPaciente = in.nextLine();

	    if (!p.consultarCpf(cpfPaciente)) {
	        System.out.println("Paciente não cadastrado. Cadastre o paciente antes de agendar a consulta.");
	        return;
	    }

	    System.out.println("Qual a especialidade do médico? ");
	    System.out.println("1 - Neurologista\n 2 - Psiquiatra\n 3 - Pediatra");
	    tagEspecialista = in.nextInt();

	    in.nextLine();

	    switch (tagEspecialista) {
	        case 1:
	            String nome;
	            System.out.println("Digite o nome do médico: ");
	            nome = in.nextLine();
	            System.out.println("Consulta marcada com o Neurologista Dr. " + nome + ".");
	            break;

	        default:
	            break;
	    }
	}
}
