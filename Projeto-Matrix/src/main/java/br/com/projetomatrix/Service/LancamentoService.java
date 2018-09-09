package br.com.projetomatrix.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.projetomatrix.Model.Lançamento;
import br.com.projetomatrix.Repository.LancamentoRepository;

@Service

public class LancamentoService {
	@Autowired

	private LancamentoRepository lancamentoRepository;

	public Lançamento cadastrar(Lançamento lancamento) {
		return lancamentoRepository.save(lancamento);
	}

	public Lançamento atualizar(Lançamento lancamento) {
		return lancamentoRepository.save(lancamento);

	}

	public List<Lançamento> listar(Long id) {
		return lancamentoRepository.findAll();
	}

	public void delete(Long Id) {
		lancamentoRepository.deleteById(Id);
	}

}
