package GrupalJSP.Grupal6JSP.modelos.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

//Fila que represta una tabla en la base de datos grupo51
@Entity                  //Entidad que represnta una tbla en una base de datos.
@Table(name="administrativo") // para identificar el nombre de la tabla a la que representa Capacitaciones.


public class Administrativo  {
	@Id
	@Column(name="id")
	
	private int id;
   
    private String area;
   
    private String experiencia;
  
    private int clave;
	
	
	
	
	
	public Administrativo() {
    	super();
    }
	
	// Constructor con parámetros
	public Administrativo( int id, String area, String experiencia, int clave) {
		this.id = id;
		this.area = area;
		this.experiencia = experiencia;
		this.clave = clave;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
}