package com.pfe.projet.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pfe.projet.repositories.DemandeRepository;
import com.pfe.projet.service.DemandeService;

@Service
public class DemandeServiceImpl implements DemandeService {

	@Autowired
    private DemandeRepository demandeRepository;	
	@Override
	public Demande createDemande(Demande d) {
		return demandeRepository.save(d);
	}

	@Override
	public Demande getByIdDemande(Integer id) {
		return demandeRepository.getOne(id);
	}

	@Override
	public List<Demande> getAll() {
	
		return (List<Demande>)demandeRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		try {
			demandeRepository.deleteById(id);
			}
			catch (Exception e) {
				System.out.println("id introuvable");
			}
		
	}

	@Override
	public Demande editDemande(Demande d) {
		
		return demandeRepository.save(d);
	}

}
