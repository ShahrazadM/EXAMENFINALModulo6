package GrupalJSP.Grupal6JSP.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import GrupalJSP.Grupal6JSP.modelos.entity.listadochequeos;

public interface IChequeosRepository extends JpaRepository<listadochequeos, Integer> {

}