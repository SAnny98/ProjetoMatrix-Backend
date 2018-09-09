package br.com.projetomatrix.academico.Sistema;

public class SistemaAcademico {
	private Aluno aluno;
	private Disciplina disciplina;
	private Turma turma;
	private Professor professor;
	private Coordenador coordenador;
	private Curso curso;
	private Horário horário;
	private Avaliação avaliação;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Horário getHorário() {
		return horário;
	}

	public void setHorário(Horário horário) {
		this.horário = horário;
	}

	public Avaliação getAvaliação() {
		return avaliação;
	}

	public void setAvaliação(Avaliação avaliação) {
		this.avaliação = avaliação;
	}

}
