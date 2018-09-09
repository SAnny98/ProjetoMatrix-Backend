package br.com.projetomatrix.academico.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import br.com.projetomatrix.academico.Sistema.Avaliação;

public class AvaliacaoService {

	Map<String, Avaliação> hashAvaliacoes = new HashMap<>();

	public Avaliação cadastrarAva(Avaliação avaliacao) {
		if (avaliacao == null || hashAvaliacoes.containsKey(avaliacao.getCodigo()))
			throw new IllegalArgumentException("Avaliacao invalida");

		avaliacao.setCodigo(gerarCodigo(avaliacao));

		hashAvaliacoes.put(avaliacao.getCodigo(), avaliacao);

		return avaliacao;
	}

	public Avaliação atualizarAva(Avaliação avaliacaoAtualizada) {
		if (avaliacaoAtualizada == null)
			throw new IllegalArgumentException("Dado invalido.");

		hashAvaliacoes.put(avaliacaoAtualizada.getCodigo(), avaliacaoAtualizada);

		return avaliacaoAtualizada;

	}

	public void removerAva(Avaliação avaliacao) {
		if (avaliacao == null )
			throw new IllegalArgumentException("Avaliacao não encontrada");

		hashAvaliacoes.remove(avaliacao.getCodigo());
	}

}
