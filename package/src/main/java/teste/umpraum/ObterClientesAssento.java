package teste.umpraum;

import infra.DAO;
import modelo.umPraum.Assento;
import modelo.umPraum.Cliente;

public class ObterClientesAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		Cliente cliente = dao.obterPorId(1L);
		System.out.println(cliente.getAssento().getNome());
		dao.fechar();
		
		
		
		DAO<Assento> dao2 = new DAO<>(Assento.class);
		Assento assento = dao2.obterPorId(2L);
		System.out.println(assento.getCliente().getNome());
		dao2.fechar();
		
		
		
		
		

		

	}

}
