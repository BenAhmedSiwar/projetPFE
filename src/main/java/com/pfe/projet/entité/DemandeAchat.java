package com.pfe.projet.entité;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

import java.util.Date;

@Entity
@Data
public class DemandeAchat {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	private Date dateDemande;

	private String objet;

	private String beneficiare;

	private Double coutMin;

	private Double coutMax;

	private Double budgetPrevu;

	private String fournisseur;

	private String modalitePayement;

	private Integer degreUrgence;
    	

}
