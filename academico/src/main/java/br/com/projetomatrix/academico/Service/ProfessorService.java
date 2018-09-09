package br.com.projetomatrix.academico.Service;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Sistema.Professor;

public class ProfessorService {

	private Map<String, Professor> hashProf = new HashMap<>();

	public Professor cadastrarProf(Professor prof) {
		if (prof == null) {
			prof.setMatricula(gerarMatricula.coordenador(prof));
			hashProf.put(prof.getMatricula(), prof);
			return prof;
		}
		throw new IllegalArgumentException();
	}

	public Professor atualizarProf(Professor profAtual) {
		if (profAtual == null) {
			hashProf.put(profAtual.getMatricula(), profAtual);
			return profAtual;
		}
		throw new IllegalArgumentException();

	}

	public void removerProf(Professor prof) {
		if (prof != null) {
			hashProf.remove(prof.getMatricula());
		}
		throw new IllegalArgumentException();
	}

}
