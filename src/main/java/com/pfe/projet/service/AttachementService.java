package com.pfe.projet.service;
import java.util.List;
import com.pfe.projet.entité.Attachement;

public interface AttachementService {
	Attachement CreateAttachement (Attachement att);
	Attachement GetByIdAttachement (Integer id);
	List<Attachement> GetAll();
	void DeleteById(Integer id);
	Attachement EditAttachement(Attachement att);
}
