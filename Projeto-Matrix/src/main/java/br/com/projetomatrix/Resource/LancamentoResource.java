package br.com.projetomatrix.Resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.projetomatrix.Model.Lançamento;
import br.com.projetomatrix.Service.LancamentoService;

@RestController

public class LancamentoResource {

	public class Resource {
		private LancamentoService lancamentoService;

		@PostMapping("/lancamento")
		public ResponseEntity<Lançamento> cadastrar(@RequestBody Lançamento lancamento) {
			return new ResponseEntity<>(lancamentoService.cadastrar(lancamento), HttpStatus.OK);
		}

		@PutMapping("/lancamento")
		public ResponseEntity<Lançamento> atualizar(@RequestBody Lançamento lancamento) {
			return new ResponseEntity<>(lancamentoService.atualizar(lancamento), HttpStatus.OK);
		}

		@GetMapping("/lancamento/{Id}")
		public ResponseEntity<List<Lançamento>> listar(@PathVariable("Id") Long Id) {
			return new ResponseEntity<>(lancamentoService.listar(Id), HttpStatus.OK);
		}

		@DeleteMapping("/lancamento/delete")
		public ResponseEntity<Lançamento> delete(@PathVariable("Id") Long Id) {
			lancamentoService.delete(Id);
			return new ResponseEntity<>(HttpStatus.OK);
		}

	}
}
