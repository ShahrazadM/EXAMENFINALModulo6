package GrupalJSP.Grupal6JSP.modelos.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	
	
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "listadochequeos")
	public class listadochequeos {

	    @Id
	   
	    @Column(name = "id")
	    private int id;

	    @Column(name = "idVisita")
	    private int idVisita;

	   
	    private String fechaChequeo;

	   
	    private String horaChequeo;

	    
	    private String resultado;

	   
	    private String observaciones;

	    public listadochequeos() {
	        super();
	    }

	    public listadochequeos(int idVisita, String fechaChequeo, String horaChequeo, String resultado, String observaciones) {
	        this.idVisita = idVisita;
	        this.fechaChequeo = fechaChequeo;
	        this.horaChequeo = horaChequeo;
	        this.resultado = resultado;
	        this.observaciones = observaciones;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getIdVisita() {
	        return idVisita;
	    }

	    public void setIdVisita(int idVisita) {
	        this.idVisita = idVisita;
	    }

	    public String getFechaChequeo() {
	        return fechaChequeo;
	    }

	    public void setFechaChequeo(String fechaChequeo) {
	        this.fechaChequeo = fechaChequeo;
	    }

	    public String getHoraChequeo() {
	        return horaChequeo;
	    }

	    public void setHoraChequeo(String horaChequeo) {
	        this.horaChequeo = horaChequeo;
	    }

	    public String getResultado() {
	        return resultado;
	    }

	    public void setResultado(String resultado) {
	        this.resultado = resultado;
	    }

	    public String getObservaciones() {
	        return observaciones;
	    }

	    public void setObservaciones(String observaciones) {
	        this.observaciones = observaciones;
	    }
	}