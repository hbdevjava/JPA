package modelo.heranca;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	private Long matricula;
	
	private String nome;
	
	public Aluno() {
		
	}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
