package br.com.projetomatrix.academico.Sistema;

import java.util.List;

public class Curso {

	private Coordenador coordenador;
	private String descrição;
	private String código;
	private Integer caraga_horaria;
	private String ementa;
	private String bibliografia;
	List<Disciplina> disciplinas;

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getCódigo() {
		return código;
	}

	public void setCódigo(String código) {
		this.código = código;
	}

	public Integer getCaraga_horaria() {
		return caraga_horaria;
	}

	public void setCaraga_horaria(Integer caraga_horaria) {
		this.caraga_horaria = caraga_horaria;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
