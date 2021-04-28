package com.pfe.projet.entité;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Reponse {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Date date_rep;
private String type_rep;
private String remarque;
private String contenu;


}
