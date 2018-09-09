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

import br.com.projetomatrix.Model.Empresa;
import br.com.projetomatrix.Service.EmpresaService;

@RestController
public class EmpresaResource {

	public class Resource {
		private EmpresaService empresaService;

		@PostMapping("/empresa")
		public ResponseEntity<Empresa> cadastrar(@RequestBody Empresa empresa) {
			return new ResponseEntity<>(empresaService.cadastrar(empresa), HttpStatus.OK);
		}

		@PutMapping("/empresa")
		public ResponseEntity<Empresa> atualizar(@RequestBody Empresa empresa) {
			return new ResponseEntity<>(empresaService.atualizar(empresa), HttpStatus.OK);
		}

		@GetMapping("/empresa/{Id}")
		public ResponseEntity<List<Empresa>> listar(@PathVariable ("Id") Long Id) {
			return new ResponseEntity<>(empresaService.listar(Id), HttpStatus.OK);
		}

		@DeleteMapping("/empresa/delete")
		public ResponseEntity<Empresa> delete(@PathVariable("Id") Long Id) {
			 empresaService.delete(Id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}
}
