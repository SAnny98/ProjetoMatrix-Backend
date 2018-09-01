package br.com.projetomatrix.Model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Id;
	@NotNull
	@NotBlank
	private Empresa empresa;
	@NotNull
	@NotBlank
	private Categoria categoria;
	@NotNull
	@NotBlank
	private String tipo;
	@NotNull
	@NotBlank
	private LocalDate vencimento;
	@NotNull
	@NotBlank
	private BigDecimal valor;
	
}
