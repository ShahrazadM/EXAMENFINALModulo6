package GrupalJSP.Grupal6JSP.modelos.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name="id")
	private int id;
    private int rut;
    private String nombres;

    private String apellidos;

   
    private String telefono;

    
    private String afp;


    private int sistema_salud;

   
    private String direccion;

   
    private String comuna;

   
    private int edad;

   
    private int clave;

    // Constructores, getters y setters

    public Cliente() {
    }

    public Cliente(int id, int rut, String nombres, String apellidos, String telefono, String afp, int sistema_salud,
            String direccion, String comuna, int edad, int clave) {
       this.id = id;
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistema_salud = sistema_salud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
        this.clave = clave;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistema_salud() {
		return sistema_salud;
	}

	public void setSistema_salud(int sistema_salud) {
		this.sistema_salud = sistema_salud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

   }