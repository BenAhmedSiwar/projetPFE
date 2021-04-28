package com.pfe.projet.entité;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
public class DemandeSortie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date datePrevue;

    private Date dateEffctive;

    private String heureSortie;

    private Date dateActuel;

    private String motif;

}
