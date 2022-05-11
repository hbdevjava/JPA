package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class AlunoBolsa extends Aluno {

	
	private Double ValorBolsa;
	
	public AlunoBolsa() {
		
	}

	public AlunoBolsa(Long matricula, String nome, Double valorBolsa) {
		super(matricula, nome);
		ValorBolsa = valorBolsa;
	}

	public Double getValorBolsa() {
		return ValorBolsa;
	}

	public void setValorBolsa(Double valorBolsa) {
		ValorBolsa = valorBolsa;
	} 
	
}
