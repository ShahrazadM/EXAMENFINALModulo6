package GrupalJSP.Grupal6JSP.modelos.service;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import GrupalJSP.Grupal6JSP.modelos.entity.Usuario;
	import GrupalJSP.Grupal6JSP.repositorios.IUsuarioRepository;

	@Service
	public class UsuarioService {
		 @Autowired 
			//recuerda import IUsuarioReposytory
			private IUsuarioRepository usuarRepo;	
		    public UsuarioService() {
		         super();
		    }
	    
	    
		    public List<Usuario> getAll(){
		    	
		    	return usuarRepo.findAll();
		        }
		        
		       
		        
		        public Usuario getOne(int id) {
		            return usuarRepo.getOne(id);
		            }
		        
		        public void create(Usuario usu) {
		        	usuarRepo.save(usu);
		        }
		        
		        public void update(Usuario usu) {
		        	usuarRepo.save(usu);
		        }
		        
		        public void delete(int id) {
		        	usuarRepo.delete(usuarRepo.getOne(id));
		        }
		    }