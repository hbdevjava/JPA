package teste.umpraum;

import infra.DAO;
import modelo.umPraum.Assento;
import modelo.umPraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("18c");
		Cliente cliente = new Cliente("Dora", assento);
		
		DAO<Object> dao = new DAO<>();
		 dao.AbrirT()
		 .Incluir(assento)
		 .Incluir(cliente)
		 .FecharT()
		 .fechar();
		
		
		
	}

}