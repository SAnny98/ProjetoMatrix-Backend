package br.com.projetomatrix.Resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.projetomatrix.Model.Lançamento;
import br.com.projetomatrix.Repository.LancamentoRepository;
import br.com.projetomatrix.Service.LancamentoService;

@RestController

public class LancamentoResource {
		
	public class Resource{
		private LancamentoService lancamentoService;
		
		@PostMapping("/lancamento")
		public ResponseEntity<Lançamento> cadastrar(@RequestBody Lançamento lancamento){
			return new ResponseEntity<>(lancamentoService.cadastrar(lancamento), HttpStatus.OK); 
		}
		
		@PostMapping("/lancamento/atualizar")
		public ResponseEntity<Lançamento> atualizar(@RequestBody Lancamneto lancamento){
			return new ResponseEntity<>(empresaService.atualizar(lancamento),HttpStatus.OK);
		}
		
		@PostMapping("/lancamento/listar")
    	public ResponseEntity<List<Lançamento>> listar(Lancamento lancamento ) {
		     return new ResponseEntity<>(lancamentoService.listar(lancamento),HttpStatus.OK);
		}
		
		@PostMapping("/lancamento/buscar")
	    public ResponseEntity<Lançamento> buscar (@RequestBody Long Id) {
			return new ResponseEntity<>(lancamentoService.buscar(Id),HttpStatus.OK);
		}

		@PostMapping("/lancamento/delete")
		public ResponseEntity<Lancamento> delete(@RequestBody Lancamento){
			return new ResponseEntity<>(lancamentoService.delete(lancamento),HttpStatus.OK);
		}

	}
}
