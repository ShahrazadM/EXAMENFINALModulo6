package GrupalJSP.Grupal6JSP.modelos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Fila que represta una tabla en la base de datos grupo51
@Entity                  //Entidad que represnta una tabla en una base de datos.
@Table(name="usuarios") // para identificar el nombre de la tabla a la que representa Capacitaciones.

	public class Usuario {
	    
	@Id
	@Column(name="id")
		private int id;
	    private String nombre;
	    private String fechaNacimiento;
	    private int run;

	    
	    public Usuario() {
    	super(); // Constructor vacío
    }
	    public Usuario( int id, String nombre, String fechaNacimiento, int run) {
	        this.id = id;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.run = run;
	    }
	 // Getters y setters
	    

	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getFechaNacimiento() {
	        return fechaNacimiento;
	    }

	    public void setFechaNacimiento(String fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    public int getRun() {
	        return run;
	    }

	    public void setRun(int run) {
	        this.run = run;
	    }
	}
	    
	

