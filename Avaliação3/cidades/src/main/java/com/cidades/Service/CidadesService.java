package com.cidades.Service;

import org.springframework.stereotype.Service;

import com.cidades.Entities.Cidades;
import com.cidades.Repository.CidadesRepository;


@Service
public class CidadesService {
	private final CidadesRepository cidadesRepository;
	
	public CidadesService(CidadesRepository cidadesRepository) {
		this.cidadesRepository = cidadesRepository;
	}
	
	public Cidades saveCidades(Cidades cidades) {
		return cidadesRepository.save(cidades);
	}
	
	public Cidades getById(Long id) {
		return cidadesRepository.findById(id).orElse(null);
	}
    public List<cidades> (Cidades cidades) {
    	return cidadesRepository.findAll(cidades);
    }

	public Cidades alteraCidade(Long id, cidades, alteraCidade) {
		Optional<Cidades> existeCidade = cidadesRepository.findById(id);
		if(existeCidade.isPresent) {
			cidadesRepository.setId(id);
			return cidadesRepository.save(alteraCidade);
		}
		else {
			return null;
		}
	
	}
	public boolean deleteCidade(Long id, cidades, deleteCidade) {
		Optional<cidades> existeCidade = cidadesRepository.findById(id);
		if(existeCidade.isPresent) {
			cidadesRepository.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}
	
}


