package com.pfe.projet.entité;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DemandeFormation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 private String foramtion_demandee;
	 private String objectifs;
	 private String population_cible;
	 private String duree; 
	 private String nom_form;
	 private String poste_form;
	 private String nom_organisme;
	 private Integer frais_form;
	 private String mode_financement;
	 private String observations;
	 private String type_form;
}
