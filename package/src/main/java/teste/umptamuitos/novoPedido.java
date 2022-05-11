package teste.umptamuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class novoPedido {

	public static void main(String[] args) {

		DAO<Object> dao = new DAO<>();

		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira", 2789.99);
		ItemPedido item = new ItemPedido(pedido, produto, 10);

		dao.AbrirT().Incluir(produto).Incluir(pedido).Incluir(item).FecharT().fechar();

	}

}
