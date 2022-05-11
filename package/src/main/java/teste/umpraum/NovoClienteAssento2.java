package teste.umpraum;

import infra.DAO;
import modelo.umPraum.Assento;
import modelo.umPraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Rodrigo", assento);
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.IncluirAtomico(cliente);
		 
		
	}

}
