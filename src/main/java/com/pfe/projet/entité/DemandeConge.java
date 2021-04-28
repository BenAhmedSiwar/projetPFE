package com.pfe.projet.entité;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class DemandeConge {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;


	    private String adresseConge;

	    private Date debutConge;

	    private Date finConge;

	    private Integer nbrRetard;

	    private Integer nbrTolere;

	    private Integer nbrJustifie;

	    private String typeConge;

	    private Integer nbrJours;

	    private String mois;

	    private Integer annee_ref;

	    private Integer nbr_jours_restant;

	    private Integer nbr_jours_pris;

	    private Integer nbr_jours_a_prendre;

	    private Integer nbr_jours_maladie;

	    private Integer conge_reccup;
}
