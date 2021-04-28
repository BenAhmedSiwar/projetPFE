package com.pfe.projet.entité;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import java.util.Date;

@Entity
@Data
public class DemandeFormation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;

	private Date dateDemande;

	 private String foramtionDemandee;
	 private String objectifs;
	 private String populationCible;

	 private String duree;

	 private String nomFormateur;

	 private String posteFormateur;

	 private String nomOrganisme;

	 private Float fraisFormation;

	 private String modeFinancement;

	 private String observations;

	 private String typeFormation;
}
