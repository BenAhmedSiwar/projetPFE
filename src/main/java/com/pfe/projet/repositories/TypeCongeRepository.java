package com.pfe.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.projet.entité.TypeConge;

@Repository
public interface TypeCongeRepository extends JpaRepository<TypeConge, Integer> {

}
