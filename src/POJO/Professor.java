package POJO;

import java.util.ArrayList;

public class Professor extends Pessoa {
	private String departamento;
	private ArrayList<Disciplinas> displinasApto;
	
	public Professor(String nome, String cpf, String departamento,
			ArrayList<Disciplinas> displinasApto) {
		super(nome, cpf);
		this.departamento = departamento;
		this.displinasApto = displinasApto;
	}
	
	
}
