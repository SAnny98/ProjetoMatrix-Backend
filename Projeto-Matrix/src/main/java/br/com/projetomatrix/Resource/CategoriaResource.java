package br.com.projetomatrix.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		
		@PutMapping("/categoria")
		public ResponseEntity<Categoria> atualizar(@RequestBody Categoria categoria){
			return new ResponseEntity<>(categoriaService.atualizar(categoria),HttpStatus.OK);
		}
		
		@GetMapping("/categoria/{id}")
    	public ResponseEntity<List<Categoria>> listar(@PathVariable("Id") Long Id) {
			categoriaService.delete(Id);
			return new ResponseEntity<>(categoriaService.listar(Id),HttpStatus.OK);
		}
		
		@DeleteMapping("/categoria")
		public ResponseEntity<Categoria> delete(@PathVariable("Id") Long Id){
			categoriaService.delete(Id);
			return new ResponseEntity<>(HttpStatus.OK);			
			}		
		}
	}

 
