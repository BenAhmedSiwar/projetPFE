package com.pfe.projet.entité;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private Integer image;
private Float prix;
private String motif;


}
