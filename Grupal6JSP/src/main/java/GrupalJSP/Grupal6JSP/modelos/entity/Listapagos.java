package GrupalJSP.Grupal6JSP.modelos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="listapagos")
	public class Listapagos {

	    @Id
	     @Column(name="id")
	    private int id;
	    
	    
	    private int rutCliente;
	    
	   
	    private String nombre;
	    
	    
	    private String apellido;
	    
	    
	    private int numeroCuotas;
	    
	    
	    private int montoPago;

	    public Listapagos() {
	        super();
	    }

	    public Listapagos( int id, int rutCliente, String nombre, String apellido, int numeroCuotas, int montoPago) {
	        
	    	this.id= id;
	    	this.rutCliente = rutCliente;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.numeroCuotas = numeroCuotas;
	        this.montoPago = montoPago;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getRutCliente() {
	        return rutCliente;
	    }

	    public void setRutCliente(int rutCliente) {
	        this.rutCliente = rutCliente;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public int getNumeroCuotas() {
	        return numeroCuotas;
	    }

	    public void setNumeroCuotas(int numeroCuotas) {
	        this.numeroCuotas = numeroCuotas;
	    }

	    public double getMontoPago() {
	        return montoPago;
	    }
	    public void setMontoPago(int montoPago) {
	        this.montoPago = montoPago;
	    }
	}
