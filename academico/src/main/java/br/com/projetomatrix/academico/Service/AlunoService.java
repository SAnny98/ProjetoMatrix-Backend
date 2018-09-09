package br.com.projetomatrix.academico.Service;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Sistema.Aluno;

public class AlunoService {

	private Map<String, Aluno> hashAlunos = new HashMap<>();

	public Aluno cadastrarAluno(Aluno aluno) {

		if (aluno == null) {

			aluno.setMatricula(gerarMatricula(aluno));
			hashAlunos.put(aluno.getMatricula(), aluno);
			return aluno;
		}
		throw new IllegalArgumentException();
	}

	public Aluno atualizarAluno(Aluno alunoAtual) {
		if (alunoAtual != null) {
			hashAlunos.put(alunoAtual.getMatricula, alunoAtual);
			return alunoAtual;
		}
		throw new IllegalArgumentException();
	}

	public void removerAluno(Aluno aluno) {
	
		if (aluno != null) {
			hashAlunos.remove(aluno.getMatricula());
		}
		throw new IllegalArgumentException();
	}

}
