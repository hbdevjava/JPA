package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable // Faz com que esse entidade esteja inserida numa outro "tipo herança"
public class Endereco {
		
		private String Logradouro;
		private  String complemento;
		
		
		
		public String getLogradouro() {
			return Logradouro;
		}
		public void setLogradouro(String logradouro) {
			Logradouro = logradouro;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		
		
		
}
