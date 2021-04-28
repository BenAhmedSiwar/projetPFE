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
import com.pfe.projet.entité.DemandeFormation;
import com.pfe.projet.service.DemandeFormationService;

@RestController
public class DemandeFormationController {
	@Autowired
	public DemandeFormationService demandeFormationService ;
	@PostMapping("DemandeFormation")
	public Object createDemandeFormation (@RequestBody DemandeFormation df) {
		df = demandeFormationService.CreateDemandeFormation(df);
				return  ResponseEntity.status(HttpStatus.FOUND).body(df);
	}
	@GetMapping ("DemandeFormation/{id}")
	public Object getById (@PathVariable("id") Integer ids) {
		 DemandeFormation df = demandeFormationService.GetByIdDemandeFormation(ids);
		 return  ResponseEntity.status(HttpStatus.FOUND).body(df);	
	}
	@GetMapping("DemandeFormation")
    public Object getAll()
    {
        List<DemandeFormation> listda = demandeFormationService.GetAll();
        return  ResponseEntity.status(HttpStatus.FOUND).body(listda);
    }
	 @DeleteMapping("DemandeAchat/{id}")
	    public void deleteByid(@PathVariable Integer id)
	    {
	    	deleteByid(id);
	    }
	    
	    @PostMapping("DemandeSortie")
	    public Object editDemandeFormation(@RequestBody DemandeFormation df)
	    {
	        df = demandeFormationService.EditDemandeFormation(df);
	        return  ResponseEntity.status(HttpStatus.FOUND).body(df);
	    }

	
	
}
