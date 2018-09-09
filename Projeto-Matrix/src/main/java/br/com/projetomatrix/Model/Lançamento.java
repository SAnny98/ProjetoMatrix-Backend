package br.com.projetomatrix.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Lançamento")
public class Lançamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	private Long Id;
	@NotEmpty
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	@NotEmpty
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	@NotEmpty
	private String tipo;
	@NotEmpty
	private LocalDate vencimento;
	@NotEmpty
	private BigDecimal valor;


}
