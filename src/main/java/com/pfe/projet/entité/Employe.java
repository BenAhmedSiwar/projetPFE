package com.pfe.projet.entité;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer matricule;
    private String nom; 	
    private String prenom; 
    private String poste; 
    private String sup_hier; 
    private String departement; 
    private Long cin; 
    private String email; 
    private String mot_passe;
    private Integer photo;
    private String role;
    private Date date_naissance;
    private String lieu_naissance;
    private String etat_civil;
    private String nombre_enfant;
    private String nationnalite;
    private String adresse;
    private Integer code_postal;
    private Long telephone_mobile;
    private Long autre_tel;
    private String nom_prenom_accident;
    private Long telephone_accident;
    private String theme_memoire;
    private String projet_fin_etude;
    private Date debut_primaire;
    private Date fin_primaire;
    private String etablissment_primaire;
    private String diplome_primaire;
    private Date debut_sec;
    private Date fin_sec;
    private String etablissment_sec;
    private String diplome_sec;
    private Date debut_sup;
    private Date fin_sup;
    private String etablissment_sup;
    private String diplome_sup;
    private Date debut_for_pro;
    private Date fin_for_pro;
    private String etablissment_for_pro;
    private String diplome_for_pro;
    private Date debut_autre;
    private Date fin_autre;
    private String etablissment_autre;
    private String diplome_autre;
    private String ecrit_arabe;
    private String oral_et_lu_arabe;
    private String parle_arabe;
    private String ecrit_fr;
    private String oral_et_lu_fr;
    private String parle_fr;
    private String ecrit_ang;
    private String oral_et_lu_ang;
    private String parle_ang;
    private String ecrit_observ;
    private String oral_et_lu_observ;
    private String parle_observ;
    private String soc1;
    private String soc2;
    private String soc3;
    private String service1;
    private String service2;
    private String service3;
    private String periode1;
    private String periode2;
    private String periode3;
    private String sim1;
    private String sim2;
    private String sim3;
    private String sim4;
    private String sim5;
    private String cab1;
    private String cab2;
    private String cab3;
    private String cab4;
    private String cab5;
    private Date date1;
    private Date date2;
    private Date date3;
    private Date date4;
    private Date date5;
    private Date lieu1;
    private Date lieu2;
    private Date lieu3;
    private Date lieu4;
    private Date lieu5;
    private Date periodeDate;
    private Date periodeDate2;
    private Date periodeDate3;
    private Integer der_sal;
    private Integer der_sal2;
    private Integer der_sal3;
    private String societe1;
    private String societe2;
    private String societe3;
    private String fonc_occ1;
    private String fonc_occ2;
    private String fonc_occ3;
    private String raison_dep1;
    private String raison_dep2;
    private String raison_dep3;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
