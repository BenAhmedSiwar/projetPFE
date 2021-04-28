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
import com.pfe.projet.entité.TypeConge;
import com.pfe.projet.service.TypeCongeService;

@RestController
public class TypeCongeController {
@Autowired
public TypeCongeService typeCongeService;
@PostMapping("TypeConge")
public Object CreateDemandeConge(@RequestBody TypeConge tc)
{
     tc = typeCongeService.createTypeConge(tc);
	return ResponseEntity.status(HttpStatus.FOUND).body(tc);
 
}
@GetMapping("TypeConge/{id}")
public Object getbYId(@PathVariable("id") Integer idds)
{
    TypeConge tc = typeCongeService.getbyId(idds);
    return  ResponseEntity.status(HttpStatus.FOUND).body(tc);
}
@GetMapping("TypeConge")
public Object getAll()
{
    List<TypeConge> listds = typeCongeService.getAll();
    return  ResponseEntity.status(HttpStatus.FOUND).body(listds);
}

@DeleteMapping("TypeConge/{id}")
public void deleteByid(@PathVariable Integer id)
{
	deleteByid(id);
}

@PostMapping("TypeConge")
public Object editTypeConge(@RequestBody TypeConge tc)
{
    tc = typeCongeService.editTypeConge(tc);
    return  ResponseEntity.status(HttpStatus.FOUND).body(tc);
}


}
