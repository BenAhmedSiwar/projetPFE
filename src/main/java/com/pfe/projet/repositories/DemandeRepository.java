package com.pfe.projet.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pfe.projet.entité.Demande;

@Repository
public interface DemandeRepository extends JpaRepository<Demande, Integer> {

}
