package br.com.projetomatrix.academico.Service;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Sistema.Turma;

public class TurmaService {

	private Map<String, Turma> hashTurma = new HashMap<>();

	public Turma cadastrarTurma(Turma turma) {
		if (turma == null) {
			turma.setCodigo(gerarCodigo(turma));
			hashTurma.put(turma.getCodigo(), turma);
			return turma;
		}
		throw new IllegalArgumentException();
	}

	public Turma atualizarTurma(Turma turmaAtual) {
		if (turmaAtual == null) {
			hashTurma.put(turmaAtual.getCodigo(), turmaAtual);
			return turmaAtual;
		}
		throw new IllegalArgumentException();
	}

	public void removerTurma(Turma turma) {
		if (turma != null) {
			hashTurma.remove(turma.getCodigo());
		}
		throw new IllegalArgumentException();
	}

}
