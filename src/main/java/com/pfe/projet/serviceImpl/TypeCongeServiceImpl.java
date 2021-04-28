package com.pfe.projet.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.projet.entité.TypeConge;
import com.pfe.projet.repositories.TypeCongeRepository;
import com.pfe.projet.service.TypeCongeService;

@Service 
public class TypeCongeServiceImpl implements TypeCongeService {

	@Autowired
    private TypeCongeRepository typeCongeRepository;	
	@Override
	public TypeConge createTypeConge(TypeConge tc) {
		return typeCongeRepository.save(tc);
	}

	@Override
	public TypeConge getbyId(Integer id) {
		
		return typeCongeRepository.getOne(id);
	}

	@Override
	public List<TypeConge> getAll() {
		return ( List<TypeConge> ) typeCongeRepository.findAll();
		}

	@Override
	public void deleteById(Integer id) {
		try {
			typeCongeRepository.deleteById(id);;
			}
			catch (Exception e) {
				System.out.println("id introuvable");
			}
		
	}

	@Override
	public TypeConge editTypeConge(TypeConge tc) {
		return typeCongeRepository.save(tc);
	}



}
