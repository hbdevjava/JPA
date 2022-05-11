package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("monitor", 789.45);
	
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.IncluirAtomico(produto).fechar();
		System.err.println("ID do produto: " + produto.getId());
	}
}
