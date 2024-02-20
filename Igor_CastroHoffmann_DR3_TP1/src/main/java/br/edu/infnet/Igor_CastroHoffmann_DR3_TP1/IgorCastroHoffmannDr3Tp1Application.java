package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Consulta;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Paciente;

@SpringBootApplication
public class IgorCastroHoffmannDr3Tp1Application {

	public static void main(String[] args) {
		SpringApplication.run(IgorCastroHoffmannDr3Tp1Application.class, args);
		
		Consulta c = new Consulta();
		Paciente p = new Paciente();
		p.cadastrarPaciente();
		c.agendarConsulta();
		p.cadastrarPaciente();
	}
}
