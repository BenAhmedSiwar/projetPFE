package com.pfe.projet.service;
import java.util.List;


public interface DemandeService {
	Demande createDemande (Demande d);
	Demande getByIdDemande (Integer id);
	List<Demande> getAll();
	void deleteById(Integer id);
	Demande editDemande(Demande d);
}
