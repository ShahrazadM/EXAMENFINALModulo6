package GrupalJSP.Grupal6JSP.modelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GrupalJSP.Grupal6JSP.modelos.entity.Contacto;
import GrupalJSP.Grupal6JSP.repositorios.IContactoRepository;

	@Service
	public class ContactoService {
		 @Autowired 
			//recuerda import IUsuarioReposytory
			private IContactoRepository contRepo;	
		    public ContactoService() {
		         super();
		    }
	    
	    
		    public List<Contacto> getAll(){
		    	
		    	return contRepo.findAll();
		        }
		        
		       
		        
		        public Contacto getOne(int id) {
		            return contRepo.getOne(id);
		            }
		        
		        public void create(Contacto cont) {
		        	contRepo.save(cont);
		        }
		        
		        public void update(Contacto usu) {
		        	contRepo.save(usu);
		        }
		        
		        public void delete(int id) {
		        	contRepo.delete(contRepo.getOne(id));
		        }
		    }