package com.pfe.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.projet.service.DemandeService;

@RestController
public class DemandeController {
	@Autowired
	public DemandeService demandeService ;
	
	@PostMapping ("Demande")
	public Object createDemande (Demande d) {
		d = demandeService.createDemande(d);
		return  ResponseEntity.status(HttpStatus.FOUND).body(d);	
	}
	@GetMapping ("Demande/{id}")
	public Object getById (@PathVariable("id") Integer ids) {
		 Demande da = demandeService.getByIdDemande(ids);
		 return  ResponseEntity.status(HttpStatus.FOUND).body(da);	
	}
	@GetMapping("Demande")
    public Object getAll()
    {
        List<Demande> listda = demandeService.getAll();
        return  ResponseEntity.status(HttpStatus.FOUND).body(listda);
    }
	 @DeleteMapping("Demande/{id}")
	    public void deleteByid(@PathVariable Integer id)
	    {
	    	deleteByid(id);
	    }
	    
	    @PostMapping("Demande")
	    public Object editDemande(@RequestBody Demande d)
	    {
	        d = demandeService.editDemande(d);
	        return  ResponseEntity.status(HttpStatus.FOUND).body(d);
	    }

	

}
