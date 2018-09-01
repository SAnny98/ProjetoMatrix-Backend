package br.com.projetomatrix.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetomatrix.Model.Categoria;
import br.com.projetomatrix.Service.CategoriaService;

@RestController
public class CategoriaResource {
	
	public class Reource{
	@Autowired
		
 private CategoriaService categoriaService;
		
		@PostMapping("/categoria")
		public ResponseEntity<Categoria> cadastrar(@RequestBody Categoria categoria){
			return new ResponseEntity<>(categoriaService.cadastrar(categoria), HttpStatus.OK); 
		}
		
		@PostMapping("/categoria/atualizar")
		public ResponseEntity<Categoria> atualizar(@RequestBody Categoria categoria){
			return new ResponseEntity<>(categoriaService.atualizar(categoria),HttpStatus.OK);
		}
		
		@PostMapping("/categoria/listar")
    	public ResponseEntity<List<Categoria>> listar(Categoria categoria ) {
		     return new ResponseEntity<>(categoriaService.listar(categoria),HttpStatus.OK);
		}
		
		@PostMapping("/categoria/buscar")
	    public ResponseEntity<Categoria> buscar (@RequestBody Long Id) {
			return new ResponseEntity<>(categoriaService.buscar(Id),HttpStatus.OK);
		}

		@PostMapping("/categoria/delete")
		public ResponseEntity<Categoria> delete(@RequestBody Categoria categoria){
			return new ResponseEntity<>(categoriaService.delete(categoria),HttpStatus.OK);
		}
	}

}
