package br.com.projetomatrix.academico.Service;

import br.com.projetomatrix.academico.Sistema.Aluno;
import br.com.projetomatrix.academico.Sistema.Avaliação;
import br.com.projetomatrix.academico.Sistema.Coordenador;
import br.com.projetomatrix.academico.Sistema.Curso;
import br.com.projetomatrix.academico.Sistema.Disciplina;
import br.com.projetomatrix.academico.Sistema.Horário;
import br.com.projetomatrix.academico.Sistema.Professor;
import br.com.projetomatrix.academico.Sistema.Turma;

public class SistemaAcademicoService {

	private AlunoService alunoService = new AlunoService();
	private TurmaService turmaService = new TurmaService();
	private DisciplinaService disciplinaService = new DisciplinaService();
	private ProfessorService professorService = new ProfessorService();
	private CoordenadorService coordenadorService = new CoordenadorService();
	private CursoService cursoService = new CursoService();
	private HorarioService horarioService = new HorarioService();
	private AvaliacaoService avaliaçãoService = new AvaliacaoService();

	public Aluno cadastrarAluno(Aluno aluno) {
		return alunoService.cadastrarAluno(aluno);
	}

	public Aluno atualizarAluno(Aluno alunoAtual) {
		return alunoService.atualizarAluno(alunoAtual);
	}

	public void removerAluno(Aluno aluno) {
		alunoService.removerAluno(aluno);
	}

	// -------------------------------------------------------
	public Turma cadastrarTurma(Turma turma) {
		return turmaService.cadastrarTurma(turma);
	}

	public Turma atualizarTurma(Turma turmaAtual) {
		return turmaService.atualizarTurma(turmaAtual);
	}

	public void removerTurma(Turma turma) {
		turmaService.removerTurma(turma);
	}

	// ------------------------------------------------------------
	public Disciplina cadastrarDisci(Disciplina disciplina) {
		return disciplinaService.cadastrarDisciplina(disciplina);
	}

	public Disciplina atualizarDisci(Disciplina disciplinaAtual) {
		return disciplinaService.atualizarDisciplina(disciplinaAtual);
	}

	public void removerDisci(Disciplina disciplina) {
		disciplinaService.removerDsicplina(disciplina);
	}

	// --------------------------------------------------------
	public Professor cadastrarProf(Professor prof) {
		return professorService.cadastrarProf(prof);
	}

	public Professor atualizarProf(Professor profAtual) {
		return professorService.atualizarProf(profAtual);
	}

	public void removerProf(Professor prof) {
		professorService.removerProf(prof);
	}

	// ------------------------------------------------------------------
	public Coordenador cadastrarCoord(Coordenador coordenador) {
		return coordenadorService.cadastrarCoord(coordenador);
	}

	public Coordenador atualizarCoord(Coordenador coordenadorAual) {
		return coordenadorService.atualizarCoord(coordenadorAual);
	}

	public void removerCoord(Coordenador coordenador) {
		coordenadorService.removerCoord(coordenador);
	}

	// -----------------------------------------------------------------

	public Curso cadastrarCurso(Curso curso) {
		return cursoService.cadatrarCurso(curso);
	}

	public Curso atualizarCurso(Curso cursoAtual) {
		return cursoService.atualizarCurso(cursoAtual);
	}

	public void removerCurso(Curso curso) {
		cursoService.removerCurso(curso);
	}

	// ----------------------------------------------

	public Horário cadastrarHora(Horário hora) {
		return horarioService.cadastrarHora(hora);
	}

	public Horário atualizarHora(Horário horaAtual) {
		return horarioService.atualizarHora(horaAtual);
	}

	public void removerHora(Horário hora) {
		horarioService.removerHora(hora);
	}

	// -------------------------------------------------

	public Avaliação cadastrarAva(Avaliação avaliação) {
		return avaliaçãoService.cadastrarAva(avaliação);
	}

	public Avaliação atualizarAva(Avaliação avaliaçãoAtual) {
		return avaliaçãoService.atualizarAva(avaliaçãoAtual);
	}

	public void removerAva(Avaliação avaliação) {
		avaliaçãoService.removerAva(avaliação);
	}

}
