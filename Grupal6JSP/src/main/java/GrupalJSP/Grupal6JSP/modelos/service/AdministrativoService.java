package GrupalJSP.Grupal6JSP.modelos.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GrupalJSP.Grupal6JSP.modelos.entity.Administrativo;
import GrupalJSP.Grupal6JSP.repositorios.IAdministrativoRepository;

@Service
public class AdministrativoService {

    @Autowired 
    private IAdministrativoRepository admiRepo;
    
    public List<Administrativo> getAll() {
        return admiRepo.findAll();
    }

    public Administrativo getOne(int id) {
    	return admiRepo.findById(id).orElse(null); // Utilizamos findById con orElse(null) para manejar el caso en que no se encuentre el administrativo.
    }

    public void create(Administrativo ad) {
        admiRepo.save(ad);
    }

    public void update(Administrativo ad) {
        admiRepo.save(ad);
    }

    public void delete(int id) {
        admiRepo.deleteById(id); // Utilizamos deleteById para eliminar el administrativo por su ID.
    }
}