package GrupalJSP.Grupal6JSP.modelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GrupalJSP.Grupal6JSP.modelos.entity.Visitaterreno;
import GrupalJSP.Grupal6JSP.repositorios.IVisitaTerrenoRepository;

	@Service
	public class VisitaService {
		 @Autowired 
			//recuerda import IUsuarioReposytory
			private IVisitaTerrenoRepository visRepo;	
		    public VisitaService() {
		         super();
		    }
	    
	    
		    public List<Visitaterreno> getAll(){
		    	
		    	return visRepo.findAll();
		        }
		        
		       
		        
		        public Visitaterreno getOne(int id) {
		            return visRepo.getOne(id);
		            }
		        
		        public void create(Visitaterreno vis) {
		        	visRepo.save(vis);
		        }
		        
		        public void update(Visitaterreno vis) {
		        	visRepo.save(vis);
		        }
		        
		        public void delete(int id) {
		        	visRepo.delete(visRepo.getOne(id));
		        }
		    }