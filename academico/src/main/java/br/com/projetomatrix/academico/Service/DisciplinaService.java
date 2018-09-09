package br.com.projetomatrix.academico.Service;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Sistema.Disciplina;

public class DisciplinaService {

	private Map<String, Disciplina> hashDisci = new HashMap<>();

	public Disciplina cadastrarDisciplina(Disciplina disciplina) {
		if (disciplina == null) {
			disciplina.setCodigo(gerarCodigo(disciplina));
			hashDisci.put(disciplina.getCodigo(), disciplina);
			return disciplina;
		}
		throw new IllegalArgumentException();
	}

	public Disciplina atualizarDisciplina(Disciplina disciplinaAtual) {
		if (disciplinaAtual == null) {
			hashDisci.put(disciplinaAtual.getCodigo(), disciplinaAtual);
			return disciplinaAtual;
		}
		throw new IllegalArgumentException();
	}

	public void removerDsicplina(Disciplina disciplina) {
		if (disciplina != null) {
			hashDisci.remove(disciplina.getCodigo());
		}
		throw new IllegalArgumentException();
	}

}
