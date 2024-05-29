
package GrupalJSP.Grupal6JSP.modelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GrupalJSP.Grupal6JSP.modelos.entity.listadochequeos;
import GrupalJSP.Grupal6JSP.repositorios.IChequeosRepository;

@Service
public class ChequeosService {

    @Autowired
    private IChequeosRepository chequeosRepo;

    public List<listadochequeos> getAll() {
        return chequeosRepo.findAll();
    }

    public listadochequeos getById(int id) {
        return chequeosRepo.findById(id).orElse(null);
    }

    public void create(listadochequeos chequeo) {
        chequeosRepo.save(chequeo);
    }

    public void update(listadochequeos chequeo) {
        chequeosRepo.save(chequeo);
    }

    public void delete(int id) {
        chequeosRepo.deleteById(id);
    }
}
