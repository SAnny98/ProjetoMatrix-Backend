package br.com.projetomatrix.Resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetomatrix.Model.Categoria;
import br.com.projetomatrix.Model.Empresa;
import br.com.projetomatrix.Service.EmpresaService;

@RestController
public class EmpresaResource {
	

	public class Resource {
		private EmpresaService empresaService;
		
		@PostMapping("/empresa")
		public ResponseEntity<Empresa> cadastrar(@RequestBody Empresa empresa){
			return new ResponseEntity<>(empresaService.cadastrar(empresa), HttpStatus.OK); 
		}
		
		@PostMapping("/empresa/atualizar")
		public ResponseEntity<Empresa> atualizar(@RequestBody Empresa empresa){
			return new ResponseEntity<>(empresaService.atualizar(empresa),HttpStatus.OK);
		}
		
		@PostMapping("/empresa/listar")
    	public ResponseEntity<List<Empresa>> listar(Empresa empresa ) {
		     return new ResponseEntity<>(empresaService.listar(empresa),HttpStatus.OK);
		}}
		
		@PostMapping("/empresa/buscar")
	    public ResponseEntity<Empresa> buscar (@RequestBody Long Id) {
			return new ResponseEntity<>(empresaService.buscar(Id),HttpStatus.OK);
		}

		@PostMapping("/empresa/delete")
		public ResponseEntity<Empresa> delete(@RequestBody Empresa empresa){
			return new ResponseEntity<>(empresaService.delete(empresa),HttpStatus.OK);
		}
	}
	}

}
