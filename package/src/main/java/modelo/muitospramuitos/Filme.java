package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;
	
	private Double nota;
	
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "atores_filmes",
	joinColumns = @JoinColumn(name="filme_id" ,referencedColumnName = "id"),
	inverseJoinColumns =  @JoinColumn(name="ator_id" ,referencedColumnName = "id"))
	private List<Ator> atores = new ArrayList<>();
	
	
			
			
	
	
	public Filme () {
		
	}


	public Filme(String nome, Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}


	public List<Ator> getAtores() {
		
		return atores;
	}


	public void setAtor(List<Ator> atores) {
		this.atores = atores;
	}
	
	public void adcionarAtor(Ator ator) {
		getAtores().add(ator);
		ator.getFilmes().add(this);
	}
		
		
	
	
}
