package GrupalJSP.Grupal6JSP.modelos.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//import Javitasforever.Grupal6JSP.modelos.DAO.CapacitacionDAOImpl;
import GrupalJSP.Grupal6JSP.modelos.entity.Capacitaciones;
import GrupalJSP.Grupal6JSP.repositorios.ICapacitacionesRepository;
/*
 * En la capa  SERVICE va  toda la logica de negocio
 */
@Service
public class CapacitacionService {
    
   @Autowired 
	//recuerda import IcapacitacionesReposytory
	private ICapacitacionesRepository capacitRepo;	
    public CapacitacionService() {
         super();
    }
   
    public List<Capacitaciones> getAll(){
	
	return capacitRepo.findAll();
    }
    
   
    
    public Capacitaciones getOne(int id) {
        return capacitRepo.getOne(id);
        }
    
    public void create(Capacitaciones c) {
    	capacitRepo.save(c);
    }
    
    public void update(Capacitaciones c) {
    	capacitRepo.save(c);
    }
    
    public void delete(int id) {
    	capacitRepo.delete(capacitRepo.getOne(id));
    }
}