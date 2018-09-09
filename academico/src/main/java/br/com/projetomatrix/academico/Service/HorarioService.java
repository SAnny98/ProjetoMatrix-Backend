package br.com.projetomatrix.academico.Service;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Sistema.Horário;

public class HorarioService {

	private Map<LocalTime, Horário> hashHora = new HashMap<>();

	public Horário cadastrarHora(Horário hora) {
		if (hora == null) {
			hora.setCodigo(gerarCodigo(hora));
			hashHora.put(hora.getCodigo(), hora);
			return hora;
		}
		throw new IllegalArgumentException();
	}

	public Horário atualizarHora(Horário horaAtual) {
		if (horaAtual == null) {
			hashHora.put(horaAtual.getCodigo(), horaAtual);
			return horaAtual;
		}
		throw new IllegalArgumentException();
	}

	public void removerHora(Horário hora) {
		if (hora != null) {
			hashHora.remove(hora.getCodigo());
		}
		throw new IllegalArgumentException();
	}
}
