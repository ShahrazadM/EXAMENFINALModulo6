package GrupalJSP.Grupal6JSP.modelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GrupalJSP.Grupal6JSP.modelos.entity.Cliente;
import GrupalJSP.Grupal6JSP.repositorios.IClienteRepository;

	@Service
	public class ClienteService {

	    @Autowired 
	    private IClienteRepository clienRepo;
	    
	    public List<Cliente> getAll() {
	        return clienRepo.findAll();
	    }

	    public Cliente getOne(int id) {
	    	return clienRepo.findById(id).orElse(null); // Utilizamos findById con orElse(null) para manejar el caso en que no se encuentre el administrativo.
	    }

	    public void create(Cliente cli) {
	    	clienRepo.save(cli);
	    }

	    public void update(Cliente cli) {
	    	clienRepo.save(cli);
	    }

	    public void delete(int id) {
	    	clienRepo.deleteById(id); // Utilizamos deleteById para eliminar el cliente por su ID.
	    }
	}