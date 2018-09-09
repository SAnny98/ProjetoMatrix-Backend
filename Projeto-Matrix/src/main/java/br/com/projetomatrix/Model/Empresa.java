package br.com.projetomatrix.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	private Long Id;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String nomeResponsavel;
	@NotEmpty
	private String contato;
	@NotEmpty
	@Column(length = 14)
	private String cnpj;
	@OneToMany
	@JoinColumn(name = "empresa_id")
	private List<Lançamento> lancamento;

}
