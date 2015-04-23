package POJO;

public class Aluno extends Pessoa {
	private long matricula;

	public Aluno(String nome, String cpf, long matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}
}
