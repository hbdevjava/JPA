package teste.muitospramuitos;

import modelo.muitospramuitos.Filme;
import infra.DAO;
import modelo.muitospramuitos.Ator;

public class NovoFilmeAtor {

	public static void main(String[] args) {

		Filme filmeA = new Filme("Inter Estelar Ep 1", 10.0);
		Filme filmeB = new Filme("Shurek Ep 2", 8.0);
		
		
		Ator AtorA = new Ator("Hb");
		Ator AtorB = new Ator("Son");

		filmeA.adcionarAtor(AtorA);
		filmeA.adcionarAtor(AtorB);
		
		filmeB.adcionarAtor(AtorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.IncluirAtomico(filmeA);
		dao.IncluirAtomico(filmeB);
	}

}
