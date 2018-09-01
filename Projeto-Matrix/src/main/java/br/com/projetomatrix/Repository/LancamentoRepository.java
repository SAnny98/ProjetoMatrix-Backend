package br.com.projetomatrix.Repository;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.projetomatrix.Model.Categoria;
import br.com.projetomatrix.Model.Lançamento;

@Repository
public interface LancamentoRepository extends JpaRepository <Lançamento,Long>{
	Optional <Categoria> finById (Long Id);
	Optional <Categoria> finByIniFin (LocalDate inicial, LocalDate vencimento);

}
