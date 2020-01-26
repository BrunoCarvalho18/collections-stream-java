package b.com.comprators;

import java.util.Comparator;

//Ordem reversa dos comparators
public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {

	@Override
	public int compare(Estudante o1, Estudante o2) {
		return o2.getIdade() - o1.getIdade();
	}

}
