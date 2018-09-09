package br.com.projetomatrix.academico.Sistema;

import java.util.List;

public class Aluno extends Pessoa {

	private Curso curso;
	List<Avaliação> avaliações;

	public List<Avaliação> getAvaliações() {
		return avaliações;
	}

	public void setAvaliações(List<Avaliação> avaliações) {
		this.avaliações = avaliações;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}