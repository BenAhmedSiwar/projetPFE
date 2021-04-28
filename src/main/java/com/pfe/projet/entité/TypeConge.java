package com.pfe.projet.entité;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TypeConge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String conge_annuel;
	private String conge_maladie;
	private String conge_maternite;
	private String conge_du_retard;
	

}
