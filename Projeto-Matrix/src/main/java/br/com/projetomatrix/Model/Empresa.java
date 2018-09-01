package br.com.projetomatrix.Model;

import javax.persistence.Column;
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
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Id;
	@NotNull
	@NotBlank
	private String nome;
	@NotNull
	@NotBlank
	private String nomeResponsavel;
	@NotNull
	@NotBlank
	private String contato;
	@NotNull
	@NotBlank
	@Column(length=14) 
	private String cnpj;

}
