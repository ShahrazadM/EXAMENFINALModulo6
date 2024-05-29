package GrupalJSP.Grupal6JSP.modelos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Fila que represta una tabla en la base de datos grupo51
@Entity                  //Entidad que represnta una tbla en una base de datos.
@Table(name="capacitaciones") // para identificar el nombre de la tabla a la que representa Capacitaciones.
public class Capacitaciones {
	
	@Id
	@Column(name="id")
	
	private int id;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;
	
	public Capacitaciones() {
    	super();
    }
	
	// Constructor con parametros
	public Capacitaciones(int id, int rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadAsistentes) {
		
		this.id = id;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	
	// Métodos de acceso (getters y setters) para los atributos
	

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	

	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getDia() {
		return dia;
	}
	

	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getHora() {
		return hora;
	}
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
}