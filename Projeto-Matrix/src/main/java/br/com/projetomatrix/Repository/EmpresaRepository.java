package br.com.projetomatrix.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetomatrix.Model.Categoria;
import br.com.projetomatrix.Model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository <Empresa,Long> {

	Optional <Categoria> finById (Long Id);
	Optional <Categoria> finByNomeCnpj (String nome, String cnpj);
}
