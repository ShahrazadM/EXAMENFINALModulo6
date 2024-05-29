package GrupalJSP.Grupal6JSP.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import GrupalJSP.Grupal6JSP.modelos.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

}
