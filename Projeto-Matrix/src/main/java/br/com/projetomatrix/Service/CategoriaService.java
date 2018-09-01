package br.com.projetomatrix.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import br.com.projetomatrix.Model.Categoria;
import br.com.projetomatrix.Repository.CategoriaRepository;

@Service

public class CategoriaService {
@Autowired

private CategoriaRepository categoriaRepository;

	public Categoria cadastrar (Categoria categoria) {
	  return categoriaRepository.save(categoria);
	}
	
	public Categoria atualizar (Categoria categoria) {
      return categoriaRepository.save(categoria);
	
	}
    public List<Categoria> listar() {
      return categoriaRepository.findAll();
    }
    
    public Categoria buscar (Long Id) {
		return categoriaRepository.findById(Id).get();
	}
	public void delete (Long Id) {
	   categoriaRepository.deleteById(Id);
	}
	
}
