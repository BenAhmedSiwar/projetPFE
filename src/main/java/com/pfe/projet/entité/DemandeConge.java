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
	    private String adresse_Conge; 	
	    private Date debut_conge;
	    private Date fin_conge;
	    private Integer nbr_retard;
	    private Integer nbr_tolere;
	    private Integer nbr_justifie;
	    private String type_conge;
	    private Integer nbr_jours;
	    private String mois;
	    private Integer annee_ref;
	    private Integer nbr_jours_restant;
	    private Integer nbr_jours_pris;
	    private Integer nbr_jours_a_prendre;
	    private Integer nbr_jours_maladie;
	    private Integer conge_reccup;
}
