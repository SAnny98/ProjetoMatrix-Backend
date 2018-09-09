package br.com.projetomatrix.academico.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import br.com.projetomatrix.academico.Sistema.Avaliação;

public class AvaliacaoService {

	private Map<String, Avaliação> hashAvaliacoes = new HashMap<>();

	public Avaliação cadastrarAva(Avaliação avaliacao) {

		if (avaliacao == null) {
			avaliacao.setCodigo(gerarCodigo(avaliacao));
			hashAvaliacoes.put(avaliacao.getCodigo(), avaliacao);
			return avaliacao;
		}
		throw new IllegalArgumentException();
	}

	public Avaliação atualizarAva(Avaliação avaliacaoAtual) {
		if (avaliacaoAtual == null) {
			hashAvaliacoes.put(avaliacaoAtual.getCodigo(), avaliacaoAtual);
			return avaliacaoAtual;
		}
		throw new IllegalArgumentException();

	}

	public void removerAva(Avaliação avaliacao) {
		if (avaliacao != null){
		hashAvaliacoes.remove(avaliacao.getCodigo());
	}throw new IllegalArgumentException();

}
