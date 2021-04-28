package com.pfe.projet.entité;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BonCommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num_bon;
	private Date date_bon;
	private Long fax;
	private Long telephone;
	private String mode_expedition;
	private Date delai_livraison;
	private String devise;
	private Integer qte;
	private Integer designation;
	private Integer PU_HTVA;
	private Integer PT_HTVA;
	private Integer Taux_TVA;
}
