package br.com.projetomatrix.academico.Sistema;

import java.time.LocalTime;

public class Horário {

	private String código;
	private Integer dia_da_semana;
	private LocalTime hora_ini;
	private LocalTime hora_fim;

	public String getCódigo() {
		return código;
	}

	public void setCódigo(String código) {
		this.código = código;
	}

	public Integer getDia_da_semana() {
		return dia_da_semana;
	}

	public void setDia_da_semana(Integer dia_da_semana) {
		this.dia_da_semana = dia_da_semana;
	}

	public LocalTime getHora_ini() {
		return hora_ini;
	}

	public void setHora_ini(LocalTime hora_ini) {
		this.hora_ini = hora_ini;
	}

	public LocalTime getHora_fim() {
		return hora_fim;
	}

	public void setHora_fim(LocalTime hora_fim) {
		this.hora_fim = hora_fim;
	}
}
