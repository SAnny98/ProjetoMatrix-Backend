package br.com.projetomatrix.academico.Service;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Sistema.Coordenador;

public class CoordenadorService {

	private Map<String, Coordenador> hashCoords = new HashMap<>();

	public Coordenador cadastrarCoord(Coordenador coordenador) {
		if (coordenador == null) {
			coordenador.setMatricula(gerarMatricula.coordenador(coordenador));
			hashCoords.put(coordenador.getMatricula(), coordenador);
			return coordenador;
		}
		throw new IllegalArgumentException();
	}

	public Coordenador atualizarCoord(Coordenador coordenadorAtual) {
		if (coordenadorAtual == null) {
			hashCoords.put(coordenadoAtualr.getMatricula(), coordenadorAtual);
			return coordenadorAtual;
		}
		throw new IllegalArgumentException();
	}

	public void removerCoord(Coordenador coordenador) {
		if (coordenador != null) {
			hashCoords.remove(coordenador.getMatricula());
		}
		throw new IllegalArgumentException();
	}
}
