package br.com.projetomatrix.academico.Service;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Sistema.Curso;

public class CursoService {

	private Map<String, Curso> hashCursos = new HashMap<>();

	public Curso cadatrarCurso(Curso curso) {

		if (curso == null) {
			curso.setCodigo(gerarCodigo(curso));
			hashCursos.put(curso.getCodigo(), curso);
			return curso;
		}
		throw new IllegalArgumentException();
	}

	public Curso atualizarCurso(Curso cursoAtual) {
		if (cursoAtual == null) {
			hashCursos.put(cursoAtual.getCodigo(), cursoAtual);
			return cursoAtual;
		}
		throw new IllegalArgumentException();
	}

	public void removerCurso(Curso curso) {
		if (curso != null) {
			hashCursos.remove(curso.getCodigo());
		}
		throw new IllegalArgumentException();
	}
}
