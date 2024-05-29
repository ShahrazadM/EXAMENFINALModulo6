package GrupalJSP.Grupal6JSP.modelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GrupalJSP.Grupal6JSP.modelos.entity.Listapagos;
import GrupalJSP.Grupal6JSP.repositorios.IPagosRepository;


	@Service
	public class PagosService {
		 @Autowired 
			//recuerda import IUsuarioReposytory
			private IPagosRepository pagRepo;	
		    public PagosService() {
		         super();
		    }
	    
	    
		    public List<Listapagos> getAll(){
		    	
		    	return pagRepo.findAll();
		        }
		        
		       
		        
		        public Listapagos getOne(int id) {
		            return pagRepo.getOne(id);
		            }
		        
		        public void create(Listapagos listpag) {
		        	pagRepo.save(listpag);
		        }
		        
		        public void update(Listapagos listpag) {
		        	pagRepo.save(listpag);
		        }
		        
		        public void delete(int id) {
		        	pagRepo.delete(pagRepo.getOne(id));
		        }
		    }
