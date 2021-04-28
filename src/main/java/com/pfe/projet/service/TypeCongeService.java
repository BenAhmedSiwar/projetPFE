package com.pfe.projet.service;

import java.util.List;
import com.pfe.projet.entité.TypeConge;

public interface TypeCongeService {
	TypeConge createTypeConge(TypeConge tc);
	TypeConge getbyId(Integer id);
    List<TypeConge> getAll();
    void deleteById(Integer id);
    TypeConge editTypeConge(TypeConge tc);
}
