package br.com.projetomatrix.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetomatrix.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria,Long> {

	Optional <Categoria> finById (Long Id);
}  
