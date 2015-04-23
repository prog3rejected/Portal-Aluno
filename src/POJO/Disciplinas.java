package POJO;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private String ementa;
	private int cargaHoraria;
	private ArrayList<Turma> turmas;
	
	public Disciplinas(String nome, String ementa, int cargaHoraria,
			ArrayList<Turma> turmas) {
		super();
		this.nome = nome;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
		this.turmas = turmas;
	}	
}
