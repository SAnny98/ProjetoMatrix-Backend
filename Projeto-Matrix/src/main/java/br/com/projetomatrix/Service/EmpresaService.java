package br.com.projetomatrix.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.projetomatrix.Model.Empresa;
import br.com.projetomatrix.Repository.EmpresaRepository;


@Service
public class EmpresaService {

@Autowired

private EmpresaRepository empresaRepository;
  

public Empresa cadastrar (Empresa empresa) {
	  return empresaRepository.save(empresa);
	}
	
	public Empresa atualizar ( Empresa empresa) {
    return empresaRepository.save(empresa);
	
	}
  public List<Empresa> listar() {
    return empresaRepository.findAll();
  }
  
  public Empresa buscar (Long Id) {
		return empresaRepository.findById(Id).get();
	}
	public void delete (Long Id) {
	   empresaRepository.deleteById(Id);
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
