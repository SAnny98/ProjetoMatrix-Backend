package br.com.projetomatrix.academico.Sistema;

import java.util.List;

public class Boletim {
	private Aluno aluno;
	private Turma turma;
	private List<Avaliação> avaliações;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public List<Avaliação> getAvaliações() {
		return avaliações;
	}

	public void setAvaliações(List<Avaliação> avaliações) {
		this.avaliações = avaliações;
	}

}
