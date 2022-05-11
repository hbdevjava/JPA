package teste.umptamuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {

		DAO<Pedido> dao = new DAO<>(Pedido.class);

		Pedido pedido = dao.obterPorId(4L);

		for (ItemPedido item : pedido.getItens()) {
			System.out.println(item.getQuantidade());
		}
		dao.FecharT();
	}

}
