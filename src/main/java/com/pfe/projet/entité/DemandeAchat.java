package com.pfe.projet.entité;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class DemandeAchat {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String objet;
	private String beneficiare;
	private String centre_cout;
	private String budjet_prevu; 
	private String fournisseur; 
	private String modalite_payement;
	private Integer degre_urgence;
    	

}
